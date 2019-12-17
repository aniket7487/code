package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	@Query(value="select c from Customer c where c.aadhaarId = ?1 ")
	Customer findByAadhaarId( Integer aadhaarId);

}
