// Start of user code fr.eyal.datalib.sample.netflix.data.model.topgenre.ItemTopGenre. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.topgenre;

import java.io.File;
import java.lang.ref.SoftReference;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.datalib.sample.netflix.fragment.model.MovieItem;
import fr.eyal.lib.util.FileManager;

public class ItemTopGenre extends ItemTopGenreBase implements MovieItem {

    private static final String TAG = ItemTopGenre.class.getSimpleName();

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

    
    public ItemTopGenre() {
        super();
    }

    public ItemTopGenre(final long id) {
        super(id);
    }


    @Override
    public Bitmap getPoster(boolean forceCache){
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
    public String getPosterPath(){
    	if(image == null)
    		return null;

    	return image.imagePath;
    }
    
    @Override
    public String getPosterName(){
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
    public String getImageUrl(){
    	
    	if(imageUrl == null){
    		String[] content = description.split("<img src=\"");
    		content = content[1].split("\"");
    		
    		String result = content[0];
    		result = result.replace("/small/", "/ghd/");
    		imageUrl = result;
    	}
    	return imageUrl;
    }

	@Override
	public String getLabel(int position) {
		if(position >= 0)
			return (position+1) + ". " + title;
		else 
			return title;
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
		
		String[] elements = link.split("/");
		
		if(elements != null && elements.length > 0)
			return elements[elements.length-1]; //we return the last element on the link
		
		return null;
	}    
	
	
	
    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<ItemTopGenre> CREATOR = new Parcelable.Creator<ItemTopGenre>() {
	    @Override
	    public ItemTopGenre createFromParcel(final Parcel in) {
	        return new ItemTopGenre(in);
	    }
	
	    @Override
	    public ItemTopGenre[] newArray(final int size) {
	        return new ItemTopGenre[size];
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

	public ItemTopGenre(final Parcel in) {
		super(in);
		
		image = in.readParcelable(MovieImage.class.getClassLoader());
		imageUrl = in.readString();
		imageName = in.readString();
	}

    
    
}
// End of user code
