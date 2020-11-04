package AMS2.test.Interfaces;

import java.util.List;

import AMS2.test.models.Employee;

public interface IEmployee {
		// Get all Employees
		public List<Employee> getallEmployees();
		
		// Get One Employee by ID
		public Employee getEmployeebyId(int employeeId);

		// Delete one Employee by ID
		public int deleteEmployeebyId(int employeeId);

		// Insert a new Employee
		public Employee insertDepartment(Employee e);

		//Update the info about one Employee
		public Employee updateDepartment(Employee e);
}
