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
import fr.eyal.datalib.sample.netflix.data.model.top100.ItemTop100;

/**
 * @author Eyal LEZMY
 *
 */
public class Top100Adapter extends BaseAdapter {

	ArrayList<ItemTop100> mArray;
	Top100Fragment mFragment;
	GridView mGridParent = null;
	
	public Top100Adapter(Top100Fragment top100Fragment) {
		super();
		mFragment = top100Fragment;
		mArray = new ArrayList<ItemTop100>();
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

		ItemTop100 item = mArray.get(position);
		
		if(item != null){
			holder.text.setText((position+1) + ". " + item.title);
			Bitmap bitmap = item.getPoster(mFragment.getActivity());
			if(bitmap != null)
				holder.image.setImageBitmap(bitmap);
			else {
				holder.image.setImageResource(R.drawable.movie);
				mFragment.getMoviePoster(item);
			}
		}
		
		return convertView;
	}

	static class ItemViewHolder{
		ImageView image;
		TextView text;
	}
	
	public void updatePoster(ItemTop100 movie){
		
		int position = mArray.indexOf(movie);
		if(position < 0)
			return;
		
		//if we have the parent view
		if(mGridParent != null){
			int first = mGridParent.getFirstVisiblePosition();
			int max = first + mGridParent.getChildCount();
			
			//if the item is displayed
			if(first <= position && position < max){
				View v = mGridParent.getChildAt(position-first);
				if(v == null) 
					return;
				ItemViewHolder holder = (ItemViewHolder) v.getTag();
				Bitmap bmp = movie.image.get();
				if(bmp != null){
					holder.image.setImageBitmap(bmp);
					holder.image.invalidate();
				}
			}
		}
		
	}
}
