package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="applications")
public class Applications {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="scheme_name")
	private String schemeName;
	@Column(name="application_status")
	private String applicationStatus;
	@Column(name="created_on")
	private Date createdOn;
	private String state;
	
    @Column(name="aadhaar_id")
    private Integer aadhaarId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getAadhaarId() {
		return aadhaarId;
	}
	public void setAadhaarId(Integer aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	
}
