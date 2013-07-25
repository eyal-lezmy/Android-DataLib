// Start of user code fr.eyal.datalib.sample.netflix.data.model.catalogtitles.CatalogTitles. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.catalogtitles;

import java.util.ArrayList;
import java.util.Calendar;

import fr.eyal.datalib.sample.netflix.fragment.model.MovieItemResponse;
import android.os.Parcel;

public class CatalogTitles extends CatalogTitlesBase implements MovieItemResponse {

    private static final String TAG = CatalogTitles.class.getSimpleName();

    public CatalogTitles() {
        super();
    }

    public CatalogTitles(final Parcel in) {
        super(in);
    }

	@Override
	public ArrayList<?> getItems() {
		return catalogTitle;
	}

	@Override
	public Calendar getUpdatedAt() {
		return Calendar.getInstance();
	}

	@Override
	public int getTtl() {
		return 0;
	}

}
// End of user code
