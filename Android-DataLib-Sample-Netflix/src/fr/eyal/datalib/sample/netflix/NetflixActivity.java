package fr.eyal.datalib.sample.netflix;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.widget.Button;
import android.widget.SearchView;

import com.viewpagerindicator.TitlePageIndicator;

import fr.eyal.datalib.sample.cache.BitmapMemoryLruCache;
import fr.eyal.datalib.sample.netflix.util.Resources;
import fr.eyal.lib.util.Out;

public class NetflixActivity extends FragmentActivity {

	Button mBtnSearchTitle;
	Button mBtnNewReleases;
	Button mBtnTop100;
	Button mBtnTopGenre;
	Button mBtnAutocomplete;
	Button mBtnGetPeople;
	Button mBtnGetFilmography;
	Button mBtnGetSynopsis;
	Button mBtnGetMovie;
	Button mBtnGetDirectors;
	Button mBtnGetCast;
	
	NetflixFragmentAdapter mAdapter;
	ViewPager mViewPager;
	TitlePageIndicator mTitlePageIndicator;
	BitmapMemoryLruCache mBitmapCache;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_netflix);
		
		//we initialize the bitmap cache
		final int maxMemory = (int) Runtime.getRuntime().maxMemory()/5;
		Out.w("", "CACHE SIZE = "+maxMemory);
		mBitmapCache = new BitmapMemoryLruCache(maxMemory);
		Resources.getInstance().mBitmapCache = mBitmapCache;
		
		mAdapter = new NetflixFragmentAdapter(getSupportFragmentManager());
		
		mViewPager = (ViewPager) findViewById(R.id.viewpager);
		mViewPager.setAdapter(mAdapter);
		mViewPager.setCurrentItem(1);
		
		mTitlePageIndicator = (TitlePageIndicator) findViewById(R.id.indicator);
		mTitlePageIndicator.setViewPager(mViewPager);
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_netflix, menu);

	    // Get the SearchView and set the searchable configuration
	    SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
	    SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
	    searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
	    searchView.setIconifiedByDefault(false); // Do not iconify the widget; expand it by default

		return true;
	}
}
