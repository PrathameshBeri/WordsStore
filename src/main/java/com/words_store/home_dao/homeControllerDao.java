package com.words_store.home_dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.words_store.home_repository.homeControllerRepo;


@Repository
@Transactional
public interface homeControllerDao extends PagingAndSortingRepository<homeControllerRepo, Integer>, 
								JpaSpecificationExecutor<homeControllerRepo>{

}
