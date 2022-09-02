package com.lti.nsp.controllers;

import com.lti.nsp.models.login.Login;
import com.lti.nsp.services.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class AdminController {
    @Autowired
    AdminLoginService serve;

    @PostMapping(value={"/login-admin"})
    Login login(@RequestBody Login l){
        return serve.login(l);
    }
}
