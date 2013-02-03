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
import fr.eyal.lib.data.model.ResponseBusinessObject;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.model.BusinessResponse;
import fr.eyal.lib.data.service.model.DataLibRequest;

public class Top100Fragment extends NetflixFragment implements OnScrollListener {

	GridView mGridView;
	Top100Adapter mAdapter;
	SparseArray<ItemTop100> mPendingItem;
	ArrayList<ItemTop100> mPendingItemCache;
	int mScrollState;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		mAdapter = new Top100Adapter(this);
		mPendingItem = new SparseArray<ItemTop100>();
		mPendingItemCache = new ArrayList<ItemTop100>();
		super.onCreate(savedInstanceState);
		
		try {
			int requestId = mDataManager.getTop100(DataManager.TYPE_CACHE_THEN_NETWORK, this, DataLibRequest.OPTION_NO_OPTION);
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
	
	
	/**
	 * Ask to download the movie's poster
	 * 
	 * @param item
	 */
	public void getMoviePoster(ItemTop100 item){
		
		if(mScrollState == OnScrollListener.SCROLL_STATE_FLING)
			return;
				
		synchronized (mPendingItemCache) {
			//we set the request type
			int type = DataManager.TYPE_NETWORK;
			if(item.image != null)
				type = DataManager.TYPE_CACHE;

			if(type == DataManager.TYPE_CACHE && mPendingItemCache.contains(item)){
				return;
			}
		
			try {
				int requestId = mDataManager.getMovieImage(type, this, item.getImageUrl(), DataLibRequest.OPTION_NO_OPTION);
				mRequestIds.add(requestId);
				mPendingItem.append(requestId, item);

				if(type == DataManager.TYPE_CACHE){
					mPendingItemCache.add(item);	
				}

			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/*
	 * OnDataListener management
	 */
	
	@Override
	public void onCacheRequestFinished(int requestId, ResponseBusinessObject response) {
		
		if(response instanceof Top100){
			updateTop100((Top100) response);			
			
		} else if(response instanceof MovieImage){
			ItemTop100 item = updateTop100Image(requestId, (MovieImage) response);
			
			if(item != null){
				synchronized (mPendingItemCache) {
					mPendingItemCache.remove(item);
				}
			}

		}		
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
			updateTop100((Top100) response.response);
			break;
			
		case NetflixService.WEBSERVICE_MOVIEIMAGE:
			updateTop100Image(requestId, (MovieImage) response.response);
			break;

		default:
			break;
		}
	}

	/*
	 * Content update
	 */
	
	/**
	 * Update the movies list
	 * 
	 * @param response the {@link Top100} content
	 */
	private void updateTop100(Top100 response) {
		mAdapter.mArray = response.itemTop100;
		mAdapter.notifyDataSetChanged();
	}


	/**
	 * Update the movie image
	 * 
	 * @param requestId the request id to find the corresponding movie item
	 * @param response the {@link MovieImage} received
	 * 
	 * @return the {@link ItemTop100} item concerned by the updating or null if it is not found
	 */
	private ItemTop100 updateTop100Image(int requestId, MovieImage response) {
		//we update the object
		ItemTop100 item = mPendingItem.get(requestId);
		if(item == null || response == null)
			return null;
		item.image = response;
		//we update the current displayed list
		mAdapter.updatePoster(item);
		mPendingItem.remove(requestId);
		return item;
	}

	
	/*
	 * Scroll management
	 */
	
	@Override
	public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
	}

	@Override
	public  void  onScrollStateChanged(AbsListView view, int scrollState) {
			
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
							Bitmap bitmap = item.getPoster();
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
