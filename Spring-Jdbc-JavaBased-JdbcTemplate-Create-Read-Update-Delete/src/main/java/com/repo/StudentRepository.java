package com.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dto.Student;
import com.mapper.StudentMapper;

@Repository
public class StudentRepository {
	@Autowired
	private final JdbcTemplate jdbcTemplate;

	public StudentRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveStudentData(Student student) {
		String query = "insert into student(id, name, email)value(?,?,?)";
		jdbcTemplate.update(query, student.getId(), student.getName(), student.getEmail());

	}

	public void updateStudentData(Student student) {
		String query = "update student set name = ?, email = ? where id = ?";
		jdbcTemplate.update(query, student.getName(), student.getEmail(), student.getId());
	}

	public void deleteStudentData(int id) {
		String query = "delete from student where id=?";
		jdbcTemplate.update(query, id);
	}

	public List<Student> getAllStudentData() {
		String query = "select * from student";

		return jdbcTemplate.query(query, new StudentMapper());

	}
}
