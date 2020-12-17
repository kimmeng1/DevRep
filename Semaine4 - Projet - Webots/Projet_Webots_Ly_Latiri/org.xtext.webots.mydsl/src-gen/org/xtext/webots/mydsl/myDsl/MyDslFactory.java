/**
 * generated by Xtext 2.22.0
 */
package org.xtext.webots.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.webots.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MyDslFactory eINSTANCE = org.xtext.webots.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Robot Configuration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot Configuration</em>'.
	 * @generated
	 */
  RobotConfiguration createRobotConfiguration();

  /**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
  Actuator createActuator();

  /**
	 * Returns a new object of class '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior</em>'.
	 * @generated
	 */
  Behavior createBehavior();

  /**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
  Sensor createSensor();

  /**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
  Robot createRobot();

  /**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
  Mission createMission();

  /**
	 * Returns a new object of class '<em>Left Motor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Motor</em>'.
	 * @generated
	 */
  LeftMotor createLeftMotor();

  /**
	 * Returns a new object of class '<em>Right Motor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Motor</em>'.
	 * @generated
	 */
  RightMotor createRightMotor();

  /**
	 * Returns a new object of class '<em>Escape</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escape</em>'.
	 * @generated
	 */
  Escape createEscape();

  /**
	 * Returns a new object of class '<em>Home</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Home</em>'.
	 * @generated
	 */
  Home createHome();

  /**
	 * Returns a new object of class '<em>Distance Sensor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Sensor</em>'.
	 * @generated
	 */
  DistanceSensor createDistanceSensor();

  /**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
  LightSensor createLightSensor();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
