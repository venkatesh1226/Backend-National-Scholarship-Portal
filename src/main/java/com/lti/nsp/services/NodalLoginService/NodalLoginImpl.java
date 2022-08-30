//package com.lti.nsp.services.NodalLoginService;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.lti.nsp.models.student.StudentRegistration;
//import com.lti.nsp.repositories.NodalLoginRepository;
//import com.lti.nsp.repositories.StudentLoginRepository;
//import com.lti.nsp.repositories.StudentRepository;
//
//public class NodalLoginImpl {
//	@Autowired
//    private StudentRepository totalDetailsRepo;
//    @Autowired
//    private NodalLoginRepository loginDetailsRepo;
//    public Boolean validate(String id, String pass) {
//        List<Nodal> res=totalDetailsRepo.findAll();
//        for(StudentRegistration i:res){
//            if(i.getEmail().equals(id)&&i.getPassword().equals(pass)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public StudentRegistration add(String id, String pass) {
//        List<StudentRegistration> res=totalDetailsRepo.findAll();
//        for(StudentRegistration i:res){
//            if(i.getEmail().equals(id)&&i.getPassword().equals(pass)){
//                return i;
//            }
//        }
//        return null;
//    }
//
//}
