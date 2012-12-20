package fr.eyal.datalib.sample.netflix;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NetflixActivity extends Activity {

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

}
