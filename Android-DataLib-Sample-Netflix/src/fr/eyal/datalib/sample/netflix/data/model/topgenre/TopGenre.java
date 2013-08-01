// Start of user code fr.eyal.datalib.sample.netflix.data.model.topgenre.TopGenre. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.topgenre;

import java.util.ArrayList;
import java.util.Calendar;

import fr.eyal.datalib.sample.netflix.fragment.model.MovieItemResponse;
import android.os.Parcel;

public class TopGenre extends TopGenreBase implements MovieItemResponse {

    private static final String TAG = TopGenre.class.getSimpleName();

    public TopGenre() {
        super();
    }

    public TopGenre(final Parcel in) {
        super(in);
    }

    public TopGenre(final long id) {
        super(id);
    }

    public TopGenre(final String url) {
        super(url);
    }

	@Override
	public ArrayList<?> getItems() {
		return itemTopGenre;
	}

	@Override
	public Calendar getUpdatedAt() {
		return _updatedAt;
	}

	@Override
	public int getTtl() {
		return ttl;
	}



}
// End of user code
