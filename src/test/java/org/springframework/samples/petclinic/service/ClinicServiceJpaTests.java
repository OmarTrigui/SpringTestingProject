package org.springframework.samples.petclinic.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Omar Trigui
 * @author Rahma Rekik
 * @author Amina Abdelkefi
 */

@ContextConfiguration(locations = {"classpath:spring/business-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("jpa")
public class ClinicServiceJpaTests extends AbstractClinicServiceTests {

}
