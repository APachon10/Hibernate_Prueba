package AMS2.test.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import AMS2.test.Utils.HibernateUtil;
import AMS2.test.models.Department;
import AMS2.test.models.Employee;;

public class Test {
	public static void main(String[] args) {
		Department d = new Department("Gestion");
		Employee e =  new Employee("Alberto",1000, "Gestion");
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){            
			t = session.beginTransaction();
			session.save(d);
			t.commit();
			
			t= session.beginTransaction();
			session.save(e);
			t.commit();
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
	
}
