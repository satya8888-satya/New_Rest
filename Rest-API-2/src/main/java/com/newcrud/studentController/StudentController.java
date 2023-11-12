package com.newcrud.studentController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newcrud.Repo.StudentRepository;
import com.newcrud.entity.Student;

@RestController

public class StudentController {
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		//System.out.println("student course "+student.getCourse() );
	 return repo.save(student);
	}
	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getStudents(){
		return new ResponseEntity<>( repo.findAll(),HttpStatus.OK);
	}
	@GetMapping("/getStudents/{id}")
	public ResponseEntity getStudent(@PathVariable int id){
		Optional <Student> student =  repo.findById(id);
		if(student.isPresent()) {
			
			return new ResponseEntity<>(student.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@PutMapping("/getStudents/{id}")
	public ResponseEntity updateStudent(@PathVariable int id,@RequestBody Student stud ){
		Optional <Student> student =  repo.findById(id);
		if(student.isPresent()) {
			student.get().setName(stud.getName());
			student.get().setAddress(stud.getAddress());
			student.get().setFee(stud.getFee());
			student.get().setBranch(stud.getBranch());
			
			return new ResponseEntity<>(student.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	@DeleteMapping("/getStudents/{id}")
	public  ResponseEntity<Student> deleteStudent(@PathVariable int id){
		Optional <Student> student =  repo.findById(id);
		if(student.isPresent()) {
			
			repo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
 