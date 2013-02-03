package fr.eyal.datalib.sample.netflix.fragment;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import fr.eyal.datalib.sample.netflix.R;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.data.model.newreleases.ItemNewRelease;
import fr.eyal.datalib.sample.netflix.data.model.newreleases.NewReleases;
import fr.eyal.datalib.sample.netflix.data.service.NetflixService;
import fr.eyal.lib.data.model.ResponseBusinessObject;
import fr.eyal.lib.data.model.ResponseBusinessObjectDAO;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.model.BusinessResponse;
import fr.eyal.lib.data.service.model.DataLibRequest;
import android.app.Fragment;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ScrollView;

public class NewFragment extends NetflixFragment {

	GridView mGridView;
	NewReleasesAdapter mAdapter;
	SparseArray<ItemNewRelease> mPendingNewRleases;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		mAdapter = new NewReleasesAdapter(this);
		mPendingNewRleases = new SparseArray<ItemNewRelease>();
		super.onCreate(savedInstanceState);
		
		try {
			int requestId = mDataManager.getNewReleases(DataManager.TYPE_NETWORK, this, DataLibRequest.OPTION_NO_OPTION);
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
		return mGridView;
	}
	
	
	public void getMoviePoster(ItemNewRelease item){
		try {
			int requestId = mDataManager.getMovieImage(DataManager.TYPE_NETWORK, this, item.getImageUrl(), DataLibRequest.OPTION_NO_OPTION);
			mRequestIds.add(requestId);
			mPendingNewRleases.append(requestId, item);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onCacheRequestFinished(int requestId, ResponseBusinessObject response) {
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

		case NetflixService.WEBSERVICE_NEWRELEASES:
			NewReleases newReleases = (NewReleases) response.response;
			mAdapter.mArray = newReleases.itemNewRelease;
			mAdapter.notifyDataSetChanged();
			break;
			
		case NetflixService.WEBSERVICE_MOVIEIMAGE:
			//we update the object
			ItemNewRelease item = mPendingNewRleases.get(requestId);
			MovieImage image = (MovieImage) response.response;
			item.image = image.image;
			//we update the current displayed list
			mAdapter.updatePoster(item);
			mGridView.invalidate();
			break;

		default:
			break;
		}
		
	}
}
