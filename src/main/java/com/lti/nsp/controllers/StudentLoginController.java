package com.lti.nsp.controllers;

import com.lti.nsp.models.login.StudentLogin;
import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.repositories.StudentLoginRepository;
import com.lti.nsp.services.StudentLoginService.StudentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins ="http://localhost:4200/studentlogin")
public class StudentLoginController {
	
	@Autowired
	private StudentLoginRepository repo;
//    @Autowired
//    private StudentLoginService serve;
//
//    @PostMapping(value={"/login-student"})
//    StudentRegistration addStudentLogin(@RequestBody StudentLogin s){
//    	System.out.println("Posted");
//        return serve.add(s.getUserId(),s.getPassword());
//    }
//
//    @GetMapping(value={"/validate-student"})
//    Boolean validateStudentCredentials(@RequestBody StudentLogin s){
//        return serve.validate(s.getUserId(),s.getPassword());
//    }
	@PostMapping("/login")
	public ResponseEntity<StudentLogin> loginUser(@RequestBody StudentLogin userData)
	{ System.out.print("UserData");
		StudentLogin user=repo.findByUserId(userData.getUserId());
	if(user.getPassword().equals(userData.getPassword()))
		return ResponseEntity.ok(user);
	
		return (ResponseEntity<StudentLogin>) ResponseEntity.internalServerError();
	}

}