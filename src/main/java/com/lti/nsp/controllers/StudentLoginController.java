package com.lti.nsp.controllers;

import com.lti.nsp.models.login.StudentLogin;
import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.services.StudentLoginService.StudentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentLoginController {
    @Autowired
    private StudentLoginService serve;

    @PostMapping(value={"/login-student"})
    StudentRegistration addStudentLogin(@RequestBody StudentLogin s){
        return serve.add(s.getUserId(),s.getPassword());
    }

    @GetMapping(value={"/validate-student"})
    Boolean validateStudentCredentials(@RequestBody StudentLogin s){
        return serve.validate(s.getUserId(),s.getPassword());
    }

}
