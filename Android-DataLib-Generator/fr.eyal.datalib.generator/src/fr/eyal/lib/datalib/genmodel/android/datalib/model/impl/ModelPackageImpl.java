/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.AndroidPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.DatalibPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.ContentPackage;

import fr.eyal.lib.datalib.genmodel.android.datalib.content.impl.ContentPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.datalib.impl.DatalibPackageImpl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.Field;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelFactory;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.Parameter;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObjectDAO;

import fr.eyal.lib.datalib.genmodel.android.impl.AndroidPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessObjectDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseBusinessObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseBusinessObjectDAOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldBusinessObjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AndroidPackageImpl theAndroidPackage = (AndroidPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI) instanceof AndroidPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI) : AndroidPackage.eINSTANCE);
		DatalibPackageImpl theDatalibPackage = (DatalibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI) instanceof DatalibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI) : DatalibPackage.eINSTANCE);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI) instanceof ContentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI) : ContentPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theAndroidPackage.createPackageContents();
		theDatalibPackage.createPackageContents();
		theContentPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theAndroidPackage.initializePackageContents();
		theDatalibPackage.initializePackageContents();
		theContentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessObject() {
		return businessObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_Name() {
		return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_Package() {
		return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_Attributes() {
		return (EReference)businessObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_ContentFields() {
		return (EReference)businessObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_Childs() {
		return (EReference)businessObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_Parent() {
		return (EReference)businessObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_XmlName() {
		return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObject_ParseId() {
		return (EAttribute)businessObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObject_RelatedField() {
		return (EReference)businessObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessObjectDAO() {
		return businessObjectDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObjectDAO_Project() {
		return (EReference)businessObjectDAOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseBusinessObject() {
		return responseBusinessObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseBusinessObject_XmlContentFields() {
		return (EReference)responseBusinessObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseBusinessObject_XmlAttributes() {
		return (EReference)responseBusinessObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseBusinessObjectDAO() {
		return responseBusinessObjectDAOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_DefaultValue() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_XmlName() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_XmlAttributes() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_BusinessObject() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_XmlContentFields() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_ParseId() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_XmlParent() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_RelatedField() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Description() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldBusinessObject() {
		return fieldBusinessObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldBusinessObject_Content() {
		return (EReference)fieldBusinessObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		businessObjectEClass = createEClass(BUSINESS_OBJECT);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__NAME);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__PACKAGE);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__ATTRIBUTES);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__CONTENT_FIELDS);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__CHILDS);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__PARENT);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__XML_NAME);
		createEAttribute(businessObjectEClass, BUSINESS_OBJECT__PARSE_ID);
		createEReference(businessObjectEClass, BUSINESS_OBJECT__RELATED_FIELD);

		businessObjectDAOEClass = createEClass(BUSINESS_OBJECT_DAO);
		createEReference(businessObjectDAOEClass, BUSINESS_OBJECT_DAO__PROJECT);

		responseBusinessObjectEClass = createEClass(RESPONSE_BUSINESS_OBJECT);
		createEReference(responseBusinessObjectEClass, RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS);
		createEReference(responseBusinessObjectEClass, RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES);

		responseBusinessObjectDAOEClass = createEClass(RESPONSE_BUSINESS_OBJECT_DAO);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__DEFAULT_VALUE);
		createEAttribute(fieldEClass, FIELD__XML_NAME);
		createEReference(fieldEClass, FIELD__XML_ATTRIBUTES);
		createEReference(fieldEClass, FIELD__BUSINESS_OBJECT);
		createEReference(fieldEClass, FIELD__XML_CONTENT_FIELDS);
		createEAttribute(fieldEClass, FIELD__PARSE_ID);
		createEReference(fieldEClass, FIELD__XML_PARENT);
		createEReference(fieldEClass, FIELD__RELATED_FIELD);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);

		fieldBusinessObjectEClass = createEClass(FIELD_BUSINESS_OBJECT);
		createEReference(fieldBusinessObjectEClass, FIELD_BUSINESS_OBJECT__CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatalibPackage theDatalibPackage = (DatalibPackage)EPackage.Registry.INSTANCE.getEPackage(DatalibPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		businessObjectDAOEClass.getESuperTypes().add(this.getBusinessObject());
		responseBusinessObjectEClass.getESuperTypes().add(this.getBusinessObject());
		responseBusinessObjectDAOEClass.getESuperTypes().add(this.getBusinessObjectDAO());
		responseBusinessObjectDAOEClass.getESuperTypes().add(this.getResponseBusinessObject());
		fieldEClass.getESuperTypes().add(this.getParameter());
		fieldBusinessObjectEClass.getESuperTypes().add(this.getField());

		// Initialize classes and features; add operations and parameters
		initEClass(businessObjectEClass, BusinessObject.class, "BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObject_Package(), ecorePackage.getEString(), "package", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObject_Attributes(), this.getField(), null, "attributes", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObject_ContentFields(), this.getField(), null, "contentFields", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObject_Childs(), this.getBusinessObject(), null, "childs", null, 0, -1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObject_Parent(), this.getBusinessObject(), null, "parent", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObject_XmlName(), ecorePackage.getEString(), "xmlName", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObject_ParseId(), ecorePackage.getEBigInteger(), "parseId", "-1", 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObject_RelatedField(), this.getFieldBusinessObject(), null, "relatedField", null, 1, 1, BusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessObjectDAOEClass, BusinessObjectDAO.class, "BusinessObjectDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessObjectDAO_Project(), theDatalibPackage.getDataLibProject(), null, "project", null, 1, 1, BusinessObjectDAO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseBusinessObjectEClass, ResponseBusinessObject.class, "ResponseBusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseBusinessObject_XmlContentFields(), this.getField(), null, "xmlContentFields", null, 0, -1, ResponseBusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseBusinessObject_XmlAttributes(), this.getField(), null, "xmlAttributes", null, 0, -1, ResponseBusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseBusinessObjectDAOEClass, ResponseBusinessObjectDAO.class, "ResponseBusinessObjectDAO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_XmlName(), ecorePackage.getEString(), "xmlName", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_XmlAttributes(), this.getField(), null, "xmlAttributes", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_BusinessObject(), this.getBusinessObject(), null, "businessObject", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_XmlContentFields(), this.getField(), null, "xmlContentFields", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_ParseId(), ecorePackage.getEBigInteger(), "parseId", "-1", 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_XmlParent(), this.getField(), null, "xmlParent", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_RelatedField(), this.getField(), null, "relatedField", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), theContentPackage.getParameterType(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldBusinessObjectEClass, FieldBusinessObject.class, "FieldBusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldBusinessObject_Content(), this.getBusinessObject(), null, "content", null, 1, 1, FieldBusinessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ModelPackageImpl
