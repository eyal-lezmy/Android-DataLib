package fr.eyal.datalib.sample.netflix.fragment;

import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Calendar;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.GridView;
import fr.eyal.datalib.sample.netflix.R;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.data.model.top100.ItemTop100;
import fr.eyal.datalib.sample.netflix.data.model.top100.Top100;
import fr.eyal.datalib.sample.netflix.data.service.NetflixService;
import fr.eyal.datalib.sample.netflix.fragment.Top100Adapter.ItemViewHolder;
import fr.eyal.lib.data.model.ResponseBusinessObject;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.model.BusinessResponse;
import fr.eyal.lib.data.service.model.ComplexOptions;
import fr.eyal.lib.data.service.model.DataLibRequest;
import fr.eyal.lib.util.Out;

public class Top100Fragment extends NetflixFragment implements OnScrollListener {

	GridView mGridView;
	Top100Adapter mAdapter;
	SparseArray<ItemTop100> mPendingItem;
	ArrayList<ItemTop100> mPendingItemCache;
	int mScrollState;
	private static Object sharedLock = new Object(); //the shared lock
	float mItemHeight;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		mAdapter = new Top100Adapter(this);
		mPendingItem = new SparseArray<ItemTop100>();
		mPendingItemCache = new ArrayList<ItemTop100>();
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
		mItemHeight = getResources().getDimension(R.dimen.item_height_small);

		try {
			int requestId = mDataManager.getTop100(DataManager.TYPE_CACHE, this, DataLibRequest.OPTION_NO_OPTION, null, null);
			mRequestIds.add(requestId);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		if(container != null)
			mGridView = (GridView) inflater.inflate(R.layout.fgmt_new, container, true);
		else
			mGridView = (GridView) inflater.inflate(R.layout.fgmt_new, container);
		
		View emptyView = inflater.inflate(R.layout.empty_grid, null);
		mGridView.setEmptyView(emptyView);
		mGridView.setAdapter(mAdapter);
//		mGridView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
		mGridView.setOnScrollListener(this);
		
		return mGridView;
	}
	
	
	/**
	 * Ask to display the movie's poster asynchronously
	 * 
	 * @param item the item concerned by the display
	 */
	public void loadMoviePoster(ItemTop100 item){
		
//		if(mScrollState == OnScrollListener.SCROLL_STATE_FLING){
//			Out.e("", "UPDATE " + "Scrolling" + item.title);
//			return;
//		}
		
		synchronized (mPendingItemCache) {

			if(mPendingItemCache.contains(item)){
				Out.e("", "UPDATE " + "No item " + item.title);
				return;
			}
			
			try {
				synchronized (sharedLock) {
					Out.e("", "UPDATE " + "Request Cache");
					launchMovieImageCacheRequest(item, 1, true);
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Launch a cache request for movie image
	 * 
	 * @param item the {@link ItemTop100} object associated to the request
	 * @param inSampleSize bitmap option the sample size
	 * @param inJustDecodeBounds ask to just decode bounds of the bitmap
	 * 
	 * @throws UnsupportedEncodingException
	 */
	public void launchMovieImageCacheRequest(ItemTop100 item, int inSampleSize, boolean inJustDecodeBounds) throws UnsupportedEncodingException {
		ComplexOptions options = new ComplexOptions();
		BitmapFactory.Options bmpOption = new BitmapFactory.Options();
		bmpOption.inSampleSize = inSampleSize;
		bmpOption.inJustDecodeBounds = inJustDecodeBounds;
		options.putBitmapOptions(bmpOption);
		
		Out.d("", "ITEM "+item);
		int requestId = mDataManager.getMovieImage(DataManager.TYPE_CACHE, this, item.getImageUrl(), DataLibRequest.OPTION_NO_OPTION, options, null);
		mRequestIds.add(requestId);
		mPendingItem.append(requestId, item);
		mPendingItemCache.add(item);
	}
	
	
	/*
	 * OnDataListener management
	 */
	
	@Override
	public void onCacheRequestFinished(int requestId, ResponseBusinessObject response) {
		
		if(response instanceof Top100){
			Top100 top = (Top100) response;

			//we update the page content
			updateTop100(top);

			//we compute the update time
			Calendar updateTime = Calendar.getInstance();
			updateTime.setTimeInMillis(top._updatedAt.getTimeInMillis());
			updateTime.add(Calendar.MINUTE, top.ttl);
			
			//we update the content if the ttl is consumed
			if(updateTime.compareTo(Calendar.getInstance()) <= 0) {
				try {
					mDataManager.getTop100(DataManager.TYPE_NETWORK, this, DataLibRequest.OPTION_NO_OPTION, null, null);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			
		} else if(response instanceof MovieImage){
			
			MovieImage movieImage = (MovieImage) response;

			ItemTop100 item = getItemAndTreatPendings(requestId);
			
			//if we didn't receive the image's soft reference
			if(movieImage.image == null && item != null){
				
				BitmapFactory.Options options = movieImage.lastOptions;
				if(options != null && options.outHeight != 0){

					//we calculate the sample size
					int sampleSize = (int) (options.outHeight/mItemHeight);
					Out.d("", "SAMPLE SIZE"+sampleSize);
					
					//then we ask for the image content including the sample size
					try {
						launchMovieImageCacheRequest(item, sampleSize, false);
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					return;
				}
			}
					
			//if the cache object does not contains the good information
			if(movieImage.image == null || movieImage.image.get() == null){

				//if the list is scrolling we don't ask for a network request
				if(mScrollState == OnScrollListener.SCROLL_STATE_FLING){
					Out.e("", "UPDATE " + "Scrolling" + item.title);
					return;
				}

				//we ask for a network request
				try {
					if(item != null){
						
						int id = mDataManager.getMovieImage(DataManager.TYPE_NETWORK, this, item.getImageUrl(), DataLibRequest.OPTION_NO_OPTION, null, null);
						mRequestIds.add(id);
						mPendingItem.append(id, item);
					} else {
					}
					
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				
			} else {
				
				//we scale the Bitmap
//				float ratio = (float)unscaledBmp.getWidth()/unscaledBmp.getHeight();
//				
//				Bitmap scaledBmp = scaleBitmap(unscaledBmp, ratio*mItemHeight, mItemHeight, ScalingLogic.FIT);
//				unscaledBmp.recycle();
//				
//				movieImage.image = new SoftReference<Bitmap>(scaledBmp);

				//we ask to update the ImageView
				updateTop100Image(item, movieImage);
			}
		}
	}

	private ItemTop100 getItemAndTreatPendings(int requestId) {
		ItemTop100 item = null;
		
		synchronized (sharedLock) {
			item = mPendingItem.get(requestId);
			mPendingItem.remove(requestId);
			if(item != null){
				mPendingItemCache.remove(item);
			}
		}
		return item;
	}

	@Override
	public void onDataFromDatabase(int code, ArrayList<?> data) {
	}

	@Override
	public void onRequestFinished(int requestId, boolean suceed, BusinessResponse response) {
		if(!suceed)
			return;
		
		switch (response.webserviceType) {

		case NetflixService.WEBSERVICE_TOP100:
			updateTop100((Top100) response.response);
			break;
			
		case NetflixService.WEBSERVICE_MOVIEIMAGE:
			ItemTop100 item = getItemAndTreatPendings(requestId);
			updateTop100Image(item, (MovieImage) response.response);
			break;

		default:
			break;
		}
	}

	/*
	 * Content update
	 */
	
	/**
	 * Update the movies list
	 * 
	 * @param response the {@link Top100} content
	 */
	private void updateTop100(Top100 response) {
		mAdapter.mArray = response.itemTop100;
		mAdapter.notifyDataSetChanged();
	}


	/**
	 * Update the movie image
	 * 
	 * @param requestId the request id to find the corresponding movie item
	 * @param response the {@link MovieImage} received
	 * 
	 * @return the {@link ItemTop100} item concerned by the updating or null if it is not found
	 */
	private ItemTop100 updateTop100Image(ItemTop100 item, MovieImage response) {
		//we update the object
		if(item == null || response == null)
			return null;
		item.image = response;
		//we update the current displayed list
		mAdapter.updatePoster(item);
		return item;
	}

	
	/*
	 * Scroll management
	 */
	
	@Override
	public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
	}

	@Override
	public  void  onScrollStateChanged(AbsListView view, int scrollState) {
			
		//if the list finish a fling
		if(mScrollState == OnScrollListener.SCROLL_STATE_FLING && scrollState != mScrollState){
			mScrollState = scrollState;
			
			int first = mGridView.getFirstVisiblePosition();
			int size = mGridView.getChildCount();
			for (int i = 0; i < size; i++) {
				ItemTop100 item = (ItemTop100) mAdapter.getItem(first+i);
				
				if(item != null){
					View v = mGridView.getChildAt(i);
					if(v != null){
						Top100Adapter.ItemViewHolder holder = (ItemViewHolder) v.getTag();
						if(holder != null){
							
							boolean isImageSet = mAdapter.setImageFromItemOrCache(holder, item);
							if(!isImageSet)
								loadMoviePoster(item);
						}
					}
				}

			}
		}
		mScrollState = scrollState;
	}
	
	public static Bitmap scaleBitmap(Bitmap unscaledBitmap, float dstWidth, float dstHeight, ScalingLogic scalingLogic) {
	    Rect srcRect = calculateSrcRect(unscaledBitmap.getWidth(), unscaledBitmap.getHeight(), dstWidth, dstHeight, scalingLogic);
	    Rect dstRect = calculateDstRect(unscaledBitmap.getWidth(), unscaledBitmap.getHeight(), dstWidth, dstHeight, scalingLogic);
	    Bitmap scaledBitmap = Bitmap.createBitmap(dstRect.width(), dstRect.height(), Config.ARGB_8888);
	    Canvas canvas = new Canvas(scaledBitmap);
	    canvas.drawBitmap(unscaledBitmap, srcRect, dstRect, new Paint(Paint.FILTER_BITMAP_FLAG));

	    return scaledBitmap;
	}
	
	public static Rect calculateSrcRect(int srcWidth, int srcHeight, float dstWidth, float dstHeight, ScalingLogic scalingLogic) {
	    if (scalingLogic == ScalingLogic.CROP) {
	        final float srcAspect = (float)srcWidth / (float)srcHeight;
	        final float dstAspect = dstWidth / dstHeight;

	        if (srcAspect > dstAspect) {
	            final int srcRectWidth = (int)(srcHeight * dstAspect);
	            final int srcRectLeft = (srcWidth - srcRectWidth) / 2;
	            return new Rect(srcRectLeft, 0, srcRectLeft + srcRectWidth, srcHeight);
	        } else {
	            final int srcRectHeight = (int)(srcWidth / dstAspect);
	            final int scrRectTop = (int)(srcHeight - srcRectHeight) / 2;
	            return new Rect(0, scrRectTop, srcWidth, scrRectTop + srcRectHeight);
	        }
	    } else {
	        return new Rect(0, 0, srcWidth, srcHeight);
	    }
	}

	public static Rect calculateDstRect(int srcWidth, int srcHeight, float dstWidth, float dstHeight, ScalingLogic scalingLogic) {
	    if (scalingLogic == ScalingLogic.FIT) {
	        final float srcAspect = (float)srcWidth / (float)srcHeight;
	        final float dstAspect = dstWidth / dstHeight;

	        if (srcAspect > dstAspect) {
	            return new Rect(0, 0, (int)dstWidth, (int)(dstWidth / srcAspect));
	        } else {
	            return new Rect(0, 0, (int)(dstHeight * srcAspect), (int)dstHeight);
	        }
	    } else {
	        return new Rect(0, 0, (int)dstWidth, (int)dstHeight);
	    }
	}
	
	
	public enum ScalingLogic {
		CROP, FIT
	}

	
}
