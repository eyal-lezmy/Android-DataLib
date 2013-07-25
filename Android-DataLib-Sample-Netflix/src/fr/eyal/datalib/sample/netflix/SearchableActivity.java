package fr.eyal.datalib.sample.netflix;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import fr.eyal.datalib.sample.netflix.fragment.SearchFragment;

public class SearchableActivity extends FragmentActivity {

	private static final String TAG = "SearchableActivity";

	SearchFragment fragment;
	FrameLayout layout;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_search);

	    // Get the intent, verify the action and get the query
	    Intent intent = getIntent();
	    String query = "";
	    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
	    	query = intent.getStringExtra(SearchManager.QUERY);
	    }
	    //TODO implement no query
	    
	    fragment = SearchFragment.newInstance(query);

	    layout = (FrameLayout) findViewById(R.id.search_holder);

	    //we add the Fragment into the layout
	    getSupportFragmentManager().beginTransaction().add(R.id.search_holder, fragment).commit();
	}
}


