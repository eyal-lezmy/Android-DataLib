package fr.eyal.datalib.sample.netflix.data.service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.net.NetworkInfo;
import fr.eyal.lib.data.communication.rest.ParameterMap;
import fr.eyal.lib.data.model.BusinessObjectDAO;
import fr.eyal.lib.data.model.ResponseBusinessObjectDAO;
import fr.eyal.lib.data.service.DataManager;
import fr.eyal.lib.data.service.ServiceHelper;
import fr.eyal.lib.data.service.model.DataLibRequest;
import fr.eyal.datalib.sample.netflix.data.model.catalogtitles.*;
import fr.eyal.datalib.sample.netflix.data.model.NetflixProvider;

public class NetflixDataManager extends DataManager {

    @SuppressWarnings("unused")
    private static final String TAG = NetflixDataManager.class.getSimpleName();

    /**
     * Get the instance of the {@link NetflixDataManager}
     * 
     * @param context The context of execution. Any Context can be put here, the application context
     * will be automatically used for the {@link NetflixDataManager}
     * 
     * @return Returns the singleton
     */
    public static NetflixDataManager getInstance(final Context context) {
        synchronized (NetflixDataManager.class) {
			if (sInstance == null) {
            	sInstance = new NetflixDataManager(context.getApplicationContext());
        	}
		}
        return (NetflixDataManager) sInstance;
    }

    /**
     * Get the instance of the {@link NetflixDataManager}
     *  
     * @return Returns the singleton <b>only if</b> the instance have already been create by the call to 
     * <code>{@linkplain NetflixDataManager#getInstance(Context)}</code>. If it has not been called, this 
     * function returns <b>null</b>
     */
    public static NetflixDataManager getInstance() {
		if (sInstance == null) {
        	return null;
    	}
        return (NetflixDataManager) sInstance;
    }


    protected NetflixDataManager(final Context context) {
        super(context);

        mServiceHelper = NetflixServiceHelper.getInstance(context);
        mServiceHelper.addOnRequestFinishedRelayer(this);
    }

    @Override
    public BusinessObjectDAO getBusinessObjectFromCacheByUrl(final int type, final String url) {

        switch (type) {
            case NetflixService.WEBSERVICE_CATALOGTITLES:
            	return new CatalogTitles(url);
            default:
                return null;
        }
    }


    @Override
    protected ResponseBusinessObjectDAO getResponseBusinessObjectById(final int webserviceType, final long id) {

        switch (webserviceType) {
            case NetflixService.WEBSERVICE_CATALOGTITLES:
            	return new CatalogTitles(id);

            default:
                return null;
        }
    }


    @Override
    protected ArrayList<?> getBusinessObjectsFromDatabase(final int code, final String where, final String[] whereArgs, final String order, final boolean join) {

        switch (code) {
			case NetflixProvider.CODE_CATALOGTITLES:
				return NetflixDataManager.this.retrieveDataCatalogTitles(where, whereArgs, order, join);
			
			case NetflixProvider.CODE_CATALOGTITLES_CATALOGTITLE:
				return NetflixDataManager.this.retrieveDataCatalogTitle(where, whereArgs, order, join);
			
			case NetflixProvider.CODE_CATALOGTITLES_CATALOGTITLE_CATEGORY:
				return NetflixDataManager.this.retrieveDataCategory(where, whereArgs, order);
			case NetflixProvider.CODE_CATALOGTITLES_CATALOGTITLE_LINK:
				return NetflixDataManager.this.retrieveDataLink(where, whereArgs, order);

            default:
                return null;
        }
    }


    /**
     * Get {@link CatalogTitles} objects from the database thanks to standard SQL selectors.
     * 
     * @param where A filter declaring which rows to return, formatted as an SQL WHERE
     * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
     * 
     * @param whereArgs You may include ?s in selection, which will be replaced by the values
     * from selectionArgs, in the order that they appear in the selection. The values will be
     * bound as Strings.
     * 
     * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
     * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
     * 
     * @param join Tells if the {@link CatalogTitles} objects returned have to get his children's
     * arrays filled thanks to the database.
     * 
     * @return An {@link ArrayList} of the {@link CatalogTitles} objects fetch in the database,
     * corresponding to the sent request.
     */
	@SuppressWarnings("unchecked")
    private ArrayList<CatalogTitles> retrieveDataCatalogTitles(final String where, final String[] whereArgs, final String order, final boolean join) {

    	final Cursor c = this.mContentResolver.query(CatalogTitles.CONTENT_URI,
    			CatalogTitles.DATABASE_TABLE_FIELDS_NAMES,
    			where,
    			whereArgs,
    			order);

    	return (ArrayList<CatalogTitles>) CatalogTitles.buildArrayFromCursor(c, join);
    }

    /**
     * Get {@link CatalogTitles} objects from the database asynchronously thanks to standard
     * SQL selectors.
     * 
     * @param where A filter declaring which rows to return, formatted as an SQL WHERE
     * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
     * 
     * @param whereArgs You may include ?s in selection, which will be replaced by the values
     * from selectionArgs, in the order that they appear in the selection. The values will be
     * bound as Strings.
     * 
     * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
     * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
     * 
     * @param join Tells if the {@link CatalogTitles} objects returned have to get his children's
     * arrays filled thanks to the database.
     * 
     * @param listener The {@link OnDataListener} that will receive the {@link ArrayList} of fetched
     * objects.
     * 
     * @return The request id generated by the {@link DataManager}.
     * 
     * @see cancelRequest() To cancel this request before the response come.
     */
    public synchronized int retrieveDataCatalogTitlesAsync(final String where, final String[] whereArgs, final String order, final boolean join, final OnDataListener listener){

    	return startDatabaseAsyncAccess(NetflixProvider.CODE_CATALOGTITLES, where, whereArgs, order, join, listener);
    }

	/**
	 * Get {@link CatalogTitle} objects from the database thanks to standard SQL selectors.
	 * 
	 * @param where A filter declaring which rows to return, formatted as an SQL WHERE
	 * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
	 * 
	 * @param whereArgs You may include ?s in selection, which will be replaced by the values
	 * from selectionArgs, in the order that they appear in the selection. The values will be
	 * bound as Strings.
	 * 
	 * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
	 * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
	 * 
	 * @param join Tells if the {@link CatalogTitle} objects returned have to get his children's
	 * arrays filled thanks to the database.
	 * 
	 * 
	 * @return An {@link ArrayList} of the {@link CatalogTitle} objects fetch in the database,
	 * corresponding to the sent request.
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<CatalogTitle> retrieveDataCatalogTitle(final String where, final String[] whereArgs, final String order, final boolean join) {
		final Cursor c = this.mContentResolver.query(CatalogTitle.CONTENT_URI,
				CatalogTitle.DATABASE_TABLE_FIELDS_NAMES,
				where,
				whereArgs,
				order);
	
		return (ArrayList<CatalogTitle>) CatalogTitle.buildArrayFromCursor(c, join);
	
	}
	
	/**
	 * Get {@link CatalogTitle} objects from the database asynchronously thanks to standard
	 * SQL selectors.
	 * 
	 * @param where A filter declaring which rows to return, formatted as an SQL WHERE
	 * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
	 * 
	 * @param whereArgs You may include ?s in selection, which will be replaced by the values
	 * from selectionArgs, in the order that they appear in the selection. The values will be
	 * bound as Strings.
	 * 
	 * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
	 * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
	 * 
	 * @param join Tells if the {@link CatalogTitle} objects returned have to get his children's
	 * arrays filled thanks to the database.
	 * 
	 * @param listener The {@link OnDataListener} that will receive the {@link ArrayList} of fetched
	 * objects.
	 * 
	 * @return The request id generated by the {@link DataManager}.
	 * 
	 * @see cancelRequest() To cancel this request before the response come.
	 */
	public synchronized int retrieveDataCatalogTitleAsync(final String where, final String[] whereArgs, final String order, final boolean join, final OnDataListener listener){
		return startDatabaseAsyncAccess(NetflixProvider.CODE_CATALOGTITLES_CATALOGTITLE,
				where, whereArgs, order, join, listener);
	}
	
	/**
	 * Get {@link Category} objects from the database thanks to standard SQL selectors.
	 * 
	 * @param where A filter declaring which rows to return, formatted as an SQL WHERE
	 * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
	 * 
	 * @param whereArgs You may include ?s in selection, which will be replaced by the values
	 * from selectionArgs, in the order that they appear in the selection. The values will be
	 * bound as Strings.
	 * 
	 * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
	 * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
	 * 
	 * 
	 * 
	 * @return An {@link ArrayList} of the {@link Category} objects fetch in the database,
	 * corresponding to the sent request.
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<Category> retrieveDataCategory(final String where, final String[] whereArgs, final String order) {
		final Cursor c = this.mContentResolver.query(Category.CONTENT_URI,
				Category.DATABASE_TABLE_FIELDS_NAMES,
				where,
				whereArgs,
				order);
	
		return (ArrayList<Category>) Category.buildArrayFromCursor(c, false);
	
	}
	
	/**
	 * Get {@link Category} objects from the database asynchronously thanks to standard
	 * SQL selectors.
	 * 
	 * @param where A filter declaring which rows to return, formatted as an SQL WHERE
	 * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
	 * 
	 * @param whereArgs You may include ?s in selection, which will be replaced by the values
	 * from selectionArgs, in the order that they appear in the selection. The values will be
	 * bound as Strings.
	 * 
	 * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
	 * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
	 * 
	 * 
	 * @param listener The {@link OnDataListener} that will receive the {@link ArrayList} of fetched
	 * objects.
	 * 
	 * @return The request id generated by the {@link DataManager}.
	 * 
	 * @see cancelRequest() To cancel this request before the response come.
	 */
	public synchronized int retrieveDataCategoryAsync(final String where, final String[] whereArgs, final String order, final boolean join, final OnDataListener listener){
		return startDatabaseAsyncAccess(NetflixProvider.CODE_CATALOGTITLES_CATALOGTITLE_CATEGORY,
				where, whereArgs, order, false, listener);
	}
	/**
	 * Get {@link Link} objects from the database thanks to standard SQL selectors.
	 * 
	 * @param where A filter declaring which rows to return, formatted as an SQL WHERE
	 * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
	 * 
	 * @param whereArgs You may include ?s in selection, which will be replaced by the values
	 * from selectionArgs, in the order that they appear in the selection. The values will be
	 * bound as Strings.
	 * 
	 * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
	 * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
	 * 
	 * 
	 * 
	 * @return An {@link ArrayList} of the {@link Link} objects fetch in the database,
	 * corresponding to the sent request.
	 */
	@SuppressWarnings("unchecked")
	private ArrayList<Link> retrieveDataLink(final String where, final String[] whereArgs, final String order) {
		final Cursor c = this.mContentResolver.query(Link.CONTENT_URI,
				Link.DATABASE_TABLE_FIELDS_NAMES,
				where,
				whereArgs,
				order);
	
		return (ArrayList<Link>) Link.buildArrayFromCursor(c, false);
	
	}
	
	/**
	 * Get {@link Link} objects from the database asynchronously thanks to standard
	 * SQL selectors.
	 * 
	 * @param where A filter declaring which rows to return, formatted as an SQL WHERE
	 * clause (excluding the WHERE itself). Passing null will return all rows for the given URI.
	 * 
	 * @param whereArgs You may include ?s in selection, which will be replaced by the values
	 * from selectionArgs, in the order that they appear in the selection. The values will be
	 * bound as Strings.
	 * 
	 * @param order How to order the rows, formatted as an SQL ORDER BY clause (excluding the
	 * ORDER BY itself). Passing null will use the default sort order, which may be unordered.
	 * 
	 * 
	 * @param listener The {@link OnDataListener} that will receive the {@link ArrayList} of fetched
	 * objects.
	 * 
	 * @return The request id generated by the {@link DataManager}.
	 * 
	 * @see cancelRequest() To cancel this request before the response come.
	 */
	public synchronized int retrieveDataLinkAsync(final String where, final String[] whereArgs, final String order, final boolean join, final OnDataListener listener){
		return startDatabaseAsyncAccess(NetflixProvider.CODE_CATALOGTITLES_CATALOGTITLE_LINK,
				where, whereArgs, order, false, listener);
	}	




    /**
     * Retrieve the {@link CatalogTitles}
     * 
     * @param policy Give the policy context of the request using CACHE and/or NETWORK.
     * 
     * @param datacacheListener The listener who will receive the data from the cache.
     * This parameter IS NEEDED in case of Datacache access (TYPE_CACHE, TYPE_CACHE_THEN_NETWORK
     * and TYPE_NETWORK_OTHERWISE_CACHE). This listener won't be used to send DataLib's response.
     * So, the addOnRequestFinishedListener call is still needed.
     * 
     * @param max_results Maximum number of results expected. If this parameter is not present, the default value is 25.
     * 
     * @param oauth_consumer_key The OAuth consumer key of the developer
     * 
     * @param oauth_nonce A random string
     * 
     * @param oauth_signature_method The OAuth signature method. Here we use HMAC-SHA1
     * 
     * @param oauth_timestamp The current timestamp
     * 
     * @param start_index Start index of the result (to paginate the results). This value is linked to max_result
     * 
     * @param term The term of the content you are looking for
     * 
     * @param options The options added to the request. The list of constants to use in this filed
     * can be found in {@link DataLibRequest} (ex: {@link DataLibRequest#OPTION_CONSERVE_COOKIE_ENABLED} 
     * or {@link DataLibRequest#OPTION_DATABASE_CACHE_DISABLED}, ...).
     * The options can be aggregated thanks to the pipe character '|' (ex: OPTION_CONSERVE_COOKIE_ENABLED |
     * OPTION_DATABASE_CACHE_DISABLED).
     * 
     * @return Returns the request Id if it have been generated by the DataLib. If there is only
     * a Datacache access, the id returned is the constant {@link DataManager#DATACHACHE_REQUEST}.
     * In case of treatment error, it returns {@link DataManager#BAD_REQUEST}.
     * 
     * @throws UnsupportedEncodingException
     */
	public synchronized int getCatalogTitles(final int policy, final OnDataListener datacacheListener, final int max_results, final String oauth_consumer_key, final String oauth_nonce, final String oauth_signature_method, final int oauth_timestamp, final String start_index, final String term, final int options) throws UnsupportedEncodingException {
        //we prepare the parameters
        final ParameterMap params = new ParameterMap();
		params.put("max_results", String.valueOf(max_results));
        params.put("oauth_consumer_key", oauth_consumer_key);
        params.put("oauth_nonce", oauth_nonce);
        params.put("oauth_signature_method", oauth_signature_method);
		params.put("oauth_timestamp", String.valueOf(oauth_timestamp));
        params.put("start_index", start_index);
        params.put("term", term);
        //we prepare the request's url
        final String url = ServiceHelper.getServiceUrl(NetflixServiceHelper.URL_CATALOGTITLES, params);

        int requestId = launchRequest(mServiceHelper, policy, datacacheListener, params, options, url, NetflixService.WEBSERVICE_CATALOGTITLES, NetflixService.class);

		//we add the listener subscription for this request
		if(datacacheListener != null)
			this.addOnDataListener(requestId, datacacheListener);
		
		return requestId;
    }



}
