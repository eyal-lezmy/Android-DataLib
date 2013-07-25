// Start of user code fr.eyal.datalib.sample.netflix.data.model.catalogtitles.CatalogTitle. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.catalogtitles;
import java.io.File;
import java.lang.ref.SoftReference;

import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.fragment.model.MovieItem;
import fr.eyal.lib.util.FileManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;

public class CatalogTitle extends CatalogTitleBase implements MovieItem {

    private static final String TAG = CatalogTitle.class.getSimpleName();

    /**
     * Image's reference
     */
    public MovieImage image = null;

    /**
     * Image's url of the Top100 item
     */
    public String imageUrl = null;

    /**
     * Image's name of the Top100 item
     */
    public String imageName = null;

    
    public CatalogTitle() {
        super();
    }

	@Override
	public Bitmap getPoster(boolean forceCache) {
    	if(image == null || image.image == null)
    		return null;
    	
    	Bitmap result = image.image.get();
    	
    	if(result == null && forceCache){
    		
    		BitmapFactory.Options options = new BitmapFactory.Options();
    		
    		image.image = new SoftReference<Bitmap>(FileManager.getPictureFromFile(image.imagePath, options));
    		result = image.image.get();
    	}
    	
    	return result;

	}

	@Override
	public String getPosterPath() {
    	if(image == null)
    		return null;

    	return image.imagePath;
	}

	@Override
	public String getPosterName() {
    	if(image == null)
    		return null;
    	
    	//we assume the name is not supposed to change
    	if(imageName != null)
    		return imageName;

    	String[] elements = image.imagePath.split(File.separator);
    	imageName = elements[elements.length-1];
    	return imageName;
	}

	@Override
	public String getImageUrl() {
		if(attrBox_artLarge != null && attrBox_artLarge.length() > 0)
			return attrBox_artLarge;
		else if(attrBox_artMedium != null && attrBox_artMedium.length() > 0)
			return attrBox_artMedium;
		else if(attrBox_artSmall != null && attrBox_artSmall.length() > 0)
			return attrBox_artSmall;
		else
			return null;
	}

	@Override
	public String getLabel(int position) {
		if(position > 0)
			return (position+1) + ". " + attrTitleShort;
		else 
			return attrTitleShort;
	}

	@Override
	public void setImage(MovieImage newImage) {
		image = newImage;		
	}

	@Override
	public MovieImage getImage() {
		return image;
	}

	@Override
	public String getId() {
		String[] elements = id.split("/");
		
		if(elements != null && elements.length > 0)
			return elements[elements.length-1]; //we return the last element on the link
		
		return null;

	}

    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<CatalogTitle> CREATOR = new Parcelable.Creator<CatalogTitle>() {
	    @Override
	    public CatalogTitle createFromParcel(final Parcel in) {
	        return new CatalogTitle(in);
	    }
	
	    @Override
	    public CatalogTitle[] newArray(final int size) {
	        return new CatalogTitle[size];
	    }
	};

	@Override
	public int describeContents() {
	    return 0;
	}

	@Override
	public void writeToParcel(final Parcel dest, final int flags) {
		super.writeToParcel(dest, flags);

		dest.writeParcelable(image, 0);
		dest.writeString(imageUrl);
		dest.writeString(imageName);		
	}

	public CatalogTitle(final Parcel in) {
		super(in);
		
		image = in.readParcelable(MovieImage.class.getClassLoader());
		imageUrl = in.readString();
		imageName = in.readString();
		
	}
	
}
// End of user code
