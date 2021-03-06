package AMS2.test.models;

//Imports
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	//Atributos
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private int eid;
	private String ename;
	private int salary;
	private String deg;

	@ManyToOne
	private Department department;
	
	//Constructores
	public Employee(String ename, int salary, String deg) {
		super( );
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}

	//Getters && Setters
	public Employee( ) {
		super();
	}
	public int getEid( ) {
		return eid;
	}
	public void setEid(int eid)  {
		this.eid = eid;
	}
	public String getEname( ) {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary( ) {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDeg( ){
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public Department getDepartment(){
		return department;
	}
	public void setDepartment(Department department){
		this.department = department;
	}
	
	// To String
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + ", department="
				+ department + "]";
	}
	
}
