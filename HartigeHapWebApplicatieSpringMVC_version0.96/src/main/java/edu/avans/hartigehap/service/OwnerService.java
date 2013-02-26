package edu.avans.hartigehap.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.avans.hartigehap.domain.Owner;

public interface OwnerService {
	
	public List<Owner> findAll();
	public Owner findById(Long id);
	public List<Owner> findByName(String name);
	public Owner save(Owner owner);
	public void delete(Owner owner);

}
