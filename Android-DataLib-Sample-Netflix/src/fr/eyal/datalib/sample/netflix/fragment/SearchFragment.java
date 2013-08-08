package fr.eyal.datalib.sample.netflix.fragment;

import java.io.UnsupportedEncodingException;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import fr.eyal.datalib.sample.netflix.MovieActivity;
import fr.eyal.datalib.sample.netflix.data.model.catalogtitles.CatalogTitle;
import fr.eyal.datalib.sample.netflix.fragment.adapter.NetflixListAdapter.ItemViewHolder;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.ServiceHelper;
import fr.eyal.lib.data.service.model.ComplexOptions;
import fr.eyal.lib.data.service.model.DataLibRequest;

public class SearchFragment extends NetflixListFragment implements OnItemClickListener {

	private static final String QUERY = "query";

	private static final int MAX_SEARCH_RESULT = 100;
	
	String mSearchQuery;

	public static SearchFragment newInstance(String query) {
		
		SearchFragment f = new SearchFragment();
		Bundle args = new Bundle();
        args.putString(QUERY, query);
		f.setArguments(args);
		
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		// Get the search query
	    mSearchQuery = getArguments().getString(QUERY);
		
		super.onCreate(savedInstanceState);
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = super.onCreateView(inflater, container, savedInstanceState);
		mGridView.setOnItemClickListener(this);
		
		return v;
	}
	
	@Override
	protected int callDataCache(ComplexOptions complexOptionsCache, ComplexOptions complexOptionsNetwork) throws UnsupportedEncodingException {
		return ServiceHelper.BAD_REQUEST_ID;
	}

	@Override
	protected int callDataNetwork(ComplexOptions complexOptionsCache, ComplexOptions complexOptionsNetwork) throws UnsupportedEncodingException {
		return mDataManager.getCatalogTitles(this, MAX_SEARCH_RESULT, 0, mSearchQuery, DataLibRequest.OPTION_NO_OPTION, complexOptionsNetwork);
	}

	@Override
	protected int callImageCache(String url, ComplexOptions complexOptionsCache, ComplexOptions complexOptionsNetwork) throws UnsupportedEncodingException {
		return mDataManager.getMovieImage(DataManager.TYPE_CACHE, this, url, DataLibRequest.OPTION_NO_OPTION, complexOptionsCache, complexOptionsNetwork);
	}

	@Override
	protected int callImageNetwork(String url, ComplexOptions complexOptionsCache, ComplexOptions complexOptionsNetwork) throws UnsupportedEncodingException {
		return mDataManager.getMovieImage(DataManager.TYPE_NETWORK, this, url, DataLibRequest.OPTION_NO_OPTION, complexOptionsCache, complexOptionsNetwork);
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Object tag = view.getTag();
		
		if(tag !=null && tag instanceof ItemViewHolder) {
			ItemViewHolder holder = (ItemViewHolder) tag;
			
			if(holder.item == null)
				return;
			
			CatalogTitle item = (CatalogTitle) holder.item;
			
			Intent i = new Intent(getActivity(), MovieActivity.class);
			i.putExtra(MovieActivity.EXTRA_MOVIE, item);
			getActivity().startActivity(i);
		}
	}

	public String getQuery() {
		return mSearchQuery;
	}
}
