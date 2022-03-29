package com.sgenlecroyant.springboot.simplecaching.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "users")
@Table(name = "users", uniqueConstraints = {
		@UniqueConstraint(name = "unique_constraint", columnNames = {"username"})
})
@SequenceGenerator(name = "user_sequence", initialValue = 1, allocationSize = 1, sequenceName = "user_sequence")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
	private Integer id;
	private String firstName;
	private String lastName;
	private String username;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, String username) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ "]";
	}
	
	

}
