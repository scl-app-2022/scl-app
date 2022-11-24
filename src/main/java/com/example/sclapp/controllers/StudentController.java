package com.example.sclapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sclapp.resources.Student;

@RestController
public class StudentController {
	
	static int id= 123;
	
	@GetMapping("/")
	public String rootPath() {
		return "Welcome to School App";
	}

	@GetMapping("/student")
	public Student getStudent(@RequestParam String id) {
		
		System.out.println("req : " + id);
		
		Student std = new Student();
		std.setAddress("Hyderabad");
		std.setId(id);
		std.setName("Manohar");
		std.setParentName("Subbareddy");
		std.setPhoneNumber("7563444444");
		
		return std;
	}
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		if(student.getParentName() != null & !"".equals(student.getParentName())) {
			student.setId(String.valueOf(++id));
		} 
		
	    return student;
	  }

}
