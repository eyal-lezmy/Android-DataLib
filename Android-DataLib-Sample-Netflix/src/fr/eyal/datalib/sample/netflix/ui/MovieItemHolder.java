package fr.eyal.datalib.sample.netflix.ui;

import java.util.ArrayList;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.data.service.NetflixService;
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
				image.setImageBitmap(img.image.get());
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
}
