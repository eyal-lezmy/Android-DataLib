package fr.eyal.datalib.sample.netflix.data.model.movieimage;

import java.util.ArrayList;
import android.content.OperationApplicationException;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import fr.eyal.lib.data.model.ResponseBusinessObject;
import fr.eyal.lib.data.service.model.DataLibRequest;

public class MovieImageBase implements ResponseBusinessObject {

    private static final String TAG = MovieImageBase.class.getSimpleName();

	public Bitmap image;
	
    public MovieImageBase() {
        super();
    }

    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<MovieImageBase> CREATOR = new Parcelable.Creator<MovieImageBase>() {
	    @Override
	    public MovieImageBase createFromParcel(final Parcel in) {
	        return new MovieImageBase(in);
	    }
	
	    @Override
	    public MovieImageBase[] newArray(final int size) {
	        return new MovieImageBase[size];
	    }
	};
	
	@Override
	public int describeContents() {
	    return 0;
	}

	@Override
	public void writeToParcel(final Parcel dest, final int flags) {
		dest.writeParcelable(image, flags);
	}

	public MovieImageBase(final Parcel in) {
		image = in.readParcelable(Bitmap.class.getClassLoader());
	}    

    @Override
    public void save(final DataLibRequest request) throws RemoteException, OperationApplicationException {
        // Nothing to do
    }

}

