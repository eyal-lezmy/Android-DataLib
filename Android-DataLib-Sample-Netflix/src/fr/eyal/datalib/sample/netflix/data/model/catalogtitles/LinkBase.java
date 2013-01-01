package fr.eyal.datalib.sample.netflix.data.model.catalogtitles;

import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable;
import fr.eyal.lib.data.model.BusinessObject;

public class LinkBase implements BusinessObject {

    private static final String TAG = LinkBase.class.getSimpleName();

	//list of attributes
	public String attrHref = "";
	public String attrRel = "";
	public String attrTitle = "";

    public LinkBase() {
        super();
    }

    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<LinkBase> CREATOR = new Parcelable.Creator<LinkBase>() {
	    @Override
	    public LinkBase createFromParcel(final Parcel in) {
	        return new LinkBase(in);
	    }
	
	    @Override
	    public LinkBase[] newArray(final int size) {
	        return new LinkBase[size];
	    }
	};
	
	@Override
	public int describeContents() {
	    return 0;
	}

	@Override
	public void writeToParcel(final Parcel dest, final int flags) {
		//list of attributes
		dest.writeString(attrHref);
		dest.writeString(attrRel);
		dest.writeString(attrTitle);
		
	}

	public LinkBase(final Parcel in) {
		//list of attributes
		attrHref = in.readString();
		attrRel = in.readString();
		attrTitle = in.readString();	
		
		
	}    
}

