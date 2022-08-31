package com.lti.nsp.controllers;

import com.lti.nsp.models.login.Login;
import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.services.StudentLoginService.StudentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*")
public class StudentLoginController {
    @Autowired
    private StudentLoginService serve;

    @PostMapping(value={"/login-student"})
    StudentRegistration addStudentLogin(@RequestBody Login s){
        return serve.add(s.getUserId(),s.getPassword());
    }

    @GetMapping(value={"/validate-student"})
    Boolean validateStudentCredentials(@RequestBody Login s){
        return serve.validate(s.getUserId(),s.getPassword());
    }

    @DeleteMapping(value={"/logout"})
    boolean logout(){
        return serve.logout();
    }
    @GetMapping(value={"/login-details"})
    Login getLogin(){
        return serve.login();
    }

    @GetMapping(value={"std-details"})
    StudentRegistration getStudent(){
        return serve.getStudent(serve.login());
    }
}
