package com.lti.nsp.services.ScholarshipService;

import com.lti.nsp.models.scholarship.Scholarship;
import com.lti.nsp.repositories.ScholarshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScholarshipServiceImpl implements ScholarshipService {
    @Autowired
    private ScholarshipRepository repo;

    public List<Scholarship> getScholarshipsOfStudent(int studentId) {
        List<Scholarship> all=repo.findAll();
        List<Scholarship> result=new ArrayList<>();
        for(Scholarship s:all){
            if(s.getId()==studentId)
                result.add(s);
        }
        if(result.size()>0)
            return result;
        return null;
    }

    public List<Scholarship> getAllScholarships() {
        return repo.findAll();
    }

    public Scholarship addScholarship(Scholarship s) {
        return repo.save(s);
    }

    //role = 1->institute
    //role = 2->nodal officer
    //role = 3->ministry

    public Scholarship updateStatus(int scholarshipId, int role, String type) {
        Scholarship s=null;
        List<Scholarship> all=repo.findAll();
        for(Scholarship i:all){
            if(i.getId()==scholarshipId){
                s=i;
                break;
            }
        }
        if(s==null) return null;
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
        return s;
    }
}
