package fr.eyal.datalib.sample.netflix.util;

import android.graphics.drawable.BitmapDrawable;
import fr.eyal.datalib.sample.cache.BitmapMemoryLruCache;
import fr.eyal.lib.util.Out;

public class Resources {

	private static Resources sInstance = null;

	/**
	 * The {@link BitmapDrawable} cache of the application
	 */
	public BitmapMemoryLruCache mBitmapCache;
	
	
	public static synchronized Resources getInstance() {
		synchronized (Resources.class) {
			if (sInstance == null) {
				sInstance = new Resources();
			}
			return sInstance;
		}
	}

	public Resources(){		
		if(mBitmapCache == null){
			//we initialize the bitmap cache
			final int maxMemory = (int) Runtime.getRuntime().maxMemory()/5;
			Out.w("", "CACHE SIZE = "+maxMemory);

			mBitmapCache = new BitmapMemoryLruCache(maxMemory);
		}
	}

	
}
