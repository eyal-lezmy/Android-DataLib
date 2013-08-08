package fr.eyal.datalib.sample.netflix;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import fr.eyal.datalib.sample.netflix.fragment.CaterogiesFragment;
import fr.eyal.datalib.sample.netflix.fragment.NewFragment;
import fr.eyal.datalib.sample.netflix.fragment.SelectionFragment;
import fr.eyal.datalib.sample.netflix.fragment.Top100Fragment;

class NetflixFragmentAdapter extends FragmentPagerAdapter {
    protected static final String[] CONTENT = new String[] {"Categories", "Selection", "New", "Top 100"};
    private int mCount = CONTENT.length;
    
    public NetflixFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
    	
    	Fragment page = null;
    	switch (position) {
		case 0:
			page = new CaterogiesFragment();
			break;

		case 1:
			page = new SelectionFragment();
			break;

		case 2:
			page = new NewFragment();
			break;

		case 3:
			page = new Top100Fragment();
			break;
			
		default:
			break;
		}
    	
        return page;
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return NetflixFragmentAdapter.CONTENT[position % CONTENT.length].toUpperCase();
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
}