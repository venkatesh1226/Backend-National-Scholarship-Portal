package com.lti.nsp.controllers;

import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.services.StudentRegistrationService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
public class StudentRegistrationController {
    @Autowired
    StudentService serve;

    @PostMapping(value={"/add-student"})
    StudentRegistration addStudent(@RequestBody StudentRegistration s){
        s= serve.addStudents(s);
        System.out.println("*********"+s.getId());
        return s;
    }

    @GetMapping(value={"/students"})
    List<StudentRegistration> getStudents(){
        return serve.getStudents();
    }

    @GetMapping(value={"/student/{id}"})
    StudentRegistration getStudentById(@PathVariable Integer id){
        return serve.getStudent(id);
    }

    @GetMapping(value = {"/student/institute/{instCode}"})
    List<StudentRegistration> getInstituteStudents(@PathVariable String instCode){
        return serve.getStudentByInstituteCode(instCode);
    }

    @PutMapping(value = {"approve/student/{id}"})
    boolean approveStudent(@PathVariable Integer id,@RequestBody boolean status){
        return serve.approveStudent(id,status);
    }

}
