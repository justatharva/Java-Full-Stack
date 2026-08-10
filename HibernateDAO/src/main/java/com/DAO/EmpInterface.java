package com.DAO;

import java.util.List;

import com.Entity.Employe;

public interface EmpInterface {

	public void insertData(Employe employe);
	List<Employe> getEmployes();
	public Employe getEmploye(int id);
	public void updateData(Employe employe);
	public void deleteData(int id);
}
