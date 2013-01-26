package fr.eyal.datalib.sample.netflix.fragment;

import java.util.ArrayList;

import fr.eyal.datalib.sample.netflix.data.service.NetflixDataManager;
import fr.eyal.lib.data.service.DataManager.OnDataListener;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class NetflixFragment extends Fragment implements OnDataListener {

	/**
	 * NetflixDataManager of the project
	 */
	protected NetflixDataManager mDataManager;

	/**
	 * List of requests currently running for this activity
	 */
	protected ArrayList<Integer> mRequestIds;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		mRequestIds = new ArrayList<Integer>();
		mDataManager = NetflixDataManager.getInstance(getActivity());

		super.onCreate(savedInstanceState);
	}

	@Override
	public void onResume() {
		// we launch the request's data reception
		for (final int requestId : mRequestIds) {
			mDataManager.addOnDataListener(requestId, this);
		}
		super.onResume();
	}
	
	@Override
	public void onPause() {
		// we stop the request's data reception
		for (final int requestId : mRequestIds) {
			mDataManager.removeOnDataListener(requestId, this);
		}
		super.onPause();
	}
}
