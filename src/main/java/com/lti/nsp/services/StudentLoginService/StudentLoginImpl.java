package com.lti.nsp.services.StudentLoginService;

import com.lti.nsp.models.login.Login;
import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.repositories.LoginRepository;
import com.lti.nsp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin(origins ="*")
public class StudentLoginImpl implements StudentLoginService{
    @Autowired
    private StudentRepository totalDetailsRepo;
    @Autowired
    private LoginRepository loginDetailsRepo;
    public Boolean validate(String id, String pass) {
        List<StudentRegistration> res=totalDetailsRepo.findAll();
        for(StudentRegistration i:res){
            if(i.getEmail().equals(id)&&i.getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }

    public StudentRegistration add(String id, String pass) {
        List<StudentRegistration> res=totalDetailsRepo.findAll();
        for(StudentRegistration i:res){
            if(i.getEmail().equals(id)&&i.getPassword().equals(pass)){
                loginDetailsRepo.save(new Login(id,pass,"STUDENT"));
                return i;
            }
        }
        return null;
    }

    public boolean logout(){
        try {
            for(Login i:loginDetailsRepo.findAll())
                loginDetailsRepo.delete(i);
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public Login login(){
        if(loginDetailsRepo.findAll().size()>0)
        return loginDetailsRepo.findAll().get(loginDetailsRepo.findAll().size()-1);
        return null;
    }

    public StudentRegistration getStudent(Login s) {
        if(s==null)
            return null;
        List<StudentRegistration> res=totalDetailsRepo.findAll();
        for(StudentRegistration i:res){
            if(i.getEmail().equals(s.getUserId())&&i.getPassword().equals(s.getPassword())){
                System.out.println(i);
                return i;
            }
        }
        System.out.println("OUT"+s);
        return null;
    }
}
