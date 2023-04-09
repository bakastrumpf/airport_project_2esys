package com.esys.airportproject.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table

public class RoleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "role_name")
	private String roleName;
	
	@JsonIgnore
	private List<UserEntity> users = new ArrayList<>();

	public RoleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleEntity(Integer id, String roleName, List<UserEntity> users) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

	
	

}
