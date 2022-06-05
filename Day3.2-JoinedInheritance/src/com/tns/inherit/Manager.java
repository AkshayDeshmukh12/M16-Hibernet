package com.tns.inherit;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tns.inheritance.Employee;

@Entity
@DiscriminatorValue("MGR")
@Table

public class Manager extends Employee
{
	 private static final long serialVersionUID=1L;
	 private String depName;
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	 
}