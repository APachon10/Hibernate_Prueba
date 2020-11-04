package AMS2.test.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import AMS2.test.Implementations.DepartmentImpl;
import AMS2.test.Interfaces.IDepartment;
import AMS2.test.Utils.HibernateUtil;
import AMS2.test.models.Department;
import AMS2.test.models.Employee;;

public class Test {
	public static void main(String[] args) {
		
		/* new HighSchool*/
		IDepartment dep_Manager = new DepartmentImpl();
		dep_Manager.insertDepartment(new Department("Gestion"));
		dep_Manager.insertDepartment(new Department("Entretenimiento"));
	}
	
}
