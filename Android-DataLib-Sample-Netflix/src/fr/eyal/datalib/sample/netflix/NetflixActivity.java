package fr.eyal.datalib.sample.netflix;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import fr.eyal.datalib.sample.netflix.data.service.NetflixDataLibActivity;
import fr.eyal.lib.data.model.ResponseBusinessObjectDAO;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.model.BusinessResponse;
import fr.eyal.lib.data.service.model.DataLibRequest;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NetflixActivity extends NetflixDataLibActivity {

	Button mBtnSearchTitle;
	Button mBtnNewReleases;
	Button mBtnAutocomplete;
	Button mBtnGetPeople;
	Button mBtnGetFilmography;
	Button mBtnGetSynopsis;
	Button mBtnGetMovie;
	Button mBtnGetDirectors;
	Button mBtnGetCast;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_netflix);
		
		mBtnGetCast = (Button) findViewById(R.id.getCast);
		mBtnGetDirectors = (Button) findViewById(R.id.getDirectors);
		mBtnGetFilmography = (Button) findViewById(R.id.getFilmography);
		mBtnGetMovie = (Button) findViewById(R.id.getMovie);
		mBtnGetPeople = (Button) findViewById(R.id.getPeople);
		mBtnGetSynopsis = (Button) findViewById(R.id.getSynopsis);
		mBtnSearchTitle = (Button) findViewById(R.id.searchTitle);
		mBtnAutocomplete = (Button) findViewById(R.id.autocomplete);
		mBtnNewReleases = (Button) findViewById(R.id.newReleases);
		
		final int movieId = 70206672;
		final int peopleId = 30144804;
		
		mBtnGetCast.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDataManager.getCast(movieId, NetflixActivity.this, mRequestIds);
			}
		});

		mBtnGetDirectors.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDataManager.getDirectors(movieId, NetflixActivity.this, mRequestIds);
			}
		});
		
		mBtnGetFilmography.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDataManager.getFilmography(peopleId, NetflixActivity.this, mRequestIds);
			}
		});

		mBtnGetMovie.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDataManager.getMovie(movieId, NetflixActivity.this, mRequestIds);
			}
		});

		mBtnGetPeople.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDataManager.getPeople(peopleId, NetflixActivity.this, mRequestIds);
			}
		});

		mBtnGetSynopsis.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDataManager.getSynopsis(movieId, NetflixActivity.this, mRequestIds);
			}
		});

		
		mBtnSearchTitle.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDataManager.searchCatalogTitle("chris", NetflixActivity.this, mRequestIds);
			}
		});
		
		mBtnNewReleases.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				int id;
				try {
					id = mDataManager.getNewReleases(DataManager.TYPE_CACHE_THEN_NETWORK, NetflixActivity.this, DataLibRequest.OPTION_NO_OPTION);
					mRequestIds.add(id);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		});

		mBtnAutocomplete.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				int id;
				try {
					id = mDataManager.getAutocomplete(NetflixActivity.this, NetflixConfig.CONSUMER_KEY, "chr", DataLibRequest.OPTION_NO_OPTION);
					mRequestIds.add(id);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		});



	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_netflix, menu);
		return true;
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
		
		
	}

}
