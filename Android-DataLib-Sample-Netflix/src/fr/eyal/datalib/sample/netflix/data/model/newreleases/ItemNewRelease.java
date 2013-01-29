// Start of user code fr.eyal.datalib.sample.netflix.data.model.newreleases.ItemNewRelease. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.newreleases;

import java.lang.ref.SoftReference;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;

public class ItemNewRelease extends ItemNewReleaseBase {

    private static final String TAG = ItemNewRelease.class.getSimpleName();

    /**
     * Image's reference
     */
    public SoftReference<Bitmap> image;
    
    /**
     * Path of the stored image
     */
    public String imagePath;

    /**
     * Image's url of the Top100 item
     */
    public String imageUrl = null;

    
    public ItemNewRelease() {
        super();
    }

    public ItemNewRelease(final Parcel in) {
        super(in);
    }

    public ItemNewRelease(final long id) {
        super(id);
    }
    
    /**
     * Get the movie's poster {@link Bitmap}
     * 
     * @return return a {@link Bitmap} corresponding to the movie's poster or <code>null</code> whether there is no loaded image.
     */
    public Bitmap getPoster(){
    	if(image == null)
    		return null;
    	
    	Bitmap result = image.get();
    	
    	if(result == null && imagePath != null)
    		image = new SoftReference<Bitmap>(BitmapFactory.decodeFile(imagePath));
    		
    	return result;
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
