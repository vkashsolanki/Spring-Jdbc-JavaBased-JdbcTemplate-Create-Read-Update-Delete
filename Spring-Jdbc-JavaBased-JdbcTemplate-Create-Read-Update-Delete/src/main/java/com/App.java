package com;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.JavaConfigurations;
import com.dto.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigurations.class);
		StudentService bean = context.getBean("students", StudentServiceImpl.class);
		

//		Student st = new Student();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enther the id");
//		int id = sc.nextInt();
//		st.setId(id);
//
//		System.out.println("Enther the name");
//		String name = sc.next();
//		st.setName(name);
//		System.out.println("Enther the email");
//		String email = sc.next();
//		st.setEmial(email);
//		
//		String save = bean.saveStudent(st);
//		System.out.println(save);
//		
		
		
		
		
		// update student
//		Student s1 = new Student();
//		System.out.println("Enther the id");
//		int uid = sc.nextInt();
//		s1.setId(uid);
//		System.out.println("Enther the name");
//		String uname = sc.next();
//		s1.setName(uname);
//		System.out.println("Enther the email");
//		String uemail = sc.next();
//		s1.setEmial(uemail);
//		bean.updateStudent(s1);
		
		// delete student
		
//		Student s2 = new Student();
//		System.out.println("Enther the id");
//		int deleteid = sc.nextInt();
//		s2.setId(deleteid);
//		bean.deleteById(deleteid);
		
		
		System.out.println("All Deatial are Student ");
		List<Student> allStudent = bean.getAllStudent();
		System.out.println(allStudent);
		
		

	}
}
