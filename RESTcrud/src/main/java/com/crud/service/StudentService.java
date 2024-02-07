package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Student;
import com.crud.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentRepository SREPO;
	
	public List<Student> getStudent(){
		
		return SREPO.findAll();
	}
	
	public Student getStudentById(int rollno){
		
		return SREPO.findById(rollno).get();
	}
	
	public void insertStudent(Student s) {
		SREPO.save(s);
	}
	
	public void deleteStudent(int rollno) 
	{
		SREPO.deleteById(rollno);
	}
	
	public void updateStudent(Student s) 
	{
		SREPO.save(s);
	}
}
