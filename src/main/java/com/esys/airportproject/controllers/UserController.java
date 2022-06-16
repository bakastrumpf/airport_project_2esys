package com.esys.airportproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.esys.airportproject.entities.UserEntity;
//import com.esys.airportproject.entities.RoleEntity;
//import com.esys.airportproject.repositories.RoleRepository;
import com.esys.airportproject.repositories.UserRepository;

@RestController
@RequestMapping("/api/v1/users")

public class UserController {

	@Autowired
	private UserRepository userRepository; 
	
	//@Autowired
	//private RoleRepository roleRepository; 
	
	//@RequestMapping(path = "/users", method = RequestMethod.GET);
	public ResponseEntity<?> getAll(){
		return new ResponseEntity <List <UserEntity>>((List <UserEntity>)
			userRepository.findAll(), HttpStatus.OK);
		}
	
	List<UserEntity> users = new ArrayList<UserEntity>();
	
}
