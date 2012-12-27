/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.Field;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ResponseBusinessObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl#getXmlContentFields <em>Xml Content Fields</em>}</li>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.ResponseBusinessObjectImpl#getXmlAttributes <em>Xml Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseBusinessObjectImpl extends BusinessObjectImpl implements ResponseBusinessObject {
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
	 * The cached value of the '{@link #getXmlAttributes() <em>Xml Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> xmlAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseBusinessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESPONSE_BUSINESS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getXmlContentFields() {
		if (xmlContentFields == null) {
			xmlContentFields = new EObjectContainmentEList<Field>(Field.class, this, ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS);
		}
		return xmlContentFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getXmlAttributes() {
		if (xmlAttributes == null) {
			xmlAttributes = new EObjectContainmentEList<Field>(Field.class, this, ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES);
		}
		return xmlAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				return ((InternalEList<?>)getXmlContentFields()).basicRemove(otherEnd, msgs);
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				return ((InternalEList<?>)getXmlAttributes()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				return getXmlContentFields();
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				return getXmlAttributes();
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				getXmlContentFields().addAll((Collection<? extends Field>)newValue);
				return;
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				getXmlAttributes().clear();
				getXmlAttributes().addAll((Collection<? extends Field>)newValue);
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				getXmlContentFields().clear();
				return;
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				getXmlAttributes().clear();
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
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_CONTENT_FIELDS:
				return xmlContentFields != null && !xmlContentFields.isEmpty();
			case ModelPackage.RESPONSE_BUSINESS_OBJECT__XML_ATTRIBUTES:
				return xmlAttributes != null && !xmlAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResponseBusinessObjectImpl
