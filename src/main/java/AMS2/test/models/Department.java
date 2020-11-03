package AMS2.test.models;

//Imports
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Codigo
@Entity
public class Department {
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String name;
	
	//Constructores
	public Department() {
		super();
	}
	public Department(String name) {
		super();
		this.name = name;
	}
	//Getters && Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName( ){
		return name;
	}
	public void setName( String deptName ){
		this.name = deptName;
	}
	
	// To String
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}
