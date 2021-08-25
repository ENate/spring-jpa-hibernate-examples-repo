package com.minejava.covidtrackerapp.repository;

import com.minejava.covidtrackerapp.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);

    User findByConfirmationToken(String confirmationToken);
}
