package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.Student;
import com.repo.StudentRepository;

@Service(value = "students")
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public String saveStudent(Student student) {
	repository.saveStudentData(student);
		return "Student Inserted";
	}

	@Override
	public void updateStudent(Student student) {
		repository.updateStudentData(student);
		
	}

	@Override
	public void deleteById(int id) {
		repository.deleteStudentData(id);
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return  repository.getAllStudentData();
	}


	
}