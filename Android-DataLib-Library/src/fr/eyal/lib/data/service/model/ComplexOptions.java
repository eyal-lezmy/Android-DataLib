package fr.eyal.lib.data.service.model;

import java.util.HashMap;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * This class contains all the requests' options that cannot be simply handled by a <code>int</code>.<br>
 * This is used for example to handle the {@link BitmapFactory.Options} during a network or a cache request.<br>
 * The options are stored on a <code>HashMap&lt;String, Object&gt;</code>. Use the getters to reach the options ou need. 
 * 
 * @author Eyal
 *
 */
public class ComplexOptions implements Parcelable{

	private HashMap<String, Object> mMap;
	
	public ComplexOptions(){
		mMap = new HashMap<String, Object>();
	}
	
    /**
     * The key to get the {@link BitmapFactory.Options} object from the {@code complexOptions}
     */
    public static final String COMPLEX_OPTION_BITMAP_FACTORY_OPTION = "bitmap-factory-options";

    /**
     * Put a {@link BitmapFactory.Options} to the complex options<br>
     * <b>This value will be lost if the {@link ComplexOptions} is passed as a Parcelable</b>
     * 
     * @param options the bitmap options to add
     * 
     * @return the value of any previous mapping with the specified key or <code>null</code> if there was no such mapping. 
     */
    public BitmapFactory.Options putBitmapOptions(BitmapFactory.Options options){
    	return (Options) mMap.put(COMPLEX_OPTION_BITMAP_FACTORY_OPTION, options);
    }

    /**
     * Get the {@link BitmapFactory.Options} object from the request
     * 
     * @return the Bitmap options or null if it is not set
     */
    public BitmapFactory.Options getBitmapOptions(){
    	return (BitmapFactory.Options) mMap.get(COMPLEX_OPTION_BITMAP_FACTORY_OPTION);
    }

    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<ComplexOptions> CREATOR = new Parcelable.Creator<ComplexOptions>() {
	    @Override
	    public ComplexOptions createFromParcel(final Parcel in) {
	        return new ComplexOptions(in);
	    }
	
	    @Override
	    public ComplexOptions[] newArray(final int size) {
	        return new ComplexOptions[size];
	    }
	};

	@Override
	public int describeContents() {
	    return 0;
	}

	@Override
	public void writeToParcel(final Parcel dest, final int flags) {
		//no complex option is today able to be passed via Parcelable
	}

	public ComplexOptions(final Parcel in) {
		//no complex option is today able to be passed via Parcelable
	}
	
	
}
