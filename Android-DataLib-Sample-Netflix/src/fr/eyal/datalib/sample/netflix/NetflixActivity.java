package fr.eyal.datalib.sample.netflix;

import java.util.ArrayList;

import fr.eyal.datalib.sample.netflix.data.service.NetflixDataLibActivity;
import fr.eyal.lib.data.model.ResponseBusinessObjectDAO;
import fr.eyal.lib.data.service.model.BusinessResponse;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NetflixActivity extends NetflixDataLibActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_netflix);
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
	public void onRequestFinished(int requestId, boolean suceed,
			BusinessResponse response) {
		// TODO Auto-generated method stub
		
	}

}
