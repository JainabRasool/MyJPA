package com.company.proj.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeModel {
	
	@Id
	int eId;
	String eName;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}

	
	
	
	
}
