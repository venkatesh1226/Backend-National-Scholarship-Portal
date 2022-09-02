package com.lti.nsp.services;

import com.lti.nsp.models.login.Login;
import com.lti.nsp.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@CrossOrigin(origins ="*")
public class AdminLoginService {
    @Autowired
    LoginRepository repo;
   public Login login(Login s){
            if(s.getPassword().equals("1234")&&
                    (s.getUserId().equals("nodal@nodal.com")&&s.getRole().equals("NODAL"))||
                    (s.getUserId().equals("minstry@ministry.com")&&s.getRole().equals("MINISTRY"))){
                        return repo.save(s);}
        return null;


    }
}
