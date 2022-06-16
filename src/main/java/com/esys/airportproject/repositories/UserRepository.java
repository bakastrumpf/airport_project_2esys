package com.esys.airportproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.esys.airportproject.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
