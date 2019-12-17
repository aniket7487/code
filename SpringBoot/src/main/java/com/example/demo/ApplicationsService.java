package com.example.demo;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationsService {

	@Autowired
	ApplicationsRepository applicationsRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Boolean saveApplications(ApplicationsRequest applicationsRequest) {
		
		Customer customer=customerRepository.findByAadhaarId(applicationsRequest.getAadhaarId());
		if(customer!= null) {
			Applications applications=new Applications();
			try {
				applications.setSchemeName(applicationsRequest.getApplications().getSchemeName());
				applications.setApplicationStatus(applicationsRequest.getApplications().getApplicationStatus());
				applications.setState(applicationsRequest.getApplications().getState());
				applications.setAadhaarId(customer.getAadhaarId());
				applications.setCreatedOn(new Date());
				applicationsRepository.save(applications);
				return true;
			}catch (Exception e) {
				e.getStackTrace();
				return false;
			}
		}
		else {
			return false;
		}
	}

}
