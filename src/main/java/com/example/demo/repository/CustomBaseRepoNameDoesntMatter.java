package com.example.demo.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean// If you forget this Spring will make a bean for you for this interface which you don't want!
public interface CustomBaseRepoNameDoesntMatter<T,ID extends Serializable>
        extends PagingAndSortingRepository<T,ID> {

    void someMethod();

}