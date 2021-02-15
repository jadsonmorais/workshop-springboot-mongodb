package com.jadsonmorais.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jadsonmorais.demo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {}
