package com.example.demo.repository;

import com.example.demo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends
        // You can still extend persistence specific repository interface here
        // If you are getting a method erasure or clash then you are doing something wrong.
        MongoRepository<Person,String>,
        CustomBaseRepoNameDoesntMatter<Person,String> {

}
