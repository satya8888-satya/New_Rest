package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepo {
	@Repository
	public interface Employee extends CrudRepository<Employee, Integer>{
		
	}

}
