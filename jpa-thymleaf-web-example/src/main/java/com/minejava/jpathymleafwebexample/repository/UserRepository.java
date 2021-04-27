package com.minejava.jpathymleafwebexample.repository;

import com.minejava.jpathymleafwebexample.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
