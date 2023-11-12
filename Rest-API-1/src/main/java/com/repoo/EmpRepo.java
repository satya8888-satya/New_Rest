package com.repoo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modellayer.ModelClass;

public interface EmpRepo extends JpaRepository<ModelClass, Integer> {

}
