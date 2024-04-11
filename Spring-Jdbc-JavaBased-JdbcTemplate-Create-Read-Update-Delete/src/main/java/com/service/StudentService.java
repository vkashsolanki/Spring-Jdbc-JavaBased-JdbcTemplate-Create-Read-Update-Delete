package com.service;

import java.util.List;

import com.dto.Student;

public interface StudentService {
	
	public String saveStudent(Student student);
	public void updateStudent(Student student);
	public void deleteById(int id);
	public List<Student> getAllStudent();
	
	

}
