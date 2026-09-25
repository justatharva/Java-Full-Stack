package com.HibernateDAO;

import java.util.List;

import com.DAO.EmpDao;
import com.DAO.EmpInterface;
import com.Entity.Employe;

public class App 
{
    public static void main( String[] args )
    {
    	EmpInterface dao = new EmpDao();
    	
    	//Insert Data
    	Employe e1 = new Employe();
    	e1.setName("Atharva");
    	e1.setCity("Baramati");
    	e1.setAge(23);
    	
    	Employe e2 = new Employe();
    	e2.setName("Rushi");
    	e2.setCity("Pune");
    	e2.setAge(22);
    	
    	Employe e3 = new Employe();
    	e3.setName("Karan");
    	e3.setCity("Gujarat");
    	e3.setAge(22);
    	
    	dao.insertData(e1);
    	dao.insertData(e2);
    	dao.insertData(e3);
    	
    	// Retrive Data
    	Employe read = new Employe();
    	List<Employe> list = dao.getEmployes();
    	for(Employe elist : list) {
    		System.out.println("Id is : "+elist.getId());
    		System.out.println("Name is : "+elist.getName());
    		System.out.println("City is : "+elist.getCity());
    		System.out.println("Age is : "+elist.getAge());
    		System.out.println("==========================================");
    	}
    	
    	//Single Data Retrive
    	Employe eread = dao.getEmploye(1);;
    	System.out.println("Id is : "+eread.getId());
		System.out.println("Name is : "+eread.getName());
		System.out.println("City is : "+eread.getCity());
		System.out.println("Age is : "+eread.getAge());
		System.out.println("==========================================");
    	
    	//Update Data
    	Employe eUpdate = new Employe();
    	eUpdate.setId(2);
    	eUpdate.setName("Rohan");
    	eUpdate.setCity("Mumbai");
    	eUpdate.setAge(23);
    	dao.updateData(eUpdate);
    	System.out.println("Data Updated Successfully....");
    	
    	//Delete Data
    	Employe eDelete = new Employe();
    	dao.deleteData(2);
    	System.out.println("Data Deleted Successfully.....");
    }
}
