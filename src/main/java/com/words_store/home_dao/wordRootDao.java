package com.words_store.home_dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.words_store.entity.wordRoot;
import com.words_store.entity.wordStore;

@Repository
public interface wordRootDao extends PagingAndSortingRepository<wordRoot, Integer>, 
JpaSpecificationExecutor<wordRoot> {

}
