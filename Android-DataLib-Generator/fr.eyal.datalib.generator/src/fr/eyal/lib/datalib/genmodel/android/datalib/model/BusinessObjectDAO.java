/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.eyal.lib.datalib.genmodel.android.datalib.model;

import fr.eyal.lib.datalib.genmodel.android.datalib.DataLibProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object DAO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObjectDAO()
 * @model
 * @generated
 */
public interface BusinessObjectDAO extends BusinessObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(DataLibProject)
	 * @see fr.eyal.lib.datalib.genmodel.android.datalib.model.ModelPackage#getBusinessObjectDAO_Project()
	 * @model required="true"
	 * @generated
	 */
	DataLibProject getProject();

	/**
	 * Sets the value of the '{@link fr.eyal.lib.datalib.genmodel.android.datalib.model.BusinessObjectDAO#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(DataLibProject value);

} // BusinessObjectDAO
