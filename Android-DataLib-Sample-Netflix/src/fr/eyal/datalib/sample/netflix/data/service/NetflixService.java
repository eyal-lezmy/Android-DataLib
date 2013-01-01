package fr.eyal.datalib.sample.netflix.data.service;

import android.content.pm.PackageManager;
import android.net.NetworkInfo;
import fr.eyal.lib.data.parser.GenericHandler;
import fr.eyal.lib.data.processor.Processor;
import fr.eyal.lib.data.service.DataLibService;
import fr.eyal.lib.data.service.model.DataLibRequest;
import fr.eyal.datalib.sample.netflix.data.config.CatalogTitlesWebConfig;
import fr.eyal.datalib.sample.netflix.data.parser.CatalogTitlesParser;

public class NetflixService extends DataLibService {

    //different Service's possible actions
	public static final int WEBSERVICE_CATALOGTITLES = 1;

    public NetflixService() {
        super();
    }

    @Override
    public void launchProcessor(final int processorType, final DataLibRequest request) {

        Processor processor = new Processor(this, mHeaders);
        GenericHandler handler = null;

        //We initiate the specific workers
        switch (processorType) {

			case WEBSERVICE_CATALOGTITLES:
			    CatalogTitlesWebConfig.applyToRequest(request, CatalogTitlesWebConfig.getInstance());
			    handler = new CatalogTitlesParser();
			    break;
			default:
            	return;
        }

		//we check the presence of the ACCESS_NETWORK_STATE
        PackageManager pm = getPackageManager();
        if (pm.checkPermission("android.permission.ACCESS_NETWORK_STATE", getPackageName()) == PackageManager.PERMISSION_GRANTED) {

            NetworkInfo infos = mConnectivityManager.getActiveNetworkInfo();
            boolean isConnected = (infos != null && infos.isConnected());
            processor.start(request, isConnected, handler, this);

        } else {
        	throw new SecurityException("android.permission.ACCESS_NETWORK_STATE needed. Add it to te manifest to be able to use this function");
        }
    }

}

