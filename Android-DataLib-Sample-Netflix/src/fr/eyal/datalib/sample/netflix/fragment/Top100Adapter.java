package fr.eyal.datalib.sample.netflix.fragment;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import fr.eyal.datalib.sample.netflix.R;
import fr.eyal.datalib.sample.netflix.data.model.top100.ItemTop100;
import fr.eyal.lib.util.Out;

/**
 * @author Eyal LEZMY
 *
 */
public class Top100Adapter extends BaseAdapter {

	ArrayList<ItemTop100> mArray;
	Top100Fragment mFragment;
	GridView mGridParent = null;
	UpdateContent mUpdateContentRunnable = new UpdateContent();
//	Animation mFadeIn;

	
	public Top100Adapter(Top100Fragment top100Fragment) {
		super();
		mFragment = top100Fragment;
		mArray = new ArrayList<ItemTop100>();
//		mFadeIn = new AlphaAnimation(0, 1);
//		mFadeIn.setDuration(1000);
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
			Bitmap bitmap = item.getPoster();
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
				Bitmap bmp = movie.getPoster();
				if(bmp != null){
					holder.image.post(new UpdatePoster(bmp, holder.image));
				}
			}
		}
	}

	/**
	 * This override manage to launch the action on the UI thread
	 */
	@Override
	public void notifyDataSetChanged() {
		if(Looper.myLooper() == Looper.getMainLooper())
			super.notifyDataSetChanged();
		else
			mFragment.getActivity().runOnUiThread(mUpdateContentRunnable);
	}
	
	public class UpdatePoster implements Runnable {

		Bitmap mImage;
		ImageView mView;
		
		public UpdatePoster(Bitmap image, ImageView view){
			mImage = image;
			mView = view;
		}
		
		@Override
		public void run() {
			mView.setImageBitmap(mImage);
//			mView.startAnimation(mFadeIn);
			mView.invalidate();
		}
	}

	public class UpdateContent implements Runnable {

		public UpdateContent(){
		}
		
		@Override
		public void run() {
			notifyDataSetChanged();
		}
		
	}

}
