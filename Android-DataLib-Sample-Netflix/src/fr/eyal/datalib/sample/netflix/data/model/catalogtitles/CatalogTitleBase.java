package fr.eyal.datalib.sample.netflix.data.model.catalogtitles;

import java.util.ArrayList;
import android.os.Parcel;
import android.os.Parcelable;
import fr.eyal.lib.data.model.BusinessObject;

public class CatalogTitleBase implements BusinessObject {

    private static final String TAG = CatalogTitleBase.class.getSimpleName();

	//list of attributes
	public String attrTitleShort = "";
	public String attrTitleRegular = "";
	public String attrBox_artSmall = "";
	public String attrBox_artMedium = "";
	public String attrBox_artLarge = "";
	
	//list of content
	public String id;
	public String title;
	public String box_art;
	public int release_year;
	public int runtime;
	public float average_rating;
	
	
	//list of childs
	public ArrayList<Category> category;
	public ArrayList<Link> link;

    public CatalogTitleBase() {
        super();
    }

    /**
     * PARCELABLE MANAGMENT
     */

	public static final Parcelable.Creator<CatalogTitleBase> CREATOR = new Parcelable.Creator<CatalogTitleBase>() {
	    @Override
	    public CatalogTitleBase createFromParcel(final Parcel in) {
	        return new CatalogTitleBase(in);
	    }
	
	    @Override
	    public CatalogTitleBase[] newArray(final int size) {
	        return new CatalogTitleBase[size];
	    }
	};
	
	@Override
	public int describeContents() {
	    return 0;
	}

	@Override
	public void writeToParcel(final Parcel dest, final int flags) {
		//list of attributes
		dest.writeString(attrTitleShort);
		dest.writeString(attrTitleRegular);
		dest.writeString(attrBox_artSmall);
		dest.writeString(attrBox_artMedium);
		dest.writeString(attrBox_artLarge);
		
		//list of content
		dest.writeString(id);
		dest.writeString(title);
		dest.writeString(box_art);
		dest.writeInt(release_year);
		dest.writeInt(runtime);
		dest.writeFloat(average_rating);
		
		//list of childs
		dest.writeParcelableArray(category.toArray(new Category[category.size()]), 0);
		dest.writeParcelableArray(link.toArray(new Link[link.size()]), 0);
	}

	public CatalogTitleBase(final Parcel in) {
		//list of attributes
		attrTitleShort = in.readString();
		attrTitleRegular = in.readString();
		attrBox_artSmall = in.readString();
		attrBox_artMedium = in.readString();
		attrBox_artLarge = in.readString();	
		
		//list of content
		id = in.readString();
		title = in.readString();
		box_art = in.readString();
		release_year = in.readInt();
		runtime = in.readInt();
		average_rating = in.readFloat();	
		
		//list of children
		Parcelable[] items; 
		items = in.readParcelableArray(Category.class.getClassLoader());
		category = new ArrayList<Category>();
		for (final Parcelable parcelable : items) {
		    category.add((Category) parcelable);
		}
		items = in.readParcelableArray(Link.class.getClassLoader());
		link = new ArrayList<Link>();
		for (final Parcelable parcelable : items) {
		    link.add((Link) parcelable);
		}
		
	}    
}

