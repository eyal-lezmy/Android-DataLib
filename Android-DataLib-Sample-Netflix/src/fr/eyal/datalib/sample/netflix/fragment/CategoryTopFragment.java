package fr.eyal.datalib.sample.netflix.fragment;

import java.io.UnsupportedEncodingException;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import fr.eyal.datalib.sample.netflix.CategoryTopActivity;
import fr.eyal.datalib.sample.netflix.MovieActivity;
import fr.eyal.datalib.sample.netflix.data.model.topgenre.ItemTopGenre;
import fr.eyal.datalib.sample.netflix.fragment.adapter.NetflixListAdapter.ItemViewHolder;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.model.ComplexOptions;
import fr.eyal.lib.data.service.model.DataLibRequest;

public class CategoryTopFragment extends NetflixListFragment implements OnItemClickListener {
	
	int mCategoryId;
	String mCategory;
	
	public static CategoryTopFragment newInstance(String category, int id) {
		
		CategoryTopFragment f = new CategoryTopFragment();
		Bundle args = new Bundle();
		args.putString(CategoryTopActivity.CATEGORY, category);
		args.putInt(CategoryTopActivity.ID, id);
		f.setArguments(args);
		
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		mCategoryId = getArguments().getInt(CategoryTopActivity.ID);
		mCategory = getArguments().getString(CategoryTopActivity.CATEGORY);
		setRetainInstance(true);
		
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
		return mDataManager.getTopGenre(DataManager.TYPE_CACHE, this, mCategoryId, DataLibRequest.OPTION_RESPONSE_ON_UI_THREAD_ENABLED, complexOptionsCache, complexOptionsNetwork);
	}

	@Override
	protected int callDataNetwork(ComplexOptions complexOptionsCache, ComplexOptions complexOptionsNetwork) throws UnsupportedEncodingException {
		return mDataManager.getTopGenre(DataManager.TYPE_NETWORK, this, mCategoryId, DataLibRequest.OPTION_RESPONSE_ON_UI_THREAD_ENABLED, complexOptionsCache, complexOptionsNetwork);
	}

	@Override
	protected int callImageCache(String url, ComplexOptions complexOptionsCache, ComplexOptions complexOptionsNetwork) throws UnsupportedEncodingException {
		return mDataManager.getMovieImage(DataManager.TYPE_CACHE, this, url, DataLibRequest.OPTION_NO_OPTION, complexOptionsCache, complexOptionsNetwork);
	}

	@Override
	protected int callImageNetwork(String url, ComplexOptions complexOptionsCache, ComplexOptions complexOptionsNetwork) throws UnsupportedEncodingException {
		return mDataManager.getMovieImage(DataManager.TYPE_NETWORK, this, url, DataLibRequest.OPTION_RESPONSE_ON_UI_THREAD_ENABLED, complexOptionsCache, complexOptionsNetwork);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Object tag = view.getTag();
		
		if(tag !=null && tag instanceof ItemViewHolder) {
			ItemViewHolder holder = (ItemViewHolder) tag;
			
			if(holder.item == null)
				return;

			ItemTopGenre item = (ItemTopGenre) holder.item;
			
			Intent i = new Intent(getActivity(), MovieActivity.class);
			i.putExtra(MovieActivity.EXTRA_MOVIE, item);
			getActivity().startActivity(i);
		}
	}

	
}
