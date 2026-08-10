package HibernateHQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.CRUD.Student;

public class HibernateHql {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		StudentHQL s1 = new StudentHQL();
		s1.setName("John");
		s1.setCity("Pune");
		s1.setAge(23);
		
		StudentHQL s2 = new StudentHQL();
		s2.setName("Atharva");
		s2.setCity("BMT");
		s2.setAge(22);
		
		StudentHQL s3 = new StudentHQL();
		s3.setName("Juhi");
		s3.setCity("Pune");
		s3.setAge(21);
		
		StudentHQL s4 = new StudentHQL();
		s4.setName("Karan");
		s4.setCity("Gujarat");
		s4.setAge(21);
		
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		session.persist(s4);
		
		//HQL
		
		//Single record getting method
		String query = "from StudentHQL where id = 1";
		Query r = session.createQuery(query);
		StudentHQL student = (StudentHQL) r.uniqueResult();
		System.out.println(student.getName());
		
		//Multiple records getting method
		String q = "from StudentHQL";
		Query r1 = session.createQuery(q);
		List<StudentHQL> stu = r1.getResultList();
		for(StudentHQL s : stu) {
			System.out.println(s.getName()+" : "+s.getCity()+" : "+s.getAge());
		}
		
		// Fetch Query
//		String q1 = "from StudentHQL where city =:c";
//		Query r2 = session.createQuery(q1);
//		r2.setParameter("c", "Pune");
//		StudentHQL student1 = (StudentHQL) r2.uniqueResult();
//		System.out.println(student1.getName()+" : "+student1.getCity()+" : "+student1.getAge());
//		
		// Update Query
		String q2 = "update StudentHQL set name =: n where id =: i";
		Query r3 = session.createQuery(q2);
		r3.setParameter("n", "Jimmy");
		r3.setParameter("i", "2");
		r3.executeUpdate();
		System.out.println("Update Successful....");
		
		// Delete Query
//		String q3 = "Delete from StudentHQL where id=:i";
//		Query r4 = session.createQuery(q3);
//		r4.setParameter("i", "4");
//		r4.executeUpdate();
//		System.out.println("Delete Successful....");
		session.clear();	// Used to Clear First Catch
		// Like Operator
		String q4 = "from StudentHQL where name like :s";
		Query r5 = session.createQuery(q4);
		r5.setParameter("s", "j%");
		List<StudentHQL> stud2 = r5.getResultList();
		for(StudentHQL st1 : stud2) {
			System.out.println(st1.getName()+" : "+st1.getCity()+" : "+st1.getAge());
		}
		
		// Pagination
		String spagination = "from StudentHQL";
		Query<StudentHQL> sh = session.createQuery(spagination, StudentHQL.class);
		sh.setFirstResult(2);
		sh.setMaxResults(3);
		List<StudentHQL> slist = sh.list();
		for(StudentHQL s : slist) {
			System.out.println(s.getName()+" : "+s.getCity()+" : "+s.getAge());
		}
		
		// Native SQL
		
		NativeQuery<StudentHQL> nq = session.createNativeQuery("Select * from studenthql",StudentHQL.class);
		List<StudentHQL> l = nq.list();
		for(StudentHQL h : l) {
			System.out.println(h.getName()+" : "+h.getCity()+" : "+h.getAge());
		}
		
		NativeQuery<StudentHQL> nq1 = session.createNativeQuery("Select * from studenthql where city = 'pune'",StudentHQL.class);
		List<StudentHQL> li = nq1.list();
		for(StudentHQL h : li) {
			System.out.println(h.getName()+" : "+h.getCity()+" : "+h.getAge());
		}
		
		tx.commit();
		session.close();
	}
}
