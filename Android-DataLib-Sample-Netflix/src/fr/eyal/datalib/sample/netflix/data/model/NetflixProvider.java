package fr.eyal.datalib.sample.netflix.data.model;

import android.content.UriMatcher;
import android.net.Uri;
import fr.eyal.lib.data.model.provider.BusinessObjectProvider;
import fr.eyal.datalib.sample.netflix.data.model.people.*;
import fr.eyal.datalib.sample.netflix.data.model.filmography.*;
import fr.eyal.datalib.sample.netflix.data.model.movie.*;
import fr.eyal.datalib.sample.netflix.data.model.synopsis.*;
import fr.eyal.datalib.sample.netflix.data.model.cast.*;
import fr.eyal.datalib.sample.netflix.data.model.directors.*;

// Start of user code NetflixProvider imports
// You can add here your personal imports
// DO NOT MODIFY THE GENERATED COMMENTS "Start of user code" and "End of user code

public class NetflixProvider extends BusinessObjectProvider {

    public static final String AUTHORITY = "fr.eyal.datalib.sample.netflix.datacache.provider";

    /**
     * Tables' Codes
     */
	public static final int CODE_PEOPLE = 15;
	public static final int CODE_PEOPLE_PEOPLELINK = 20;
	
	public static final int CODE_FILMOGRAPHY = 21;
	public static final int CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM = 24;
	public static final int CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYLINK = 28;
	public static final int CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYCATEGORY = 30;
	
	public static final int CODE_MOVIE = 33;
	public static final int CODE_MOVIE_MOVIELINK = 39;
	public static final int CODE_MOVIE_MOVIECATEGORY = 41;
	
	public static final int CODE_SYNOPSIS = 44;
	
	public static final int CODE_CAST = 47;
	public static final int CODE_CAST_CASTPERSON = 50;
	public static final int CODE_CAST_CASTPERSON_CASTLINK = 54;
	
	public static final int CODE_DIRECTORS = 55;
	public static final int CODE_DIRECTORS_DIRECTOR = 58;
	public static final int CODE_DIRECTORS_DIRECTOR_DIRECTORLINK = 62;

    static {

        DATABASE_NAME = "datalib_cache";
        DATABASE_VERSION = 3;

        //Tables' names list
        String[] LOCAL_DATABASE_TABLES_NAMES = {
				People.DATABASE_TABLE_NAME,
				PeopleLink.DATABASE_TABLE_NAME,
				Filmography.DATABASE_TABLE_NAME,
				Filmography_item.DATABASE_TABLE_NAME,
				FilmographyLink.DATABASE_TABLE_NAME,
				FilmographyCategory.DATABASE_TABLE_NAME,
				Movie.DATABASE_TABLE_NAME,
				MovieLink.DATABASE_TABLE_NAME,
				MovieCategory.DATABASE_TABLE_NAME,
				Synopsis.DATABASE_TABLE_NAME,
				Cast.DATABASE_TABLE_NAME,
				CastPerson.DATABASE_TABLE_NAME,
				CastLink.DATABASE_TABLE_NAME,
				Directors.DATABASE_TABLE_NAME,
				Director.DATABASE_TABLE_NAME,
				DirectorLink.DATABASE_TABLE_NAME,
        };
        DATABASE_TABLES_NAMES = LOCAL_DATABASE_TABLES_NAMES;

        //Tables' fields' names list
        String[][] LOCAL_DATABASE_TABLES_FIELDS_NAMES = {
                People.DATABASE_TABLE_FIELDS_NAMES,
                PeopleLink.DATABASE_TABLE_FIELDS_NAMES,
                Filmography.DATABASE_TABLE_FIELDS_NAMES,
                Filmography_item.DATABASE_TABLE_FIELDS_NAMES,
                FilmographyLink.DATABASE_TABLE_FIELDS_NAMES,
                FilmographyCategory.DATABASE_TABLE_FIELDS_NAMES,
                Movie.DATABASE_TABLE_FIELDS_NAMES,
                MovieLink.DATABASE_TABLE_FIELDS_NAMES,
                MovieCategory.DATABASE_TABLE_FIELDS_NAMES,
                Synopsis.DATABASE_TABLE_FIELDS_NAMES,
                Cast.DATABASE_TABLE_FIELDS_NAMES,
                CastPerson.DATABASE_TABLE_FIELDS_NAMES,
                CastLink.DATABASE_TABLE_FIELDS_NAMES,
                Directors.DATABASE_TABLE_FIELDS_NAMES,
                Director.DATABASE_TABLE_FIELDS_NAMES,
                DirectorLink.DATABASE_TABLE_FIELDS_NAMES,
        };
        DATABASE_TABLES_FIELDS_NAMES = LOCAL_DATABASE_TABLES_FIELDS_NAMES;

        //Tables' fields' names list
        String[] LOCAL_CREATE_TABLES = {
				People.CREATE_TABLE,
				PeopleLink.CREATE_TABLE,
				Filmography.CREATE_TABLE,
				Filmography_item.CREATE_TABLE,
				FilmographyLink.CREATE_TABLE,
				FilmographyCategory.CREATE_TABLE,
				Movie.CREATE_TABLE,
				MovieLink.CREATE_TABLE,
				MovieCategory.CREATE_TABLE,
				Synopsis.CREATE_TABLE,
				Cast.CREATE_TABLE,
				CastPerson.CREATE_TABLE,
				CastLink.CREATE_TABLE,
				Directors.CREATE_TABLE,
				Director.CREATE_TABLE,
				DirectorLink.CREATE_TABLE,
        };
        CREATE_TABLES = LOCAL_CREATE_TABLES;

        //Email URI matching table
        UriMatcher matcher = sUriMatcher;

        //We add each URIs into the matcher
		matcher.addURI(AUTHORITY, People.CONTENT_PATH, CODE_PEOPLE);
		matcher.addURI(AUTHORITY, PeopleLink.CONTENT_PATH, CODE_PEOPLE_PEOPLELINK);
		matcher.addURI(AUTHORITY, Filmography.CONTENT_PATH, CODE_FILMOGRAPHY);
		matcher.addURI(AUTHORITY, Filmography_item.CONTENT_PATH, CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM);
		matcher.addURI(AUTHORITY, FilmographyLink.CONTENT_PATH, CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYLINK);
		matcher.addURI(AUTHORITY, FilmographyCategory.CONTENT_PATH, CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYCATEGORY);
		matcher.addURI(AUTHORITY, Movie.CONTENT_PATH, CODE_MOVIE);
		matcher.addURI(AUTHORITY, MovieLink.CONTENT_PATH, CODE_MOVIE_MOVIELINK);
		matcher.addURI(AUTHORITY, MovieCategory.CONTENT_PATH, CODE_MOVIE_MOVIECATEGORY);
		matcher.addURI(AUTHORITY, Synopsis.CONTENT_PATH, CODE_SYNOPSIS);
		matcher.addURI(AUTHORITY, Cast.CONTENT_PATH, CODE_CAST);
		matcher.addURI(AUTHORITY, CastPerson.CONTENT_PATH, CODE_CAST_CASTPERSON);
		matcher.addURI(AUTHORITY, CastLink.CONTENT_PATH, CODE_CAST_CASTPERSON_CASTLINK);
		matcher.addURI(AUTHORITY, Directors.CONTENT_PATH, CODE_DIRECTORS);
		matcher.addURI(AUTHORITY, Director.CONTENT_PATH, CODE_DIRECTORS_DIRECTOR);
		matcher.addURI(AUTHORITY, DirectorLink.CONTENT_PATH, CODE_DIRECTORS_DIRECTOR_DIRECTORLINK);
    }

    @Override
    protected String getTableName(final int match) {
        switch (match) {
			case CODE_PEOPLE:
			    return People.DATABASE_TABLE_NAME;
			case CODE_PEOPLE_PEOPLELINK:
			    return PeopleLink.DATABASE_TABLE_NAME;
			
			case CODE_FILMOGRAPHY:
			    return Filmography.DATABASE_TABLE_NAME;
			case CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM:
			    return Filmography_item.DATABASE_TABLE_NAME;
			case CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYLINK:
			    return FilmographyLink.DATABASE_TABLE_NAME;
			case CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYCATEGORY:
			    return FilmographyCategory.DATABASE_TABLE_NAME;
			
			case CODE_MOVIE:
			    return Movie.DATABASE_TABLE_NAME;
			case CODE_MOVIE_MOVIELINK:
			    return MovieLink.DATABASE_TABLE_NAME;
			case CODE_MOVIE_MOVIECATEGORY:
			    return MovieCategory.DATABASE_TABLE_NAME;
			
			case CODE_SYNOPSIS:
			    return Synopsis.DATABASE_TABLE_NAME;
			
			case CODE_CAST:
			    return Cast.DATABASE_TABLE_NAME;
			case CODE_CAST_CASTPERSON:
			    return CastPerson.DATABASE_TABLE_NAME;
			case CODE_CAST_CASTPERSON_CASTLINK:
			    return CastLink.DATABASE_TABLE_NAME;
			
			case CODE_DIRECTORS:
			    return Directors.DATABASE_TABLE_NAME;
			case CODE_DIRECTORS_DIRECTOR:
			    return Director.DATABASE_TABLE_NAME;
			case CODE_DIRECTORS_DIRECTOR_DIRECTORLINK:
			    return DirectorLink.DATABASE_TABLE_NAME;
            
            default:
                return null;
        }
    }

    @Override
    public String getType(final Uri uri) {

        switch (sUriMatcher.match(uri)) {
			case CODE_PEOPLE:
			    return People.CONTENT_URL;
			case CODE_PEOPLE_PEOPLELINK:
			    return PeopleLink.CONTENT_URL;
			
			case CODE_FILMOGRAPHY:
			    return Filmography.CONTENT_URL;
			case CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM:
			    return Filmography_item.CONTENT_URL;
			case CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYLINK:
			    return FilmographyLink.CONTENT_URL;
			case CODE_FILMOGRAPHY_FILMOGRAPHY_ITEM_FILMOGRAPHYCATEGORY:
			    return FilmographyCategory.CONTENT_URL;
			
			case CODE_MOVIE:
			    return Movie.CONTENT_URL;
			case CODE_MOVIE_MOVIELINK:
			    return MovieLink.CONTENT_URL;
			case CODE_MOVIE_MOVIECATEGORY:
			    return MovieCategory.CONTENT_URL;
			
			case CODE_SYNOPSIS:
			    return Synopsis.CONTENT_URL;
			
			case CODE_CAST:
			    return Cast.CONTENT_URL;
			case CODE_CAST_CASTPERSON:
			    return CastPerson.CONTENT_URL;
			case CODE_CAST_CASTPERSON_CASTLINK:
			    return CastLink.CONTENT_URL;
			
			case CODE_DIRECTORS:
			    return Directors.CONTENT_URL;
			case CODE_DIRECTORS_DIRECTOR:
			    return Director.CONTENT_URL;
			case CODE_DIRECTORS_DIRECTOR_DIRECTORLINK:
			    return DirectorLink.CONTENT_URL;

            default:
                return null;
        }
    }

// Start of user code NetflixProvider
// You can add here your personal content
// DO NOT MODIFY THE GENERATED COMMENTS "Start of user code" and "End of user code

}



