/**
 * generated by Xtext 2.22.0
 */
package org.xtext.webots.mydsl.myDsl.tests;

import junit.textui.TestRunner;

import org.xtext.webots.mydsl.myDsl.LightSensor;
import org.xtext.webots.mydsl.myDsl.MyDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Light Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LightSensorTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LightSensorTest.class);
	}

	/**
	 * Constructs a new Light Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSensorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Light Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LightSensor getFixture() {
		return (LightSensor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MyDslFactory.eINSTANCE.createLightSensor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LightSensorTest
