package com.newcrud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newcrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}