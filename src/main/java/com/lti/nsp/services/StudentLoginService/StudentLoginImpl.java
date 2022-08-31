package com.lti.nsp.services.StudentLoginService;

import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.repositories.StudentLoginRepository;
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
    private StudentLoginRepository loginDetailsRepo;
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
                return i;
            }
        }
        return null;
    }
}
