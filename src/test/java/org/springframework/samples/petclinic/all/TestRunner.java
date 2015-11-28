package org.springframework.samples.petclinic.all;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Omar Trigui
 * @author Rahma Rekik
 * @author Amina Abdelkefi
 */

public class TestRunner {
	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(JunitTestSuite.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println("---------------------------------------------");
		System.out.println("SUCCESSFUL TEST => " + result.wasSuccessful());
		System.out.println("---------------------------------------------");

	}
}