package fr.eyal.datalib.sample.netflix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import fr.eyal.datalib.sample.netflix.fragment.CategoryTopFragment;

public class CategoryTopActivity extends FragmentActivity {

	private static final String TAG = "CategoryTopActivity";

	public static final String ID = "id";
	public static final String CATEGORY = "category";
	public static final int WRONG_ID = -1;

	
	CategoryTopFragment fragment;
	FrameLayout layout;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_search);

	    // Get the intent, verify the action and get the query
	    Intent intent = getIntent();
	    String category = intent.getStringExtra(CATEGORY);
	    int id = intent.getIntExtra(ID, WRONG_ID);
	    
	    fragment = CategoryTopFragment.newInstance(category, id);

	    layout = (FrameLayout) findViewById(R.id.search_holder);

	    //we add the Fragment into the layout
	    getSupportFragmentManager().beginTransaction().add(R.id.search_holder, fragment).commit();
	}
}


