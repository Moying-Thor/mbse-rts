/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link artifact.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link artifact.Task#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link artifact.Task#getWcet_low <em>Wcet low</em>}</li>
 *   <li>{@link artifact.Task#getWcet_high <em>Wcet high</em>}</li>
 *   <li>{@link artifact.Task#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link artifact.Task#getDynamic_priority <em>Dynamic priority</em>}</li>
 *   <li>{@link artifact.Task#getOffset <em>Offset</em>}</li>
 *   <li>{@link artifact.Task#getRelease_time <em>Release time</em>}</li>
 *   <li>{@link artifact.Task#getCurrent_cs <em>Current cs</em>}</li>
 *   <li>{@link artifact.Task#getCritical_sections <em>Critical sections</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends MCSElement {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see artifact.ArtifactPackage#getTask_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link artifact.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see artifact.ArtifactPackage#getTask_Period()
	 * @model
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link artifact.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(int)
	 * @see artifact.ArtifactPackage#getTask_Deadline()
	 * @model
	 * @generated
	 */
	int getDeadline();

	/**
	 * Sets the value of the '{@link artifact.Task#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(int value);

	/**
	 * Returns the value of the '<em><b>Wcet low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet low</em>' attribute.
	 * @see #setWcet_low(int)
	 * @see artifact.ArtifactPackage#getTask_Wcet_low()
	 * @model
	 * @generated
	 */
	int getWcet_low();

	/**
	 * Sets the value of the '{@link artifact.Task#getWcet_low <em>Wcet low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet low</em>' attribute.
	 * @see #getWcet_low()
	 * @generated
	 */
	void setWcet_low(int value);

	/**
	 * Returns the value of the '<em><b>Wcet high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet high</em>' attribute.
	 * @see #setWcet_high(int)
	 * @see artifact.ArtifactPackage#getTask_Wcet_high()
	 * @model
	 * @generated
	 */
	int getWcet_high();

	/**
	 * Sets the value of the '{@link artifact.Task#getWcet_high <em>Wcet high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet high</em>' attribute.
	 * @see #getWcet_high()
	 * @generated
	 */
	void setWcet_high(int value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link artifact.Criticality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see artifact.Criticality
	 * @see #setCriticality(Criticality)
	 * @see artifact.ArtifactPackage#getTask_Criticality()
	 * @model
	 * @generated
	 */
	Criticality getCriticality();

	/**
	 * Sets the value of the '{@link artifact.Task#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see artifact.Criticality
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(Criticality value);

	/**
	 * Returns the value of the '<em><b>Dynamic priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic priority</em>' attribute.
	 * @see #setDynamic_priority(int)
	 * @see artifact.ArtifactPackage#getTask_Dynamic_priority()
	 * @model
	 * @generated
	 */
	int getDynamic_priority();

	/**
	 * Sets the value of the '{@link artifact.Task#getDynamic_priority <em>Dynamic priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic priority</em>' attribute.
	 * @see #getDynamic_priority()
	 * @generated
	 */
	void setDynamic_priority(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see artifact.ArtifactPackage#getTask_Offset()
	 * @model
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link artifact.Task#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Release time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release time</em>' attribute.
	 * @see #setRelease_time(int)
	 * @see artifact.ArtifactPackage#getTask_Release_time()
	 * @model
	 * @generated
	 */
	int getRelease_time();

	/**
	 * Sets the value of the '{@link artifact.Task#getRelease_time <em>Release time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release time</em>' attribute.
	 * @see #getRelease_time()
	 * @generated
	 */
	void setRelease_time(int value);

	/**
	 * Returns the value of the '<em><b>Current cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current cs</em>' attribute.
	 * @see #setCurrent_cs(int)
	 * @see artifact.ArtifactPackage#getTask_Current_cs()
	 * @model
	 * @generated
	 */
	int getCurrent_cs();

	/**
	 * Sets the value of the '{@link artifact.Task#getCurrent_cs <em>Current cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current cs</em>' attribute.
	 * @see #getCurrent_cs()
	 * @generated
	 */
	void setCurrent_cs(int value);

	/**
	 * Returns the value of the '<em><b>Critical sections</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.CriticalSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical sections</em>' containment reference list.
	 * @see artifact.ArtifactPackage#getTask_Critical_sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<CriticalSection> getCritical_sections();

} // Task