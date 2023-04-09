package com.esys.airportproject.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.esys.airportproject.entities.UserEntity;
import com.esys.airportproject.repositories.RoleRepository;
import com.esys.airportproject.entities.RoleEntity;
import com.esys.airportproject.repositories.RoleRepository;
import com.esys.airportproject.repositories.UserRepository;

@RestController
@RequestMapping("/api/v1/users")

public class UserController {

	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private RoleRepository roleRepository; 
	
	List<UserEntity> users = new ArrayList<UserEntity>();
	
	private List<UserEntity> getDB (){
		List<UserEntity> users = new ArrayList<UserEntity>();
		users.add(new UserEntity(1, "Pera", "Detlic", "pera.detlic@uns.rs"));
		users.add(new UserEntity(2, "Ptica", "Trkačica", "ptica.trkacica@uns.rs"));
		return users; 
	}
	
	@RequestMapping (method = RequestMethod.GET, path = "/users")
	public ResponseEntity<?> getAll(){
		return new ResponseEntity <List <UserEntity>>((List <UserEntity>)
			userRepository.findAll(), HttpStatus.OK);
		}
	
	@RequestMapping (method = RequestMethod.POST, value = "/")
	public UserEntity createNewUser (@RequestBody UserEntity newUser) {
		List<UserEntity> users = getDB();
		newUser.setId((new Random()).nextInt());
		users.add(newUser);
		return newUser;
		
	}
	
}
