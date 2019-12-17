package com.example.demo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Column(name="name")
	private String name;
	@Id
	@Column(name="aadhaar_id")
	private Integer aadhaarId;
	@Column(name="email_id")
	private String emailId;
	@Column(name="created_on")
	private Date createdOn;
	
	@OneToMany(fetch=FetchType.EAGER,cascade = {CascadeType.ALL})
	@JoinColumn(name="aadhaar_id" ,referencedColumnName="aadhaar_id")
	private List<Applications> applicationsList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAadhaarId() {
		return aadhaarId;
	}
	public void setAadhaarId(Integer aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public List<Applications> getApplicationsList() {
		return applicationsList;
	}
	public void setApplicationsList(List<Applications> applicationsList) {
		this.applicationsList = applicationsList;
	}

}
