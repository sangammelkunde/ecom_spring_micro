package com.wipro.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springboot.Entity.User;

public interface UserRepository extends JpaRepository<Admin, Integer> {
	 
	}
