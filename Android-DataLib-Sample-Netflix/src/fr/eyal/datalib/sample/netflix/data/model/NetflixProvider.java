package fr.eyal.datalib.sample.netflix.data.model;

import android.content.UriMatcher;
import android.net.Uri;
import fr.eyal.lib.data.model.provider.BusinessObjectProvider;


public class NetflixProvider extends BusinessObjectProvider {

    public static final String AUTHORITY = "fr.eyal.datalib.sample.netflix.datacache.provider";

    /**
     * Tables' Codes
     */
	

    static {

        DATABASE_NAME = "datalib_cache";
        DATABASE_VERSION = 1;

        //Tables' names list
        String[] LOCAL_DATABASE_TABLES_NAMES = {
				
        };
        DATABASE_TABLES_NAMES = LOCAL_DATABASE_TABLES_NAMES;

        //Tables' fields' names list
        String[][] LOCAL_DATABASE_TABLES_FIELDS_NAMES = {
                
        };
        DATABASE_TABLES_FIELDS_NAMES = LOCAL_DATABASE_TABLES_FIELDS_NAMES;

        //Tables' fields' names list
        String[] LOCAL_CREATE_TABLES = {
				
        };
        CREATE_TABLES = LOCAL_CREATE_TABLES;

        //Email URI matching table
        UriMatcher matcher = sUriMatcher;

        //We add each URIs into the matcher
		
    }

    @Override
    protected String getTableName(final int match) {
        switch (match) {
			
            
            default:
                return null;
        }
    }

    @Override
    public String getType(final Uri uri) {

        switch (sUriMatcher.match(uri)) {
			

            default:
                return null;
        }
    }

}



