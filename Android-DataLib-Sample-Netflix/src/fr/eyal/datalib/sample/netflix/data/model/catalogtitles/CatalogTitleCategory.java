// Start of user code fr.eyal.datalib.sample.netflix.data.model.catalogtitles.CatalogTitleCategory. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.catalogtitles;
import android.os.Parcel;
import android.os.Parcelable;

public class CatalogTitleCategory extends CatalogTitleCategoryBase {

    private static final String TAG = CatalogTitleCategory.class.getSimpleName();

    public CatalogTitleCategory() {
        super();
    }

    public CatalogTitleCategory(final Parcel in) {
        super(in);
    }
    
    
    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<CatalogTitleCategory> CREATOR = new Parcelable.Creator<CatalogTitleCategory>() {
	    @Override
	    public CatalogTitleCategory createFromParcel(final Parcel in) {
	        return new CatalogTitleCategory(in);
	    }
	
	    @Override
	    public CatalogTitleCategory[] newArray(final int size) {
	        return new CatalogTitleCategory[size];
	    }
	};

}
// End of user code
