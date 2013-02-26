package edu.avans.hartigehap.customer.model;

import java.util.*;

public class Dater extends ConditionalCustomer {
	public ArrayList<String> preferences = new ArrayList<String>();
	
	Customer customer;
	public Dater(Customer customer){
		this.customer = customer;	
	}
	
	public void addPreferences( String pref){
		preferences.add(pref);	
	}

	@Override
	public String getType() {
		return "Dater";
	}	
	
}
