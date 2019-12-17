package com.example.demo;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	public String save(@Valid Customer customer) {
		customerRepository.save(customer);
		return null;
	}

	public Customer findByAadhaarId(@Valid Integer aadhaarId) {
		return customerRepository.findByAadhaarId(aadhaarId);
	}

}
