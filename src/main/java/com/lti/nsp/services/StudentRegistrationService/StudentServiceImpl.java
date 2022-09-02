package com.lti.nsp.services.StudentRegistrationService;

import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@CrossOrigin(origins ="*")
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository repo;
    public StudentRegistration addStudents(StudentRegistration student) {
        return repo.save(student);
    }

    public List<StudentRegistration> getStudents() {
        return repo.findAll();
    }

    public StudentRegistration getStudent(Integer id) {
        Optional<StudentRegistration> res=repo.findById(id);
        if(res.isEmpty())
            return null;
        else return res.get();
    }

    public List<StudentRegistration> getStudentByInstituteCode(String instCode) {
        List<StudentRegistration> res=new ArrayList<>();
        for(StudentRegistration s:repo.findAll()){
            if(s.getInstCode().equals(instCode))
                res.add(s);
        }
        return (res.size()==0)?null:res;
    }

    public boolean approveStudent(Integer s,boolean status) {
        List<StudentRegistration> all=repo.findAll();
        for(StudentRegistration i:all){
            if(i.getId()==s){
                i.setAllowed(status);
                repo.saveAll(all);
                return true;
            }
        }
        return false;
    }
}
