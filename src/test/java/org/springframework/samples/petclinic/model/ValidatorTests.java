package org.springframework.samples.petclinic.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.junit.Test;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author Omar Trigui
 * @author Rahma Rekik
 * @author Amina Abdelkefi
 */

public class ValidatorTests {

	private Validator createValidator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.afterPropertiesSet();
		return localValidatorFactoryBean;
	}

	@Test
	public void shouldNotValidateWhenFirstNameEmpty() {

		LocaleContextHolder.setLocale(Locale.ENGLISH);
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("smith");

		Validator validator = createValidator();
		Set<ConstraintViolation<Person>> constraintViolations = validator
				.validate(person);

		assertThat(constraintViolations.size()).isEqualTo(1);
		ConstraintViolation<Person> violation = constraintViolations.iterator()
				.next();
		assertThat(violation.getPropertyPath().toString()).isEqualTo(
				"firstName");
		assertThat(violation.getMessage()).isEqualTo("may not be empty");
	}

	@Test
	public void shouldNotValidateOwnerWhenPhoneNumberNotValid() {

		LocaleContextHolder.setLocale(Locale.ENGLISH);
		Owner owner = new Owner();
		owner.setFirstName("Sam");
		owner.setLastName("Schultz");
		owner.setAddress("4, Evans Street");
		owner.setCity("Wollongong");
		owner.setTelephone("444zeezt4444");

		Validator validator = createValidator();
		Set<ConstraintViolation<Owner>> constraintViolations = validator
				.validate(owner);

		System.out.println(constraintViolations);

		assertThat(constraintViolations.size()).isEqualTo(1);

	}

}
