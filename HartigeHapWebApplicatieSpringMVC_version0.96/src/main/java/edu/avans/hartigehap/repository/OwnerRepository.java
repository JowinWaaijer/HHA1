package edu.avans.hartigehap.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import edu.avans.hartigehap.domain.Owner;

public interface OwnerRepository extends PagingAndSortingRepository<Owner, Long> {	
	public List<Owner> findByName(String name);	
}