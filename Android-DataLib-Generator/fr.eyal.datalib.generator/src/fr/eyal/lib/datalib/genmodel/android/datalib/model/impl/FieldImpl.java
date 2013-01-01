/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.Field;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getXmlName <em>Xml Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getXmlAttributes <em>Xml Attributes</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getBusinessObject <em>Business Object</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getXmlContentFields <em>Xml Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getParseId <em>Parse Id</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getXmlParent <em>Xml Parent</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getRelatedField <em>Related Field</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getJavaName <em>Java Name</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldImpl#getJavaTag <em>Java Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends ParameterImpl implements Field {
	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected String xmlName = XML_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXmlAttributes() <em>Xml Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> xmlAttributes;

	/**
	 * The cached value of the '{@link #getBusinessObject() <em>Business Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessObject()
	 * @generated
	 * @ordered
	 */
	protected BusinessObject businessObject;

	/**
	 * The cached value of the '{@link #getXmlContentFields() <em>Xml Content Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlContentFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> xmlContentFields;

	/**
	 * The default value of the '{@link #getParseId() <em>Parse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PARSE_ID_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getParseId() <em>Parse Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParseId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger parseId = PARSE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXmlParent() <em>Xml Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlParent()
	 * @generated
	 * @ordered
	 */
	protected Field xmlParent;

	/**
	 * The cached value of the '{@link #getRelatedField() <em>Related Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedField()
	 * @generated
	 * @ordered
	 */
	protected Field relatedField;

	/**
	 * The default value of the '{@link #getJavaName() <em>Java Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaName()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaName() <em>Java Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaName()
	 * @generated
	 * @ordered
	 */
	protected String javaName = JAVA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaTag() <em>Java Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaTag()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaTag() <em>Java Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaTag()
	 * @generated
	 * @ordered
	 */
	protected String javaTag = JAVA_TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlName() {
		return xmlName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlName(String newXmlName) {
		String oldXmlName = xmlName;
		xmlName = newXmlName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__XML_NAME, oldXmlName, xmlName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getXmlAttributes() {
		if (xmlAttributes == null) {
			xmlAttributes = new EObjectContainmentEList<Field>(Field.class, this, ModelPackage.FIELD__XML_ATTRIBUTES);
		}
		return xmlAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getBusinessObject() {
		if (businessObject != null && businessObject.eIsProxy()) {
			InternalEObject oldBusinessObject = (InternalEObject)businessObject;
			businessObject = (BusinessObject)eResolveProxy(oldBusinessObject);
			if (businessObject != oldBusinessObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FIELD__BUSINESS_OBJECT, oldBusinessObject, businessObject));
			}
		}
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetBusinessObject() {
		return businessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessObject(BusinessObject newBusinessObject) {
		BusinessObject oldBusinessObject = businessObject;
		businessObject = newBusinessObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__BUSINESS_OBJECT, oldBusinessObject, businessObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getXmlContentFields() {
		if (xmlContentFields == null) {
			xmlContentFields = new EObjectContainmentEList<Field>(Field.class, this, ModelPackage.FIELD__XML_CONTENT_FIELDS);
		}
		return xmlContentFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getParseId() {
		return parseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseId(BigInteger newParseId) {
		BigInteger oldParseId = parseId;
		parseId = newParseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__PARSE_ID, oldParseId, parseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getXmlParent() {
		if (xmlParent != null && xmlParent.eIsProxy()) {
			InternalEObject oldXmlParent = (InternalEObject)xmlParent;
			xmlParent = (Field)eResolveProxy(oldXmlParent);
			if (xmlParent != oldXmlParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FIELD__XML_PARENT, oldXmlParent, xmlParent));
			}
		}
		return xmlParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetXmlParent() {
		return xmlParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlParent(Field newXmlParent) {
		Field oldXmlParent = xmlParent;
		xmlParent = newXmlParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__XML_PARENT, oldXmlParent, xmlParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getRelatedField() {
		if (relatedField != null && relatedField.eIsProxy()) {
			InternalEObject oldRelatedField = (InternalEObject)relatedField;
			relatedField = (Field)eResolveProxy(oldRelatedField);
			if (relatedField != oldRelatedField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FIELD__RELATED_FIELD, oldRelatedField, relatedField));
			}
		}
		return relatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetRelatedField() {
		return relatedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedField(Field newRelatedField) {
		Field oldRelatedField = relatedField;
		relatedField = newRelatedField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__RELATED_FIELD, oldRelatedField, relatedField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaName() {
		return javaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaName(String newJavaName) {
		String oldJavaName = javaName;
		javaName = newJavaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__JAVA_NAME, oldJavaName, javaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavaTag() {
		return javaTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaTag(String newJavaTag) {
		String oldJavaTag = javaTag;
		javaTag = newJavaTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__JAVA_TAG, oldJavaTag, javaTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FIELD__XML_ATTRIBUTES:
				return ((InternalEList<?>)getXmlAttributes()).basicRemove(otherEnd, msgs);
			case ModelPackage.FIELD__XML_CONTENT_FIELDS:
				return ((InternalEList<?>)getXmlContentFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FIELD__DEFAULT_VALUE:
				return getDefaultValue();
			case ModelPackage.FIELD__XML_NAME:
				return getXmlName();
			case ModelPackage.FIELD__XML_ATTRIBUTES:
				return getXmlAttributes();
			case ModelPackage.FIELD__BUSINESS_OBJECT:
				if (resolve) return getBusinessObject();
				return basicGetBusinessObject();
			case ModelPackage.FIELD__XML_CONTENT_FIELDS:
				return getXmlContentFields();
			case ModelPackage.FIELD__PARSE_ID:
				return getParseId();
			case ModelPackage.FIELD__XML_PARENT:
				if (resolve) return getXmlParent();
				return basicGetXmlParent();
			case ModelPackage.FIELD__RELATED_FIELD:
				if (resolve) return getRelatedField();
				return basicGetRelatedField();
			case ModelPackage.FIELD__JAVA_NAME:
				return getJavaName();
			case ModelPackage.FIELD__JAVA_TAG:
				return getJavaTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.FIELD__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case ModelPackage.FIELD__XML_NAME:
				setXmlName((String)newValue);
				return;
			case ModelPackage.FIELD__XML_ATTRIBUTES:
				getXmlAttributes().clear();
				getXmlAttributes().addAll((Collection<? extends Field>)newValue);
				return;
			case ModelPackage.FIELD__BUSINESS_OBJECT:
				setBusinessObject((BusinessObject)newValue);
				return;
			case ModelPackage.FIELD__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				getXmlContentFields().addAll((Collection<? extends Field>)newValue);
				return;
			case ModelPackage.FIELD__PARSE_ID:
				setParseId((BigInteger)newValue);
				return;
			case ModelPackage.FIELD__XML_PARENT:
				setXmlParent((Field)newValue);
				return;
			case ModelPackage.FIELD__RELATED_FIELD:
				setRelatedField((Field)newValue);
				return;
			case ModelPackage.FIELD__JAVA_NAME:
				setJavaName((String)newValue);
				return;
			case ModelPackage.FIELD__JAVA_TAG:
				setJavaTag((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.FIELD__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case ModelPackage.FIELD__XML_NAME:
				setXmlName(XML_NAME_EDEFAULT);
				return;
			case ModelPackage.FIELD__XML_ATTRIBUTES:
				getXmlAttributes().clear();
				return;
			case ModelPackage.FIELD__BUSINESS_OBJECT:
				setBusinessObject((BusinessObject)null);
				return;
			case ModelPackage.FIELD__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				return;
			case ModelPackage.FIELD__PARSE_ID:
				setParseId(PARSE_ID_EDEFAULT);
				return;
			case ModelPackage.FIELD__XML_PARENT:
				setXmlParent((Field)null);
				return;
			case ModelPackage.FIELD__RELATED_FIELD:
				setRelatedField((Field)null);
				return;
			case ModelPackage.FIELD__JAVA_NAME:
				setJavaName(JAVA_NAME_EDEFAULT);
				return;
			case ModelPackage.FIELD__JAVA_TAG:
				setJavaTag(JAVA_TAG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.FIELD__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case ModelPackage.FIELD__XML_NAME:
				return XML_NAME_EDEFAULT == null ? xmlName != null : !XML_NAME_EDEFAULT.equals(xmlName);
			case ModelPackage.FIELD__XML_ATTRIBUTES:
				return xmlAttributes != null && !xmlAttributes.isEmpty();
			case ModelPackage.FIELD__BUSINESS_OBJECT:
				return businessObject != null;
			case ModelPackage.FIELD__XML_CONTENT_FIELDS:
				return xmlContentFields != null && !xmlContentFields.isEmpty();
			case ModelPackage.FIELD__PARSE_ID:
				return PARSE_ID_EDEFAULT == null ? parseId != null : !PARSE_ID_EDEFAULT.equals(parseId);
			case ModelPackage.FIELD__XML_PARENT:
				return xmlParent != null;
			case ModelPackage.FIELD__RELATED_FIELD:
				return relatedField != null;
			case ModelPackage.FIELD__JAVA_NAME:
				return JAVA_NAME_EDEFAULT == null ? javaName != null : !JAVA_NAME_EDEFAULT.equals(javaName);
			case ModelPackage.FIELD__JAVA_TAG:
				return JAVA_TAG_EDEFAULT == null ? javaTag != null : !JAVA_TAG_EDEFAULT.equals(javaTag);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", xmlName: ");
		result.append(xmlName);
		result.append(", parseId: ");
		result.append(parseId);
		result.append(", javaName: ");
		result.append(javaName);
		result.append(", javaTag: ");
		result.append(javaTag);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
