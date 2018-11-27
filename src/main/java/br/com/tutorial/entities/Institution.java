package br.com.tutorial.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Institution {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 30)
	private String name;	
	
	@Column(length = 100)
	private String address;
	
	@OneToMany(mappedBy = "institution")
	private Set<Student> student;
	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Set<Student> getStudent() {
		return student;
	}


	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	
	
}
