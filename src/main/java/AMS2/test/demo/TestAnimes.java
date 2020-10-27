package AMS2.test.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import AMS2.test.Utils.HibernateUtil;
import AMS2.test.models.Animes;

public class TestAnimes {
	public static void main(String[] args) {
		Animes a = new Animes("UBW",24);
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){            
			t = session.beginTransaction();
			session.save(a);
			t.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
