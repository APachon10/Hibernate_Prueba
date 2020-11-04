package AMS2.test.Interfaces;

import java.util.List;

import AMS2.test.models.Department;

public interface IDepartment {
	
	// Get all Departments
	public List<Department> getallDepartments();
	
	// Get One Department by ID
	public Department getDepartmentbyId(int departmentId);

	// Delete one Department by ID
	public boolean deleteDepartmentbyId(Department d);

	// Insert a new Department
	public Department insertDepartment(Department d);

	//Update the info about one department
	public Department updateDepartment(Department d);
}
