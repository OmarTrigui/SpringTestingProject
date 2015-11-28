package org.springframework.samples.petclinic.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.samples.petclinic.model.ValidatorTests;
import org.springframework.samples.petclinic.service.ClinicServiceJpaTests;
import org.springframework.samples.petclinic.web.VetControllerTests;

/**
 * @author Omar Trigui
 * @author Rahma Rekik
 * @author Amina Abdelkefi
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ VetControllerTests.class, ClinicServiceJpaTests.class,
		ValidatorTests.class })
public class JunitTestSuite {
}