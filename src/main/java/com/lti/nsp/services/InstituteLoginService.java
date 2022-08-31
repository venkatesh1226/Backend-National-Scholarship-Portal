package com.lti.nsp.services;

import com.lti.nsp.models.InstitutionEntity;
import com.lti.nsp.models.login.Login;
import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.repositories.InstitutionRegistrationReopsitory;
import com.lti.nsp.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin(origins ="*")
public class InstituteLoginService {
    @Autowired
    private LoginRepository loginDetailsRepo;
    @Autowired
    private InstitutionRegistrationReopsitory totalDetailsRepo;


    public InstitutionEntity add(String id, String pass) {
        List<InstitutionEntity> res=totalDetailsRepo.findAll();
        for(InstitutionEntity i:res){
            if(i.getEmail().equals(id)&&i.getSetPassword().equals(pass)){
                loginDetailsRepo.save(new Login(id,pass,"INSTITUTE"));
                return i;
            }
        }
        return null;
    }

    public boolean logout(Login s){
        try {
            loginDetailsRepo.delete(s);
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    public InstitutionEntity getInstitute(Login s){
        if(s==null)
            return null;
        List<InstitutionEntity> res=totalDetailsRepo.findAll();
        for(InstitutionEntity i:res){
            if(i.getEmail().equals(s.getUserId())&&i.getSetPassword().equals(s.getPassword())){
                System.out.println(i);
                return i;
            }
        }
        System.out.println("OUT"+s);
        return null;
    }

}
