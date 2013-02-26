package edu.avans.hartigehap.customer.control;

import java.util.Collection;

import org.joda.time.DateTime;


import edu.avans.hartigehap.customer.model.Customer;
import edu.avans.hartigehap.domain.Restaurant;

public class CustomerController {

	private CustomerFactory cf;
	private static CustomerController instance = null;

	public enum CustomerType {
		Dater, Guest, Cursist
	}

	protected CustomerController() {

	}

	public Customer newCustomer(String typeString, String firstName,
			String lastName, DateTime birthDate, int partySize,
			String description, byte[] photo, Collection<Restaurant> restaurants) {
		CustomerType type = null;
		switch (typeString) {
		case ("Dater"):
			type = CustomerType.Dater;
		case ("Guest"):
			type = CustomerType.Guest;
		}

		Customer customer = cf.newCustomer(type, firstName, lastName, birthDate, partySize,
				description, photo, restaurants);
		return customer;
	}

	public static CustomerController getInstance() {
		if (instance == null)
			instance = new CustomerController();
		return instance;
	}
}
