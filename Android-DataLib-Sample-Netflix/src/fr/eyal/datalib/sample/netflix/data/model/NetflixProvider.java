package fr.eyal.datalib.sample.netflix.data.model;

import android.content.UriMatcher;
import android.net.Uri;
import fr.eyal.lib.data.model.provider.BusinessObjectProvider;
import fr.eyal.datalib.sample.netflix.data.model.catalogtitles.*;


public class NetflixProvider extends BusinessObjectProvider {

    public static final String AUTHORITY = "fr.eyal.datalib.sample.netflix.datacache.provider";

    /**
     * Tables' Codes
     */
	public static final int CODE_CATALOGTITLES = 0;
	public static final int CODE_CATALOGTITLES_CATALOGTITLE = 4;
	
	public static final int CODE_CATALOGTITLES_CATALOGTITLE_CATEGORY = 9;
	
	
	public static final int CODE_CATALOGTITLES_CATALOGTITLE_LINK = 10;

    static {

        DATABASE_NAME = "datalib_cache";
        DATABASE_VERSION = 1;

        //Tables' names list
        String[] LOCAL_DATABASE_TABLES_NAMES = {
				CatalogTitles.DATABASE_TABLE_NAME,
				CatalogTitle.DATABASE_TABLE_NAME,
				Category.DATABASE_TABLE_NAME,
				Link.DATABASE_TABLE_NAME,
        };
        DATABASE_TABLES_NAMES = LOCAL_DATABASE_TABLES_NAMES;

        //Tables' fields' names list
        String[][] LOCAL_DATABASE_TABLES_FIELDS_NAMES = {
                CatalogTitles.DATABASE_TABLE_FIELDS_NAMES,
                CatalogTitle.DATABASE_TABLE_FIELDS_NAMES,
                Category.DATABASE_TABLE_FIELDS_NAMES,
                Link.DATABASE_TABLE_FIELDS_NAMES,
        };
        DATABASE_TABLES_FIELDS_NAMES = LOCAL_DATABASE_TABLES_FIELDS_NAMES;

        //Tables' fields' names list
        String[] LOCAL_CREATE_TABLES = {
				CatalogTitles.CREATE_TABLE,
				CatalogTitle.CREATE_TABLE,
				Category.CREATE_TABLE,
				Link.CREATE_TABLE,
        };
        CREATE_TABLES = LOCAL_CREATE_TABLES;

        //Email URI matching table
        UriMatcher matcher = sUriMatcher;

        //We add each URIs into the matcher
		matcher.addURI(AUTHORITY, CatalogTitles.CONTENT_PATH, CODE_CATALOGTITLES);
		matcher.addURI(AUTHORITY, CatalogTitle.CONTENT_PATH, CODE_CATALOGTITLES_CATALOGTITLE);
		matcher.addURI(AUTHORITY, Category.CONTENT_PATH, CODE_CATALOGTITLES_CATALOGTITLE_CATEGORY);
		matcher.addURI(AUTHORITY, Link.CONTENT_PATH, CODE_CATALOGTITLES_CATALOGTITLE_LINK);
    }

    @Override
    protected String getTableName(final int match) {
        switch (match) {
			case CODE_CATALOGTITLES:
			    return CatalogTitles.DATABASE_TABLE_NAME;
			
			case CODE_CATALOGTITLES_CATALOGTITLE:
			    return CatalogTitle.DATABASE_TABLE_NAME;
			
			case CODE_CATALOGTITLES_CATALOGTITLE_CATEGORY:
			    return Category.DATABASE_TABLE_NAME;
			case CODE_CATALOGTITLES_CATALOGTITLE_LINK:
			    return Link.DATABASE_TABLE_NAME;
            
            default:
                return null;
        }
    }

    @Override
    public String getType(final Uri uri) {

        switch (sUriMatcher.match(uri)) {
			case CODE_CATALOGTITLES:
			    return CatalogTitles.CONTENT_URL;
			
			case CODE_CATALOGTITLES_CATALOGTITLE:
			    return CatalogTitle.CONTENT_URL;
			
				case CODE_CATALOGTITLES_CATALOGTITLE_CATEGORY:
				    return Category.CONTENT_URL;
				case CODE_CATALOGTITLES_CATALOGTITLE_LINK:
				    return Link.CONTENT_URL;

            default:
                return null;
        }
    }

}



