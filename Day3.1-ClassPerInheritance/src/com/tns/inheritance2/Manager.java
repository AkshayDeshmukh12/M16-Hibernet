package com.tns.inheritance2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("MGR")
@Table(name="Manager2")
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