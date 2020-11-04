package AMS2.test.Implementations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import AMS2.test.Interfaces.IDepartment;
import AMS2.test.Utils.HibernateUtil;
import AMS2.test.models.Department;

public class DepartmentImpl implements IDepartment{
	@Override
	public List<Department> getallDepartments() {
		List<Department> list = null;
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){            
			t = session.beginTransaction();
			
			session.createCriteria(Department.class).list();
			
			t.commit();
			return list;
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		return null;
	}
	@Override
	public Department getDepartmentbyId(int departmentId) {
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){            
			t = session.beginTransaction();
		
			Department d = session.find(Department.class, departmentId);
			t.commit();
			
			t= session.beginTransaction();
			//session.save(e);
			t.commit();
			return d;
		}catch(Exception e2) {
			e2.printStackTrace();
			return null;
		}
		
	}
	@Override
	public boolean deleteDepartmentbyId(Department d) {
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){            
			t = session.beginTransaction();
			
			t.commit();
			return true;
		}catch(Exception e2) {
			e2.printStackTrace();
			return false;
		}
	}
	@Override
	public Department insertDepartment(Department d) {
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){            
			t = session.beginTransaction();
			session.save(d);
			t.commit();
			return d;
		}catch(Exception e2) {
			e2.printStackTrace();
			return null;
		}
		
	}
	@Override
	public Department updateDepartment(Department d) {
		// TODO Auto-generated method stub
		return null;
	}
}
