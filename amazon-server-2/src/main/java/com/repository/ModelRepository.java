package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.UserModel;

public interface ModelRepository extends JpaRepository<UserModel, Integer> {

	void save();
	
	

}
