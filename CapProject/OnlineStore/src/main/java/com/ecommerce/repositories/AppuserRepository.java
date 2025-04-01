package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.AppUser;

public interface AppuserRepository extends JpaRepository<AppUser, Integer> {

	public AppUser findByEmail(String email);
	
	
}
