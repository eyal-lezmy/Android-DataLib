package fr.eyal.datalib.sample.netflix.fragment;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import fr.eyal.datalib.sample.netflix.R;
import fr.eyal.datalib.sample.netflix.data.model.newreleases.ItemNewRelease;
import fr.eyal.datalib.sample.netflix.data.service.NetflixDataManager;

/**
 * @author Eyal LEZMY
 *
 */
public class NewReleasesAdapter extends BaseAdapter {

	ArrayList<ItemNewRelease> mArray;
	NewFragment mFragment;
	NetflixDataManager mDataManager;
	GridView mGridParent = null;
	
	public NewReleasesAdapter(NewFragment context) {
		super();
		mFragment = context;
		mDataManager = NetflixDataManager.getInstance();
		mArray = new ArrayList<ItemNewRelease>();
	}

	@Override
	public int getCount() {
		return mArray.size();
	}

	@Override
	public Object getItem(int position) {
		return mArray.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ItemViewHolder holder;
		
		if(mGridParent == null)
			mGridParent = (GridView) parent;
		
		if(convertView == null){
			LayoutInflater inflater = (LayoutInflater) mFragment.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.movie_item, parent, false);
 
            holder = new ItemViewHolder();
            holder.text = (TextView) convertView.findViewById(R.id.item_text);
            holder.image = (ImageView) convertView.findViewById(R.id.item_image);
            
            convertView.setTag(holder);
            
        } else {
            holder = (ItemViewHolder) convertView.getTag();
        }

		ItemNewRelease item = mArray.get(position);
		
		if(item != null){
			holder.text.setText(item.title);
			Bitmap bitmap = item.getPoster();
			if(bitmap != null)
				holder.image.setImageBitmap(bitmap);
			else {
				mFragment.getMoviePoster(item);
				holder.image.setImageResource(R.drawable.movie);
			}
		}
		
		return convertView;
	}

	static class ItemViewHolder{
		ImageView image;
		TextView text;
	}
	
	public void updatePoster(ItemNewRelease movie){
		
		int position = mArray.indexOf(movie);
		if(position < 0)
			return;
		
		//if we have the parent view
		if(mGridParent != null){
			int first = mGridParent.getFirstVisiblePosition();
			int max = first + mGridParent.getChildCount();
			
			//if the item is displayed
			if(first <= position && position < max){
				ItemViewHolder holder = (ItemViewHolder) mGridParent.getChildAt(position).getTag();
				Bitmap bmp = movie.image.get();
				if(bmp != null){
					holder.image.setImageBitmap(bmp);
					holder.image.invalidate();
				}
			}
		}
		
	}
}
