package com.example.apidury.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CrudRepository<T, ID>
        extends MongoRepository<T, ID> {

}


