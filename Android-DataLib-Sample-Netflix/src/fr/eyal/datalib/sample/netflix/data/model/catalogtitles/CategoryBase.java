package fr.eyal.datalib.sample.netflix.data.model.catalogtitles;

import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable;
import fr.eyal.lib.data.model.BusinessObject;

public class CategoryBase implements BusinessObject {

    private static final String TAG = CategoryBase.class.getSimpleName();

	//list of attributes
	public String attrLabel = "";
	public String attrTerm = "";

    public CategoryBase() {
        super();
    }

    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<CategoryBase> CREATOR = new Parcelable.Creator<CategoryBase>() {
	    @Override
	    public CategoryBase createFromParcel(final Parcel in) {
	        return new CategoryBase(in);
	    }
	
	    @Override
	    public CategoryBase[] newArray(final int size) {
	        return new CategoryBase[size];
	    }
	};
	
	@Override
	public int describeContents() {
	    return 0;
	}

	@Override
	public void writeToParcel(final Parcel dest, final int flags) {
		//list of attributes
		dest.writeString(attrLabel);
		dest.writeString(attrTerm);
		
	}

	public CategoryBase(final Parcel in) {
		//list of attributes
		attrLabel = in.readString();
		attrTerm = in.readString();	
		
		
	}    
}

