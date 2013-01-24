// Start of user code fr.eyal.datalib.sample.netflix.data.model.top100.ItemTop100. DO NOT MODIFY THE GENERATED COMMENTS
package fr.eyal.datalib.sample.netflix.data.model.top100;

import android.os.Parcel;

public class ItemTop100 extends ItemTop100Base {

    private static final String TAG = ItemTop100.class.getSimpleName();

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
