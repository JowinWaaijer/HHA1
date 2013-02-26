package edu.avans.hartigehap.customer.control;

import java.util.Collection;

import org.joda.time.DateTime;

import edu.avans.hartigehap.customer.control.CustomerController.CustomerType;
import edu.avans.hartigehap.customer.model.ConcreteCustomer;
import edu.avans.hartigehap.customer.model.Customer;
import edu.avans.hartigehap.customer.model.Dater;
import edu.avans.hartigehap.domain.Restaurant;

public class CustomerFactory {

	public CustomerFactory() {

	}

	public Customer newCustomer(CustomerType type, String firstName,
			String lastName, DateTime birthDate, int partySize,
			String description, byte[] photo, Collection<Restaurant> restaurants) {

		Customer customer = new ConcreteCustomer(firstName, lastName,
				birthDate, partySize, description, photo, restaurants);

		if (type.equals(CustomerType.Dater))
			customer = new Dater(customer);
		// else if(type.equals(CustomerType.Dater))
		// customer = new Dater(customer);
		
		return customer;

	}

}
