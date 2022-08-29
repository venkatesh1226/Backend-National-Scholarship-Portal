package com.lti.nsp.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.nsp.models.StudentRegistration;
import com.lti.nsp.services.StudentRegistrationService;
import com.lti.nsp.services.StudentRegistrationServiceImpl;

@RestController
@RequestMapping("/api/v1/")
public class StudentRegistrationController {

	@Autowired
	StudentRegistrationServiceImpl student;
	
	@GetMapping("/AllStudentRegistration")
	public List<StudentRegistration>getStudentregistration()
	{
		return student.getStudentregistrations();
	}
	@PostMapping("/StudentRegistration")
	public boolean addStudentregistration(@RequestBody StudentRegistration Student)
	{
		return student.addStudentregistration(Student);
	}
	
}
