package com.sapient.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.OneToOne;

@Entity(name="student")
public class PersonBean 
{
	@Id
	Integer id;
	@Column
	String fname;
	@Column
	String lname;

//	@OneToMany
//	@JoinColumn(name = "idl",insertable=false,updatable=false)
//	//@OneToOne(mappedBy = "eid",fetch = FetchType.LAZY)
//	public List<EmployeeBean> eb;

//
//	
//	public List<EmployeeBean> getEb() {
//		return eb;
//	}
//	public void setEb(List<EmployeeBean> eb) {
//		this.eb = eb;
//	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
