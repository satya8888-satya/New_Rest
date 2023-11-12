package com.newrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.model.Employee;
import com.repository.EmployeeRepo;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {
	@Autowired
	EmployeeRepo EmployeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
          Employee e1 = new Employee(1111,"Satya","Developer","Guntur","SDE", 100000.00);
          Employee e2 = new Employee(2222,"Teja", "Devloper","Eluru","SDE", 100000.00);
          Employee e3 = new Employee(3333,"Krishna","Admin","Dwaraka","President",200000.00);
		  List<Employee> l = new ArrayList<>();
		  System.out.println("The List Of Employees Are:"+" "+l);
	}

}
