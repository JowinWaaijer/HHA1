package edu.avans.hartigehap.customer.model;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import edu.avans.hartigehap.domain.Bill;
import edu.avans.hartigehap.domain.Restaurant;

@Entity
@Table(name = "CUSTOMERS")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class ConcreteCustomer extends Customer {

	
	public ConcreteCustomer(String firstName,
							String lastName,
							DateTime birthDate,
							int partySize,
							String description,
							byte[] photo,
							Collection<Restaurant> restaurants) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.partySize = partySize;
		this.description = description;
		this.photo = photo;
		this.restaurants = restaurants;
	}
	

}

