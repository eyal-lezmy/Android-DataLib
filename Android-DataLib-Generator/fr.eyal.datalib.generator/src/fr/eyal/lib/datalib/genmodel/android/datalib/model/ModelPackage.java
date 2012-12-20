/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eyal.fr/datalib/android/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl <em>Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getBusinessObject()
	 * @generated
	 */
	int BUSINESS_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__CONTENT_FIELDS = 3;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__CHILDS = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PARENT = 5;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__XML_NAME = 6;

	/**
	 * The feature id for the '<em><b>Parse Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PARSE_ID = 7;

	/**
	 * The feature id for the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__RELATED_FIELD = 8;

	/**
	 * The number of structural features of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectDAOImpl <em>Business Object DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectDAOImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getBusinessObjectDAO()
	 * @generated
	 */
	int BUSINESS_OBJECT_DAO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__NAME = BUSINESS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__PACKAGE = BUSINESS_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__ATTRIBUTES = BUSINESS_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__CONTENT_FIELDS = BUSINESS_OBJECT__CONTENT_FIELDS;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__CHILDS = BUSINESS_OBJECT__CHILDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__PARENT = BUSINESS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__XML_NAME = BUSINESS_OBJECT__XML_NAME;

	/**
	 * The feature id for the '<em><b>Parse Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__PARSE_ID = BUSINESS_OBJECT__PARSE_ID;

	/**
	 * The feature id for the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__RELATED_FIELD = BUSINESS_OBJECT__RELATED_FIELD;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO__PROJECT = BUSINESS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Object DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_DAO_FEATURE_COUNT = BUSINESS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl <em>Response Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getResponseBusinessObject()
	 * @generated
	 */
	int RESPONSE_BUSINESS_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__NAME = BUSINESS_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__PACKAGE = BUSINESS_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__ATTRIBUTES = BUSINESS_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__CONTENT_FIELDS = BUSINESS_OBJECT__CONTENT_FIELDS;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__CHILDS = BUSINESS_OBJECT__CHILDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__PARENT = BUSINESS_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__XML_NAME = BUSINESS_OBJECT__XML_NAME;

	/**
	 * The feature id for the '<em><b>Parse Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__PARSE_ID = BUSINESS_OBJECT__PARSE_ID;

	/**
	 * The feature id for the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__RELATED_FIELD = BUSINESS_OBJECT__RELATED_FIELD;

	/**
	 * The feature id for the '<em><b>Xml Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS = BUSINESS_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES = BUSINESS_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_FEATURE_COUNT = BUSINESS_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectDAOImpl <em>Response Business Object DAO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectDAOImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getResponseBusinessObjectDAO()
	 * @generated
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__NAME = BUSINESS_OBJECT_DAO__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__PACKAGE = BUSINESS_OBJECT_DAO__PACKAGE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__ATTRIBUTES = BUSINESS_OBJECT_DAO__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__CONTENT_FIELDS = BUSINESS_OBJECT_DAO__CONTENT_FIELDS;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__CHILDS = BUSINESS_OBJECT_DAO__CHILDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__PARENT = BUSINESS_OBJECT_DAO__PARENT;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__XML_NAME = BUSINESS_OBJECT_DAO__XML_NAME;

	/**
	 * The feature id for the '<em><b>Parse Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__PARSE_ID = BUSINESS_OBJECT_DAO__PARSE_ID;

	/**
	 * The feature id for the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__RELATED_FIELD = BUSINESS_OBJECT_DAO__RELATED_FIELD;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__PROJECT = BUSINESS_OBJECT_DAO__PROJECT;

	/**
	 * The feature id for the '<em><b>Xml Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__XML_CONTENT_FIELDS = BUSINESS_OBJECT_DAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO__XML_ATTRIBUTES = BUSINESS_OBJECT_DAO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Business Object DAO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BUSINESS_OBJECT_DAO_FEATURE_COUNT = BUSINESS_OBJECT_DAO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ParameterImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DEFAULT_VALUE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__XML_NAME = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xml Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__XML_ATTRIBUTES = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Business Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BUSINESS_OBJECT = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xml Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__XML_CONTENT_FIELDS = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parse Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARSE_ID = PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Xml Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__XML_PARENT = PARAMETER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__RELATED_FIELD = PARAMETER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 8;


	/**
	 * The meta object id for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldBusinessObjectImpl <em>Field Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldBusinessObjectImpl
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getFieldBusinessObject()
	 * @generated
	 */
	int FIELD_BUSINESS_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__TYPE = FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__DESCRIPTION = FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__DEFAULT_VALUE = FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__XML_NAME = FIELD__XML_NAME;

	/**
	 * The feature id for the '<em><b>Xml Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__XML_ATTRIBUTES = FIELD__XML_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Business Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__BUSINESS_OBJECT = FIELD__BUSINESS_OBJECT;

	/**
	 * The feature id for the '<em><b>Xml Content Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__XML_CONTENT_FIELDS = FIELD__XML_CONTENT_FIELDS;

	/**
	 * The feature id for the '<em><b>Parse Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__PARSE_ID = FIELD__PARSE_ID;

	/**
	 * The feature id for the '<em><b>Xml Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__XML_PARENT = FIELD__XML_PARENT;

	/**
	 * The feature id for the '<em><b>Related Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__RELATED_FIELD = FIELD__RELATED_FIELD;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT__CONTENT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BUSINESS_OBJECT_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject
	 * @generated
	 */
	EClass getBusinessObject();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getName()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getPackage()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getAttributes()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getContentFields <em>Content Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Fields</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getContentFields()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_ContentFields();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getChilds()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_Childs();

	/**
	 * Returns the meta object for the reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParent()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getXmlName <em>Xml Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Name</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getXmlName()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_XmlName();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParseId <em>Parse Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parse Id</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getParseId()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EAttribute getBusinessObject_ParseId();

	/**
	 * Returns the meta object for the reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getRelatedField <em>Related Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Field</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject#getRelatedField()
	 * @see #getBusinessObject()
	 * @generated
	 */
	EReference getBusinessObject_RelatedField();

	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO <em>Business Object DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object DAO</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO
	 * @generated
	 */
	EClass getBusinessObjectDAO();

	/**
	 * Returns the meta object for the reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO#getProject()
	 * @see #getBusinessObjectDAO()
	 * @generated
	 */
	EReference getBusinessObjectDAO_Project();

	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject <em>Response Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Business Object</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject
	 * @generated
	 */
	EClass getResponseBusinessObject();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject#getXmlContentFields <em>Xml Content Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Content Fields</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject#getXmlContentFields()
	 * @see #getResponseBusinessObject()
	 * @generated
	 */
	EReference getResponseBusinessObject_XmlContentFields();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject#getXmlAttributes <em>Xml Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Attributes</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject#getXmlAttributes()
	 * @see #getResponseBusinessObject()
	 * @generated
	 */
	EReference getResponseBusinessObject_XmlAttributes();

	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObjectDAO <em>Response Business Object DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Business Object DAO</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObjectDAO
	 * @generated
	 */
	EClass getResponseBusinessObjectDAO();

	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getDefaultValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlName <em>Xml Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Name</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_XmlName();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlAttributes <em>Xml Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Attributes</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlAttributes()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_XmlAttributes();

	/**
	 * Returns the meta object for the reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getBusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Object</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getBusinessObject()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_BusinessObject();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlContentFields <em>Xml Content Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xml Content Fields</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlContentFields()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_XmlContentFields();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getParseId <em>Parse Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parse Id</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getParseId()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_ParseId();

	/**
	 * Returns the meta object for the reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlParent <em>Xml Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xml Parent</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getXmlParent()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_XmlParent();

	/**
	 * Returns the meta object for the reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getRelatedField <em>Related Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Field</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Field#getRelatedField()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_RelatedField();

	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for class '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject <em>Field Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Business Object</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject
	 * @generated
	 */
	EClass getFieldBusinessObject();

	/**
	 * Returns the meta object for the reference '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject#getContent()
	 * @see #getFieldBusinessObject()
	 * @generated
	 */
	EReference getFieldBusinessObject_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl <em>Business Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getBusinessObject()
		 * @generated
		 */
		EClass BUSINESS_OBJECT = eINSTANCE.getBusinessObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT__NAME = eINSTANCE.getBusinessObject_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT__PACKAGE = eINSTANCE.getBusinessObject_Package();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__ATTRIBUTES = eINSTANCE.getBusinessObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Content Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__CONTENT_FIELDS = eINSTANCE.getBusinessObject_ContentFields();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__CHILDS = eINSTANCE.getBusinessObject_Childs();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__PARENT = eINSTANCE.getBusinessObject_Parent();

		/**
		 * The meta object literal for the '<em><b>Xml Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT__XML_NAME = eINSTANCE.getBusinessObject_XmlName();

		/**
		 * The meta object literal for the '<em><b>Parse Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECT__PARSE_ID = eINSTANCE.getBusinessObject_ParseId();

		/**
		 * The meta object literal for the '<em><b>Related Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT__RELATED_FIELD = eINSTANCE.getBusinessObject_RelatedField();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectDAOImpl <em>Business Object DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.BusinessObjectDAOImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getBusinessObjectDAO()
		 * @generated
		 */
		EClass BUSINESS_OBJECT_DAO = eINSTANCE.getBusinessObjectDAO();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECT_DAO__PROJECT = eINSTANCE.getBusinessObjectDAO_Project();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl <em>Response Business Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getResponseBusinessObject()
		 * @generated
		 */
		EClass RESPONSE_BUSINESS_OBJECT = eINSTANCE.getResponseBusinessObject();

		/**
		 * The meta object literal for the '<em><b>Xml Content Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS = eINSTANCE.getResponseBusinessObject_XmlContentFields();

		/**
		 * The meta object literal for the '<em><b>Xml Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES = eINSTANCE.getResponseBusinessObject_XmlAttributes();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectDAOImpl <em>Response Business Object DAO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectDAOImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getResponseBusinessObjectDAO()
		 * @generated
		 */
		EClass RESPONSE_BUSINESS_OBJECT_DAO = eINSTANCE.getResponseBusinessObjectDAO();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DEFAULT_VALUE = eINSTANCE.getField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Xml Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__XML_NAME = eINSTANCE.getField_XmlName();

		/**
		 * The meta object literal for the '<em><b>Xml Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__XML_ATTRIBUTES = eINSTANCE.getField_XmlAttributes();

		/**
		 * The meta object literal for the '<em><b>Business Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__BUSINESS_OBJECT = eINSTANCE.getField_BusinessObject();

		/**
		 * The meta object literal for the '<em><b>Xml Content Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__XML_CONTENT_FIELDS = eINSTANCE.getField_XmlContentFields();

		/**
		 * The meta object literal for the '<em><b>Parse Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__PARSE_ID = eINSTANCE.getField_ParseId();

		/**
		 * The meta object literal for the '<em><b>Xml Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__XML_PARENT = eINSTANCE.getField_XmlParent();

		/**
		 * The meta object literal for the '<em><b>Related Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__RELATED_FIELD = eINSTANCE.getField_RelatedField();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ParameterImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldBusinessObjectImpl <em>Field Business Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldBusinessObjectImpl
		 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ModelPackageImpl#getFieldBusinessObject()
		 * @generated
		 */
		EClass FIELD_BUSINESS_OBJECT = eINSTANCE.getFieldBusinessObject();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_BUSINESS_OBJECT__CONTENT = eINSTANCE.getFieldBusinessObject_Content();

	}

} //ModelPackage
