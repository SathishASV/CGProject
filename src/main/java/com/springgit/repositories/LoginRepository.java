package com.springgit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springgit.entities.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer>{

}
