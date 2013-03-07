package fr.eyal.datalib.sample.netflix.ui;

import java.util.ArrayList;

import android.graphics.Bitmap;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.data.service.NetflixService;
import fr.eyal.datalib.sample.netflix.fragment.SelectionFragment;
import fr.eyal.lib.data.model.ResponseBusinessObject;
import fr.eyal.lib.data.service.DataManager.OnDataListener;
import fr.eyal.lib.data.service.model.BusinessResponse;

public class MovieItemHolder implements OnDataListener {

	public ImageView image;
	public TextView text;
	
	@Override
	public void onRequestFinished(int requestId, boolean suceed, BusinessResponse response) {

		if(!suceed)
			return;

		switch (response.webserviceType) {
		
		case NetflixService.WEBSERVICE_MOVIEIMAGE:
			
			MovieImage img = (MovieImage) response.response;
			Bitmap bitmap = img.image.get();
			if(bitmap != null)
				image.post(new UpdatePoster(bitmap, image));
			break;

		default:
			break;
		}
	}
	
	@Override
	public void onCacheRequestFinished(int requestId, ResponseBusinessObject response) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onDataFromDatabase(int code, ArrayList<?> data) {
		// TODO Auto-generated method stub
		
	}
	
	public class UpdatePoster implements Runnable {

		Bitmap mImage;
		ImageView mView;
		Animation mFadeIn;
		
		public UpdatePoster(Bitmap bitmap, ImageView view){
			mImage = bitmap;
			mView = view;
			mFadeIn = new AlphaAnimation(0, 1);
			mFadeIn.setDuration(300);
		}
		
		@Override
		public void run() {
			Animation anim = mView.getAnimation();
			if(anim != null){
				anim.cancel();
				anim.reset();
				mView.setImageBitmap(mImage);
				anim.startNow();
			} else {
				mView.setImageBitmap(mImage);
				mView.startAnimation(mFadeIn);
			}
		}
	}
}
