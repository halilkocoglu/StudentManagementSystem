package com.project.sms.controller;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.sms.entity.Student;
import com.project.sms.service.IStudentService;



@Controller
public class StudentController {
	
	private IStudentService studentService;

	public StudentController(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	

	
}
