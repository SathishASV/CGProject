package com.springgit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springgit.services.OrderServiceImpl;


@Repository
public interface OrderRepositoryImpl extends JpaRepository<OrderServiceImpl,Integer>{

	
}
