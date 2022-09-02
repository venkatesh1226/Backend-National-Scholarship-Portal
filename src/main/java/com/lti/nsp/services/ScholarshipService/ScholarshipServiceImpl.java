package com.lti.nsp.services.ScholarshipService;

import com.lti.nsp.models.scholarship.Scholarship;
import com.lti.nsp.models.student.StudentRegistration;
import com.lti.nsp.repositories.ScholarshipRepository;
import com.lti.nsp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@Service
@CrossOrigin(origins ="*")
public class ScholarshipServiceImpl implements ScholarshipService {
    @Autowired
    private ScholarshipRepository repo;

    @Autowired
    private StudentRepository srepo;
    public List<Scholarship> getScholarshipsOfStudent(int studentId) {
        List<Scholarship> all=repo.findAll();
        List<Scholarship> result=new ArrayList<>();
        for(Scholarship s:all){
            if(s.getStudentId()==studentId)
                result.add(s);
        }
        if(result.size()>0)
            return result;
        return null;
    }

    public List<Scholarship> getAllScholarships(String role) {
        List<Scholarship> s=repo.findAll();
        List<Scholarship> res=new ArrayList<>();
        for(Scholarship i:s){
            if(role.equalsIgnoreCase("NODAL")) {
                if (!i.getScholarshipStatus().getApprovedByNodal().equals("APPROVED"))
                    if(i.getScholarshipStatus().getApprovedByInstitute().equalsIgnoreCase("APPROVED"))
                         res.add(i);
            }
            else if(role.equalsIgnoreCase("INSTITUTE")){
                if (!i.getScholarshipStatus().getApprovedByInstitute().equals("APPROVED"))

                    res.add(i);
            }
            else if(role.equalsIgnoreCase("MINISTRY")){
                if (!i.getScholarshipStatus().getApprovedByMinistry().equals("APPROVED"))
                    if(i.getScholarshipStatus().getApprovedByNodal().equalsIgnoreCase("APPROVED"))
                        res.add(i);
            }
        }
        return res;
    }

    public Scholarship addScholarship(Scholarship s) {
        return repo.save(s);
    }

    //role = 1->institute
    //role = 2->nodal officer
    //role = 3->ministry

    public Scholarship updateStatus(int scholarshipId, int role, String type) {
        Scholarship s=null;
        System.out.println(scholarshipId+" "+type);
        List<Scholarship> all=repo.findAll();
        for(Scholarship i:all){
            if(i.getId()==scholarshipId){
                s=i;
                break;
            }
        }
        if(s==null) return null;

        System.out.println("*********"+s.toString());
        if(role==1){
            s.getScholarshipStatus().setApprovedByInstitute(type);
        }
        else if(role==2){
            s.getScholarshipStatus().setApprovedByNodal(type);
        }
        else if(role==3){
            s.getScholarshipStatus().setApprovedByMinistry(type);
        }
        else{
            return null;
        }
        repo.saveAll(all);
        return s;
    }

    @Override
    public List<Scholarship> getInstScholarships(String id) {
        System.out.println(id+"*******");
       List<Scholarship> s=repo.findAll();
       List<Scholarship> res=new ArrayList<>();
       for(Scholarship i:s){
           List<StudentRegistration> reg=srepo.findAll();
           for(StudentRegistration r:reg){
               if(i.getStudentId()==r.getId()&&r.getInstCode().equals(id)&&!i.getScholarshipStatus().getApprovedByInstitute().equals("APPROVED")){
                   res.add(i);
               }
           }
       }
       return res;
    }
}
