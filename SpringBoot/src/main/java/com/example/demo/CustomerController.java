package com.example.demo;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ApplicationsService applicationsService;
	
	@PostMapping("/customer")
	public ResponseEntity<String> createCustomer(@Valid @RequestBody Customer customer) {
	    return ResponseEntity.ok(customerService.save(customer));
	}
	
	@PostMapping("/addApplications")
	public ResponseEntity<String> applyForApplication(@Valid @RequestBody ApplicationsRequest applicationsRequest) {
		try {
			Boolean isCustomer=applicationsService.saveApplications(applicationsRequest);
			if(isCustomer) {
				return ResponseEntity.ok("ok");
			}else {
				return new ResponseEntity(HttpStatus.NOT_FOUND);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.FORBIDDEN);
	}
	
	@GetMapping("/customer/{aadhaarId}")
	public ResponseEntity<Customer> getCustomerAndApplication(@PathVariable("aadhaarId")  Integer aadhaarId) {
		try {
			Customer customer=customerService.findByAadhaarId(aadhaarId);
			if(customer != null) {
	            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	        }else {
	        	return new ResponseEntity(HttpStatus.NOT_FOUND);
	        }
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity(HttpStatus.FORBIDDEN);
	}
}
