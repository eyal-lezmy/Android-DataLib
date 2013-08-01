package fr.eyal.datalib.sample.netflix.fragment;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import fr.eyal.datalib.sample.netflix.CategoryTopActivity;
import fr.eyal.datalib.sample.netflix.NetflixUtils;
import fr.eyal.datalib.sample.netflix.R;
import fr.eyal.lib.util.Out;

public class CaterogiesFragment extends ListFragment {

	public static final int[] GENRES_IDS = {
		NetflixUtils.GENRE_ACTION,
		NetflixUtils.GENRE_ANIMATION,
		NetflixUtils.GENRE_BLURAY,
		NetflixUtils.GENRE_CHILDREN,
		NetflixUtils.GENRE_CLASSIC,
		NetflixUtils.GENRE_COMEDY,
		NetflixUtils.GENRE_DOCUMENTARY,
		NetflixUtils.GENRE_DRAMA,
		NetflixUtils.GENRE_FAITH,
		NetflixUtils.GENRE_FOREIGN,
		NetflixUtils.GENRE_GAY,
		NetflixUtils.GENRE_HORROR,
		NetflixUtils.GENRE_INDEPENDENT,
		NetflixUtils.GENRE_MUSIC,
		NetflixUtils.GENRE_ROMANCE,
		NetflixUtils.GENRE_SCIFI,
		NetflixUtils.GENRE_SPECIAL,
		NetflixUtils.GENRE_SPORT,
		NetflixUtils.GENRE_TELEVISION,
		NetflixUtils.GENRE_THRILLER,
	};

	public static final String[] GENRES_LIST = {
		"Action & Adventure",
		"Anime & Animation",
		"Blu-ray",
		"Children",
		"Classics",
		"Comedy",
		"Documentary",
		"Drama",
		"Faith & Spirituality",
		"Foreign",
		"Gay & Lesbian",
		"Horror",
		"Independent",
		"Music & Musicals",
		"Romance",
		"Sci-Fi & Fantasy",
		"Special Interest",
		"Sport & Fitness",
		"Television",
		"Thrillers",
	};

	ListView mListView;
	ArrayAdapter<String> mAdapter;
	ArrayList<String> mList;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		mAdapter = new ArrayAdapter<String>(getActivity(), R.layout.category_item, R.id.item);
		mAdapter.addAll(GENRES_LIST);
		setListAdapter(mAdapter);
		
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		if(container != null)
			mListView = (ListView) inflater.inflate(R.layout.fgmt_categories, null, false);
		else
			mListView = (ListView) inflater.inflate(R.layout.fgmt_categories, container);
		
		return mListView;
	}
	

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {

		if(position < 0 || position >= GENRES_LIST.length || position >= GENRES_IDS.length )
			return;
		
		Intent i = new Intent(getActivity(), CategoryTopActivity.class);
		i.putExtra(CategoryTopActivity.CATEGORY, GENRES_LIST[position]);
		i.putExtra(CategoryTopActivity.ID, GENRES_IDS[position]);

		startActivity(i);
		
		super.onListItemClick(l, v, position, id);
	}
	
}
