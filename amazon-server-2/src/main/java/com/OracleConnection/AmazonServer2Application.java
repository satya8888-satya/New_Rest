package com.OracleConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.model.UserModel;
import com.repository.ModelRepository;

@SpringBootApplication
public class AmazonServer2Application implements CommandLineRunner{
	@Autowired
	  ModelRepository repo;
	

	public static void main(String[] args) {
		System.out.println("The Chatrapathi Shivaji ");
		System.out.println("The Shambaji Maharaj");
		SpringApplication.run(AmazonServer2Application.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new UserModel(1111,"Satya","Guntur","Mobile"));
		repo.save(new UserModel(1111,"Abdulla","Krishna","Laptop"));
		repo.save(new UserModel(1111,"SaiKiran","Palnadu","IPad"));
	}

}
