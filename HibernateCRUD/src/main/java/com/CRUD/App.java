package com.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        // Insert Record
        Student s1 = new Student();
        s1.setName("John");
        s1.setCity("Pune");
        s1.setAge(23);
        
        Student s2 = new Student();
        s2.setName("Rohan");
        s2.setCity("Baramati");
        s2.setAge(22);
        
        Student s3 = new Student();
        s3.setName("Rushi");
        s3.setCity("Mumabi");
        s3.setAge(21);
        
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        
        //Retrive Data
        Student sRead = session.get(Student.class, 1);
        System.out.println("Name : "+sRead.getName());
        System.out.println("City : "+sRead.getCity());
        System.out.println("Age : "+sRead.getAge());
        
        // Update Record
        Student sUpdate = session.get(Student.class, 1);
        sUpdate.setName("Jay");
        sUpdate.setCity("Dhule");
        sUpdate.setAge(22);
        System.out.println("Record Updated....");
        
        // Delete record
        Student sDelete = session.get(Student.class, 2);
        session.remove(sDelete);
        System.out.println("Record Deleted.....");
        
        tx.commit();
        session.close();
    }
}
