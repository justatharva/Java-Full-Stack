package com.mapping;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proj_id;
	private String proj_name;
	@ManyToMany
//	@JoinColumn(name = "Employee_Id")
	List<Employes> emp = new ArrayList<Employes>();

	public int getProj_id() {
		return proj_id;
	}

	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	public List<Employes> getEmp() {
		return emp;
	}

	public void setEmp(List<Employes> emp) {
		this.emp = emp;
	}
	
}
