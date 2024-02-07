package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Student;
import com.crud.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	
	@Autowired
	StudentService SSERV= new StudentService();
	
	@GetMapping("/")
	public List<Student> getStudent() {
		List<Student> StudList=SSERV.getStudent();
		return StudList;
	}
	
	@GetMapping("/{id}")
	public Student getStudentByRolno(@PathVariable int id) {
		Student STUD=SSERV.getStudentById(id);
		return STUD;
	}
	
	@PostMapping("/")
	public void insertStudent(@RequestBody Student s) 
	{
		SSERV.insertStudent(s);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) 
	{
		SSERV.deleteStudent(id);
	}
	
	@PutMapping("/")
	public void updateStudent(@RequestBody Student s) 
	{
		SSERV.updateStudent(s);
	}
}
