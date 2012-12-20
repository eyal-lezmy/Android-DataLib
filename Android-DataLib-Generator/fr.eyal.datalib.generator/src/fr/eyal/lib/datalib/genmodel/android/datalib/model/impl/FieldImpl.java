/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.Field;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The default value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAME_EDEFAULT = null;

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
		return (String)eDynamicGet(ModelPackage.FIELD__DEFAULT_VALUE, ModelPackage.Literals.FIELD__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		eDynamicSet(ModelPackage.FIELD__DEFAULT_VALUE, ModelPackage.Literals.FIELD__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlName() {
		return (String)eDynamicGet(ModelPackage.FIELD__XML_NAME, ModelPackage.Literals.FIELD__XML_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlName(String newXmlName) {
		eDynamicSet(ModelPackage.FIELD__XML_NAME, ModelPackage.Literals.FIELD__XML_NAME, newXmlName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getXmlAttributes() {
		return (EList<Field>)eDynamicGet(ModelPackage.FIELD__XML_ATTRIBUTES, ModelPackage.Literals.FIELD__XML_ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getBusinessObject() {
		return (BusinessObject)eDynamicGet(ModelPackage.FIELD__BUSINESS_OBJECT, ModelPackage.Literals.FIELD__BUSINESS_OBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetBusinessObject() {
		return (BusinessObject)eDynamicGet(ModelPackage.FIELD__BUSINESS_OBJECT, ModelPackage.Literals.FIELD__BUSINESS_OBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessObject(BusinessObject newBusinessObject) {
		eDynamicSet(ModelPackage.FIELD__BUSINESS_OBJECT, ModelPackage.Literals.FIELD__BUSINESS_OBJECT, newBusinessObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Field> getXmlContentFields() {
		return (EList<Field>)eDynamicGet(ModelPackage.FIELD__XML_CONTENT_FIELDS, ModelPackage.Literals.FIELD__XML_CONTENT_FIELDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getParseId() {
		return (BigInteger)eDynamicGet(ModelPackage.FIELD__PARSE_ID, ModelPackage.Literals.FIELD__PARSE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParseId(BigInteger newParseId) {
		eDynamicSet(ModelPackage.FIELD__PARSE_ID, ModelPackage.Literals.FIELD__PARSE_ID, newParseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getXmlParent() {
		return (Field)eDynamicGet(ModelPackage.FIELD__XML_PARENT, ModelPackage.Literals.FIELD__XML_PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetXmlParent() {
		return (Field)eDynamicGet(ModelPackage.FIELD__XML_PARENT, ModelPackage.Literals.FIELD__XML_PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlParent(Field newXmlParent) {
		eDynamicSet(ModelPackage.FIELD__XML_PARENT, ModelPackage.Literals.FIELD__XML_PARENT, newXmlParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getRelatedField() {
		return (Field)eDynamicGet(ModelPackage.FIELD__RELATED_FIELD, ModelPackage.Literals.FIELD__RELATED_FIELD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetRelatedField() {
		return (Field)eDynamicGet(ModelPackage.FIELD__RELATED_FIELD, ModelPackage.Literals.FIELD__RELATED_FIELD, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedField(Field newRelatedField) {
		eDynamicSet(ModelPackage.FIELD__RELATED_FIELD, ModelPackage.Literals.FIELD__RELATED_FIELD, newRelatedField);
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
				return DEFAULT_VALUE_EDEFAULT == null ? getDefaultValue() != null : !DEFAULT_VALUE_EDEFAULT.equals(getDefaultValue());
			case ModelPackage.FIELD__XML_NAME:
				return XML_NAME_EDEFAULT == null ? getXmlName() != null : !XML_NAME_EDEFAULT.equals(getXmlName());
			case ModelPackage.FIELD__XML_ATTRIBUTES:
				return !getXmlAttributes().isEmpty();
			case ModelPackage.FIELD__BUSINESS_OBJECT:
				return basicGetBusinessObject() != null;
			case ModelPackage.FIELD__XML_CONTENT_FIELDS:
				return !getXmlContentFields().isEmpty();
			case ModelPackage.FIELD__PARSE_ID:
				return PARSE_ID_EDEFAULT == null ? getParseId() != null : !PARSE_ID_EDEFAULT.equals(getParseId());
			case ModelPackage.FIELD__XML_PARENT:
				return basicGetXmlParent() != null;
			case ModelPackage.FIELD__RELATED_FIELD:
				return basicGetRelatedField() != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldImpl
