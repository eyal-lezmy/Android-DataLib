/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model.impl;

import fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.FieldBusinessObject;
import fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Business Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.impl.FieldBusinessObjectImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldBusinessObjectImpl extends FieldImpl implements FieldBusinessObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldBusinessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FIELD_BUSINESS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject getContent() {
		return (BusinessObject)eDynamicGet(ModelPackage.FIELD_BUSINESS_OBJECT__CONTENT, ModelPackage.Literals.FIELD_BUSINESS_OBJECT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObject basicGetContent() {
		return (BusinessObject)eDynamicGet(ModelPackage.FIELD_BUSINESS_OBJECT__CONTENT, ModelPackage.Literals.FIELD_BUSINESS_OBJECT__CONTENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(BusinessObject newContent) {
		eDynamicSet(ModelPackage.FIELD_BUSINESS_OBJECT__CONTENT, ModelPackage.Literals.FIELD_BUSINESS_OBJECT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FIELD_BUSINESS_OBJECT__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.FIELD_BUSINESS_OBJECT__CONTENT:
				setContent((BusinessObject)newValue);
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
			case ModelPackage.FIELD_BUSINESS_OBJECT__CONTENT:
				setContent((BusinessObject)null);
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
			case ModelPackage.FIELD_BUSINESS_OBJECT__CONTENT:
				return basicGetContent() != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldBusinessObjectImpl
