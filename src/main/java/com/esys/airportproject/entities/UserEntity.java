package com.esys.airportproject.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table

public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer id;
	
	@Column(name = "name")
	@NotNull(message = "Name must not be empty")
	private String name;
	
	@Column(name = "surname")
	@NotNull(message = "Surname must not be empty")
	private String surname;
	
	@Column(name = "username")
	@NotNull(message = "Username must not be empty")
	@Size(min = 3, max = 50, message = "Username must be between {min} and {max} characters long.")
	private String username;
	
	@JsonIgnore
	@Column
	@NotNull(message = "Password must not be empty")
	@Size(min = 5, max = 10, message = "Password must be between {min} and {max} characters long.")
	private String password;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.REFRESH })
	@JoinColumn(name = "role")
	private RoleEntity role;

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}



	public UserEntity(Integer id, @NotNull(message = "Name must not be empty") String name,
			@NotNull(message = "Surname must not be empty") String surname,
			@NotNull(message = "Username must not be empty") @Size(min = 3, max = 50, message = "Username must be between {min} and {max} characters long.") String username,
			@NotNull(message = "Password must not be empty") @Size(min = 5, max = 10, message = "Password must be between {min} and {max} characters long.") String password,
			RoleEntity role) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	

}


