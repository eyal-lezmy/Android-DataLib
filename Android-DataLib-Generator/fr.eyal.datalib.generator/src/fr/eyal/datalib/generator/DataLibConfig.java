package fr.eyal.datalib.generator;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType;

public class DataLibConfig {

	public static final String DEFAUT_PROJECT_NAME = "DataLibProject";
	public static final String DEFAUT_PROJECT_PACKAGE = "com.android.datalib";
	public static final String DEFAUT_PROJECT_AUTHORITY = "com.android.datalib.provider";
	public static final String DEFAUT_PROJECT_DATABASE_NAME = "datalibcache";
	public static final String DEFAUT_PROJECT_DATABASE_VERSION = "1";

	public static final boolean DEFAUT_WEBSERVICE_CACHED = true;
	public static final HttpMethod DEFAUT_WEBSERVICE_HTTP_METHOD = HttpMethod.GET;
	public static final ParseType DEFAUT_WEBSERVICE_PARSE_TYPE = ParseType.SAX;
	public static final ParameterType DEFAUT_WEBSERVICE_PARAMETER_TYPE = ParameterType.STRING;
	
	
}
