package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_name")
public class Job {
	
	@Id
	@GeneratedValue
	
	@Column(name="i̇d")
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	
	public Job() {}
	
	
	public Job(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
