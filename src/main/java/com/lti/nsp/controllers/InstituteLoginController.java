package com.lti.nsp.controllers;
import com.lti.nsp.models.InstitutionEntity;
import com.lti.nsp.models.login.Login;
import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.services.InstituteLoginService;
import com.lti.nsp.services.StudentLoginService.StudentLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*")
public class InstituteLoginController {
    @Autowired
    InstituteLoginService serve;
    @Autowired
    private StudentLoginService serve2;
    @PostMapping(value={"/login-institute"})
    InstitutionEntity login(@RequestBody Login login){
        return serve.add(login.getUserId(),login.getPassword());
    }
    @GetMapping(value={"inst-details"})
    InstitutionEntity getStudent(){
        return serve.getInstitute(serve2.login());
    }

}
