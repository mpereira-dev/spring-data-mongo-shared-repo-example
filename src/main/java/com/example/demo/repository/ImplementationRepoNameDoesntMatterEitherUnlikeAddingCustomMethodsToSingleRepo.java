package com.example.demo.repository;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.io.Serializable;

//@Repository // If you add this annotation you will get an autowiring issue
public class ImplementationRepoNameDoesntMatterEitherUnlikeAddingCustomMethodsToSingleRepo<T,ID extends Serializable>
        extends SimpleMongoRepository<T,ID> implements CustomBaseRepoNameDoesntMatter<T,ID> {

    private final MongoOperations mongoOperations;
    private final MongoEntityInformation<T, ID> entityInformation;

    public ImplementationRepoNameDoesntMatterEitherUnlikeAddingCustomMethodsToSingleRepo(
            MongoEntityInformation<T, ID> metadata,
            MongoOperations mongoOperations) {
        super(metadata,mongoOperations);

        this.entityInformation = metadata;
        this.mongoOperations = mongoOperations;
    }

    @Override
    public void someMethod() {
        System.out.println("Test");
    }
}
