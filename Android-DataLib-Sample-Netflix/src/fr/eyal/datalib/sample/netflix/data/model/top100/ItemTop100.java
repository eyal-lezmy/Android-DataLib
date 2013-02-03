// Start of user code fr.eyal.datalib.sample.netflix.data.model.top100.ItemTop100. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.top100;

import java.lang.ref.SoftReference;

import android.graphics.Bitmap;
import android.os.Parcel;
import fr.eyal.datalib.sample.netflix.data.model.movieimage.MovieImage;
import fr.eyal.lib.util.FileManager;

public class ItemTop100 extends ItemTop100Base {

	private static final String TAG = ItemTop100.class.getSimpleName();

    /**
     * Image's reference
     */
    public MovieImage image = null;

    /**
     * Image's url of the Top100 item
     */
    public String imageUrl = null;
    

    public ItemTop100() {
        super();
        
    }

    public ItemTop100(final Parcel in) {
        super(in);
    }

    public ItemTop100(final long id) {
        super(id);
    }

    /**
     * Get the movie's poster {@link Bitmap}
     * 
     * @param context the context of execution. Needed to have access to the stored images.
     * 
     * @return return a {@link Bitmap} corresponding to the movie's poster or <code>null</code> whether there is no loaded image.
     */
    public Bitmap getPoster(){
    	if(image == null || image.image == null)
    		return null;
    	
    	Bitmap result = image.image.get();
    	
    	if(result == null){
    		image.image = new SoftReference<Bitmap>(FileManager.getPictureFromFile(image.imagePath));
    		result = image.image.get();
    	}
    	
    	return result;
    }

    public String getPosterPath(){
    	if(image == null)
    		return null;

    	return image.imagePath;
    }
    
    
    /**
     * Get the HD image's url of the item
     * 
     * @return the URL needed
     */
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
    
}
// End of user code
