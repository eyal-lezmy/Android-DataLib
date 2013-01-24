package fr.eyal.datalib.sample.netflix.ui;

import java.util.ArrayList;

import android.widget.ImageView;
import android.widget.TextView;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.data.service.NetflixService;
import fr.eyal.lib.data.model.ResponseBusinessObjectDAO;
import fr.eyal.lib.data.service.DataManager.OnDataListener;
import fr.eyal.lib.data.service.model.BusinessResponse;

public class MovieItemHolder implements OnDataListener {

	public ImageView image;
	public TextView text;
	
	@Override
	public void onRequestFinished(int requestId, boolean suceed, BusinessResponse response) {

		switch (response.webserviceType) {
		
		case NetflixService.WEBSERVICE_MOVIEIMAGE:
			
			MovieImage img = (MovieImage) response.response;
			image.setImageBitmap(img.image);
			
			break;

		default:
			break;
		}

		
	}
	@Override
	public void onCacheRequestFinished(ResponseBusinessObjectDAO response) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onDataFromDatabase(int code, ArrayList<?> data) {
		// TODO Auto-generated method stub
		
	}
}
