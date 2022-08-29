package com.lti.nsp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nsp.pojo.StudentLoginPojo;
import com.lti.nsp.services.StudentLoginService;
import com.lti.nsp.services.StudentLoginServiceImpl;

@RestController

@CrossOrigin("http://localhost:4200")
public class StudentController {

	//StudentLoginService stu;
	@Autowired
	StudentLoginServiceImpl stu ;
	
	@PostMapping("/StudentLogin")
	public boolean addStudentLogin(@RequestBody StudentLoginPojo student)
	{
		
		return stu.addStudentLogin(student);
	}
	
	@GetMapping("/AllStudentLogin")
	public List<StudentLoginPojo> getStudentLogin()
	{
		return stu.getStudentLogin();
	}
	
//	@GetMapping("/StudentHome/{Email}")
//	public StudentLoginPojo validateUser(@PathVariable("user")String user,)
//	{
//		
//		return stu.validateUser(user,password);
//		//return student.validateLogin(Email);	
//	
//	}
}
