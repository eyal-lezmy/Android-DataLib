package fr.eyal.datalib.sample.netflix.data.service;

import java.io.UnsupportedEncodingException;

import android.content.Context;
import fr.eyal.lib.data.communication.rest.ParameterMap;
import fr.eyal.lib.data.service.ServiceHelper;
import fr.eyal.lib.data.service.model.DataLibRequest;

public class NetflixServiceHelper extends ServiceHelper {

	    public static final String URL_CATALOGTITLES = "http://api-public.netflix.com/catalog/titles";
	

    protected NetflixServiceHelper(final Context context) {
        super(context);
    }

    /**
     * Get the instance of the {@link NetflixServiceHelper}
     * 
     * @param context The context of execution. Any Context can be put here, the application context
     * will be automatically used for the {@link NetflixServiceHelper}
     * 
     * @return Returns the singleton
     */
    public static NetflixServiceHelper getInstance(final Context context) {
        synchronized (NetflixServiceHelper.class) {
			if (sInstance == null) {
            	sInstance = new NetflixServiceHelper(context.getApplicationContext());
        	}
		}
        return (NetflixServiceHelper) sInstance;
    }

    /**
     * Get the instance of the {@link NetflixServiceHelper}
     *  
     * @return Returns the singleton <b>only if</b> the instance have already been create by the call to 
     * <code>{@linkplain NetflixServiceHelper#getInstance(Context)}</code>. If it has not been called, this 
     * function returns <b>null</b>
     */
    public static NetflixServiceHelper getInstance() {
		if (sInstance == null) {
        	return null;
    	}
        return (NetflixServiceHelper) sInstance;
    }




    /**
     * Start {@link CatalogTitles} request
     * 
     * @param max_results Maximum number of results expected. If this parameter is not present, the default value is 25.. To disable the adding of it, just define it as null
     * @param oauth_consumer_key The OAuth consumer key of the developer. To disable the adding of it, just define it as null
     * @param oauth_nonce A random string. To disable the adding of it, just define it as null
     * @param oauth_signature_method The OAuth signature method. Here we use HMAC-SHA1. To disable the adding of it, just define it as null
     * @param oauth_timestamp The current timestamp. To disable the adding of it, just define it as null
     * @param start_index Start index of the result (to paginate the results). This value is linked to max_result. To disable the adding of it, just define it as null
     * @param term The term of the content you are looking for. To disable the adding of it, just define it as null
     *
     * @return the request's id. If the request have already been sent, it returns the id previously generated. Otherwise it provide a new one that have to be stored.
     * 
     * @throws UnsupportedEncodingException
     */
	public int getCatalogTitles(final int max_results, final String oauth_consumer_key, final String oauth_nonce, final String oauth_signature_method, final int oauth_timestamp, final String start_index, final String term,  final int options) throws UnsupportedEncodingException {

		//we prepare the parameters
        final ParameterMap params = new ParameterMap();
		params.put("max_results", String.valueOf(max_results));
        if (oauth_consumer_key != null)
        	params.put("oauth_consumer_key", oauth_consumer_key);
        if (oauth_nonce != null)
        	params.put("oauth_nonce", oauth_nonce);
        if (oauth_signature_method != null)
        	params.put("oauth_signature_method", oauth_signature_method);
		params.put("oauth_timestamp", String.valueOf(oauth_timestamp));
        if (start_index != null)
        	params.put("start_index", start_index);
        if (term != null)
        	params.put("term", term);
        
        return launchRequest(options, NetflixService.WEBSERVICE_CATALOGTITLES, params, NetflixService.class, URL_CATALOGTITLES);
    }
    

}

