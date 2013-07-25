// Start of user code fr.eyal.datalib.sample.netflix.data.model.catalogtitles.CatalogTitleLink. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.catalogtitles;
import android.os.Parcel;
import android.os.Parcelable;


public class CatalogTitleLink extends CatalogTitleLinkBase {

    private static final String TAG = CatalogTitleLink.class.getSimpleName();

    public CatalogTitleLink() {
        super();
    }


    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<CatalogTitleLink> CREATOR = new Parcelable.Creator<CatalogTitleLink>() {
	    @Override
	    public CatalogTitleLink createFromParcel(final Parcel in) {
	        return new CatalogTitleLink(in);
	    }
	
	    @Override
	    public CatalogTitleLink[] newArray(final int size) {
	        return new CatalogTitleLink[size];
	    }
	};

    public CatalogTitleLink(final Parcel in) {
        super(in);
    }


}
// End of user code
