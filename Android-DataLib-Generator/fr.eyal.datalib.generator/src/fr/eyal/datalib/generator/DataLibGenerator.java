package fr.eyal.datalib.generator;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.ObjectInputStream.GetField;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import fr.eyal.datalib.generator.acceleo.common.Main;
import fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject;
import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibFactory;
import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.WebService;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.DataLibOption;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.HttpMethod;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParameterType;
import fr.eyal.lib.datalib.genmodel.android.datalib.content.ParseType;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.Field;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelFactory;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObjectDAO;


public class DataLibGenerator {

	public static final String MODEL_EXTENSION = "xmi";
	public static final String SCHEMA_LOCATION = "http://www.eyal.fr/android/datalib datalib.ecore#//datalib http://www.eyal.fr/datalib/android/model datalib.ecore#//datalib/model";
	public static final String OPTION_SCHEMA_LOCATION = "SCHEMA_LOCATION";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Initialization of the project");

		String modelPath = "model/project." + MODEL_EXTENSION;
		
		if(args.length < 2)
			throw new IllegalArgumentException("The number of arguments have to be equal to 2. Input path, then, folder path");
		
		String inputPath = args[0];
		String folderPath = args[1]; //"src-gen";
		System.out.println("Ressource path: " + inputPath);
		System.out.println("Target folder: " + folderPath);
		
		
		//we parse the content
		
		//we create the XMI model content
		DataLibProject project = createXMI(modelPath, inputPath); //"model/apilogin.xml"); //"platform:/resource/DataLibGeneratorAcceleo/model/apilogin.xml");
	    
	    String[] generationArgs = {
	    		folderPath
	    };

		System.out.println("Generation...");

	    //we start the generation
		Main.main(project, generationArgs);
		
		System.out.println("Generation done !");
	}


	public static DataLibProject createXMI(String modelPath, String inputPath) {
		
		//initialize the model
		DatalibPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();

		System.out.println("Creation of the model...");
		DataLibProject project = null;
		
        final SAXParserFactory saxFactory = SAXParserFactory.newInstance();
        try {
            final SAXParser sp = saxFactory.newSAXParser();
            
            DataLibGeneratorParser parser = new DataLibGeneratorParser();
            System.out.println("start parsing input");
            sp.parse(inputPath, parser);
            System.out.println("end parsing SAX");
            
            project = parser.getParseResult();
            
        } catch (final Exception e) {
            e.printStackTrace();
        }

		
		System.out.println("Storing for backup");

		// Register the XMI resource factory for the #MODEL_EXTENSION
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put(MODEL_EXTENSION, new XMIResourceFactoryImpl());
		
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    resSet.getPackageRegistry().put("http://www.eyal.fr/android/datalib", DatalibPackage.eINSTANCE);
	    resSet.getLoadOptions().put(XMIResource.OPTION_SCHEMA_LOCATION, true);
	    // Create a resource
	    URI uri = URI.createURI(modelPath);
	    Resource resource = resSet.createResource(uri);
	    //Get the first model element and cast it to the right type, in my
	    //example everything is hierarchical included in this first node
	    resource.getContents().add(project);

	    //we save the content
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
		return project;
	}

	
	/*
	 * CREATION TOOLS 
	 */
	
	/**
	 * Create a ResponseBusinessObject filled with the following parameters
	 * 
	 * @param modelFactory
	 * @param name name of the BusinessObject
	 * @param packageName package name
	 * @param parseId parse ID
	 * @param xmlName XML name
	 * @param parent the father BusinessObject
	 * @param childs the child(s) BusinessObject
	 * @param xmlAttributes XML attributes
	 * @param attributes attributes
	 * @param contentFields content fields
	 * 
	 * @return the BusinessObject
	 */
	public static ResponseBusinessObject createResponseBusinessObject(ModelFactory modelFactory, String name, String packageName, BigInteger parseId, String xmlName, BusinessObject parent, ArrayList<BusinessObject> childs, ArrayList<Field> attributes, ArrayList<Field> contentFields) {
		ResponseBusinessObject responseBusinessObject = modelFactory.createResponseBusinessObject();

		//we fill the BusinessObject
		fillBusinessObject(responseBusinessObject, name, packageName, parseId, xmlName, parent, childs, attributes, contentFields);
		
		return responseBusinessObject;
	}

	/**
	 * @param modelFactory
	 */
	public static BusinessObject createBusinessObject(ModelFactory modelFactory, String name, String packageName, BigInteger parseId, String xmlName, BusinessObject parent, ArrayList<BusinessObject> childs, ArrayList<Field> attributes, ArrayList<Field> contentFields) {
		BusinessObject businessObject = modelFactory.createBusinessObject();

		//we fill the BusinessObject
		fillBusinessObject(businessObject, name, packageName, parseId, xmlName, parent, childs, attributes, contentFields);
		
		return businessObject;
	}

	/**
	 * @param modelFactory
	 */
	public static BusinessObjectDAO createBusinessObjectDAO(ModelFactory modelFactory, String name, String packageName, BigInteger parseId, String xmlName, BusinessObject parent, ArrayList<BusinessObject> childs, ArrayList<Field> attributes, ArrayList<Field> contentFields, DataLibProject project) {
		BusinessObjectDAO businessObject = modelFactory.createBusinessObjectDAO();

		//we fill the BusinessObject
		fillBusinessObjectDAO(businessObject, name, packageName, parseId, xmlName, parent, childs, attributes, contentFields, project);
		
		return businessObject;
	}

	
	/**
	 * @param modelFactory
	 */
	public static ResponseBusinessObjectDAO createResponseBusinessObjectDAO(ModelFactory modelFactory, String name, String packageName, BigInteger parseId, String xmlName, BusinessObject parent, ArrayList<BusinessObject> childs, ArrayList<Field> attributes, ArrayList<Field> contentFields, DataLibProject project) {
		ResponseBusinessObjectDAO businessObject = modelFactory.createResponseBusinessObjectDAO();

		//we fill the BusinessObject
		fillBusinessObjectDAO(businessObject, name, packageName, parseId, xmlName, parent, childs, attributes, contentFields, project);
		
		return businessObject;
	}

	
/**
	 * @param businessObject
	 * @param name
	 * @param packageName
	 * @param parseId
	 * @param xmlName
	 * @param parent
	 * @param childs
	 * @param xmlAttributes
	 * @param attributes
	 * @param contentFields
	 * @param project
	 */
	public static void fillBusinessObjectDAO(BusinessObjectDAO businessObject, String name, String packageName, BigInteger parseId, String xmlName, BusinessObject parent, ArrayList<BusinessObject> childs, ArrayList<Field> attributes, ArrayList<Field> contentFields, DataLibProject project) {

		fillBusinessObject(businessObject, name, packageName, parseId, xmlName, parent, childs, attributes, contentFields);
		businessObject.setProject(project);
	}

	
	/**
	 * @param businessObject
	 * @param name
	 * @param packageName
	 * @param parseId
	 * @param xmlName
	 * @param parent
	 * @param childs
	 * @param xmlAttributes
	 * @param attributes
	 * @param contentFields
	 */
	public static void fillBusinessObject(BusinessObject businessObject, String name, String packageName, BigInteger parseId, String xmlName, BusinessObject parent, ArrayList<BusinessObject> childs, ArrayList<Field> attributes, ArrayList<Field> contentFields) {

		businessObject.setName(name);
		businessObject.setPackage(packageName);
		businessObject.setParseId(parseId);
		businessObject.setXmlName(xmlName);
		
		businessObject.setParent(parent);
		if(childs != null) businessObject.getChilds().addAll(childs);
		if(attributes != null) businessObject.getAttributes().addAll(attributes);
//		if(xmlAttributes != null) businessObject.getXmlAttributes().addAll(xmlAttributes);
		if(contentFields != null) businessObject.getContentFields().addAll(contentFields);
	}
	
	/**
	 * @param modelFactory
	 * @param name
	 * @param type
	 * @param description
	 * @return
	 */
	public static Parameter createParameter(ModelFactory modelFactory, String name, ParameterType type, String description){
		Parameter parameter = modelFactory.createParameter();
		fillParameter(parameter, name, type, description);
		
		return parameter;
	}

	/**
	 * @param modelFactory
	 * @param name
	 * @param type
	 * @param description
	 * @return
	 */
	public static Field createField(ModelFactory modelFactory, String name, ParameterType type, String description, String defaultValue, String xmlName, BigInteger parseId, ArrayList<Field> xmlAttributes, BusinessObject businessObject, ArrayList<Field> xmlContentFields){
		Field field = modelFactory.createField();
		fillParameter(field, name, type, description);
		field.setDefaultValue(defaultValue);
		field.setXmlName(xmlName);
		field.setParseId(parseId);
		field.setBusinessObject(businessObject);
		if(xmlAttributes != null) field.getXmlAttributes().addAll(xmlAttributes);
		if(xmlContentFields != null) field.getXmlContentFields().addAll(xmlContentFields);
		
		return field;
	}

	/**
	 * Create a {@link FieldBusinessObject}
	 * 
	 * @param modelFactory
	 * @param name
	 * @param type
	 * @param description
	 * @param defaultValue
	 * @param xmlName
	 * @param parseId
	 * @param xmlAttributes
	 * @param businessObject
	 * @param xmlContentFields
	 * @param content
	 * @return
	 */
	public static FieldBusinessObject createFieldBusinessObject(ModelFactory modelFactory, String name, ParameterType type, String description, String defaultValue, String xmlName, BigInteger parseId, ArrayList<Field> xmlAttributes, BusinessObject businessObject, ArrayList<Field> xmlContentFields, BusinessObject content, Field xmlParent){
		
		FieldBusinessObject field = modelFactory.createFieldBusinessObject();
		fillParameter(field, name, type, description);
		field.setDefaultValue(defaultValue);
		field.setXmlName(xmlName);
		field.setParseId(parseId);
		field.setBusinessObject(businessObject);
		if(xmlAttributes != null) field.getXmlAttributes().addAll(xmlAttributes);
		if(xmlContentFields != null) field.getXmlContentFields().addAll(xmlContentFields);

		field.setContent(content);	
		field.setXmlParent(xmlParent);
		return field;
	}

	
	/**
	 * @param name
	 * @param type
	 * @param description
	 * @param parameter
	 */
	public static void fillParameter(Parameter parameter, String name, ParameterType type, String description) {
		parameter.setName(name);
		parameter.setType(type);
		parameter.setDescription(description);
	}

	/**
	 * @param factory
	 * @param project
	 * @param contentResponse
	 * @param cached
	 * @param method
	 * @param name
	 * @param packageName
	 * @param parseType
	 * @param url
	 * @param options
	 * @param parameters
	 * @return 
	 */
	public static WebService createWebservice(DatalibFactory factory, DataLibProject project, ResponseBusinessObject contentResponse, boolean cached, HttpMethod method, String name, String packageName, ParseType parseType, String url, ArrayList<DataLibOption> options, ArrayList<Parameter> parameters) {
		WebService webService1 = factory.createWebService();
		
		fillWebService(contentResponse, cached, method, name, packageName, parseType, url, options, parameters, webService1);
		
		project.getWebservices().add(webService1);
		
		return webService1;
	}


	/**
	 * @param contentResponse
	 * @param cached
	 * @param method
	 * @param name
	 * @param packageName
	 * @param parseType
	 * @param url
	 * @param options
	 * @param parameters
	 * @param webService
	 */
	public static void fillWebService(ResponseBusinessObject contentResponse, boolean cached, HttpMethod method, String name, String packageName,
			ParseType parseType, String url, ArrayList<DataLibOption> options, ArrayList<Parameter> parameters, WebService webService) {
		webService.setCached(cached);
		webService.setMethod(method);
		webService.setName(name);
		webService.setPackage(packageName);
		webService.setParseType(parseType);
		webService.setUrl(url);
		webService.setContentResponse(contentResponse);
		if(options != null) webService.getOptions().addAll(options);
		if(parameters != null) webService.getParameters().addAll(parameters);
	}

	/**
	 * @param factory
	 * @param authority
	 * @param databaseName
	 * @param databaseVersion
	 * @param name
	 * @param packageName
	 * @return
	 */
	public static DataLibProject createProject(DatalibFactory factory, String authority, String databaseName, String databaseVersion, String name, String packageName) {
		DataLibProject project = factory.createDataLibProject();
		project.setAuthority(authority);
		project.setDatabaseName(databaseName);
		project.setDatabaseVersion(databaseVersion);
		project.setName(name);
		project.setPackage(packageName);
		
		return project;
	}

}
