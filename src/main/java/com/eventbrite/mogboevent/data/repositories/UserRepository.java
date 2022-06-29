package com.eventbrite.mogboevent.data.repositories;

import com.eventbrite.mogboevent.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);
}