package fr.eyal.datalib.sample.netflix.data.config;

import fr.eyal.lib.data.service.DataLibWebConfig;
import fr.eyal.lib.data.service.model.DataLibRequest;

public class CatalogTitlesWebConfig extends DataLibWebConfig {

    protected static CatalogTitlesWebConfig sInstance; //Singleton of the WebConfig

    public static CatalogTitlesWebConfig getInstance() {
        synchronized (CatalogTitlesWebConfig.class) {
	        if (sInstance == null) {
	            sInstance = new CatalogTitlesWebConfig();
	        }
		}
        return (CatalogTitlesWebConfig) sInstance;
    }

    private CatalogTitlesWebConfig() {}

    private int httpType = DataLibRequest.HTTP_REST_GET;
	private int requestOptions = 
			DataLibRequest.OPTION_DATABASE_CACHE_DISABLED;
    private int parseType = DataLibRequest.PARSE_TYPE_SAX_XML;

    /**
     * Get the HTTP type o the request
     * @return the corresponding
     */
    @Override
    public int getHttpType() {
        return httpType;
    }

    @Override
    public int getParseType() {
        return parseType;
    }

    @Override
    public int getRequestOptions() {
        return requestOptions;
    }
}

