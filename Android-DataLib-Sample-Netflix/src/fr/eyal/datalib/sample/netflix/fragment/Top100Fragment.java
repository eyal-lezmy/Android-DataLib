package fr.eyal.datalib.sample.netflix.fragment;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.GridView;
import fr.eyal.datalib.sample.netflix.R;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.data.model.top100.ItemTop100;
import fr.eyal.datalib.sample.netflix.data.model.top100.Top100;
import fr.eyal.datalib.sample.netflix.data.service.NetflixService;
import fr.eyal.datalib.sample.netflix.fragment.Top100Adapter.ItemViewHolder;
import fr.eyal.lib.data.model.ResponseBusinessObjectDAO;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.model.BusinessResponse;
import fr.eyal.lib.data.service.model.DataLibRequest;

public class Top100Fragment extends NetflixFragment implements OnScrollListener {

	GridView mGridView;
	Top100Adapter mAdapter;
	SparseArray<ItemTop100> mPendingNewRleases;
	int mScrollState;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		mAdapter = new Top100Adapter(this);
		mPendingNewRleases = new SparseArray<ItemTop100>();
		super.onCreate(savedInstanceState);
		
		try {
			int requestId = mDataManager.getTop100(DataManager.TYPE_NETWORK, this, DataLibRequest.OPTION_NO_OPTION);
			mRequestIds.add(requestId);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		if(container != null)
			mGridView = (GridView) inflater.inflate(R.layout.fgmt_new, container, true);
		else
			mGridView = (GridView) inflater.inflate(R.layout.fgmt_new, container);
		
		View emptyView = inflater.inflate(R.layout.empty_grid, null);
		mGridView.setEmptyView(emptyView);
		mGridView.setAdapter(mAdapter);
//		mGridView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
		mGridView.setOnScrollListener(this);
		
		return mGridView;
	}
	
	
	public void getMoviePoster(ItemTop100 item){
		
		if(mScrollState == OnScrollListener.SCROLL_STATE_FLING)
			return;
		
		try {
			int requestId = mDataManager.getMovieImage(this, item.getImageUrl(), DataLibRequest.OPTION_NO_OPTION);
			mRequestIds.add(requestId);
			mPendingNewRleases.append(requestId, item);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onCacheRequestFinished(ResponseBusinessObjectDAO response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDataFromDatabase(int code, ArrayList<?> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRequestFinished(int requestId, boolean suceed, BusinessResponse response) {
		if(!suceed)
			return;
		
		switch (response.webserviceType) {

		case NetflixService.WEBSERVICE_TOP100:
			Top100 newReleases = (Top100) response.response;
			mAdapter.mArray = newReleases.itemTop100;
			mAdapter.notifyDataSetChanged();
			break;
			
		case NetflixService.WEBSERVICE_MOVIEIMAGE:
			//we update the object
			ItemTop100 item = mPendingNewRleases.get(requestId);
			MovieImage image = (MovieImage) response.response;
			item.image = image.image;
			item.imagePath = image.imagePath;
			//we update the current displayed list
			mAdapter.updatePoster(item);
			break;

		default:
			break;
		}
		
	}

	@Override
	public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
	}

	@Override
	public  void  onScrollStateChanged(AbsListView view, int scrollState) {
//		if(scrollState == OnScrollListener.SCROLL_STATE_FLING)
//			mGridView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
//		else
//			mGridView.setLayerType(View.LAYER_TYPE_NONE, null);
			
		//if the list finish a fling
		if(mScrollState == OnScrollListener.SCROLL_STATE_FLING && scrollState != mScrollState){
			mScrollState = scrollState;
			
			int first = mGridView.getFirstVisiblePosition();
			int size = mGridView.getChildCount();
			for (int i = 0; i < size; i++) {
				ItemTop100 item = (ItemTop100) mAdapter.getItem(first+i);
				
				if(item != null){
					View v = mGridView.getChildAt(i);
					if(v != null){
						Top100Adapter.ItemViewHolder holder = (ItemViewHolder) v.getTag();
						if(holder != null){
							Bitmap bitmap = item.getPoster(getActivity());
							if(bitmap != null)
								holder.image.setImageBitmap(bitmap);
							else
								getMoviePoster(item);
						}
					}
				}

			}
		}
		
		mScrollState = scrollState;
	}
}
