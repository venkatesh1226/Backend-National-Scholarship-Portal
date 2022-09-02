package com.lti.nsp.services.ScholarshipService;

import com.lti.nsp.models.scholarship.Scholarship;

import java.util.List;

public interface ScholarshipService {
    //get all scholarships applied by student
    public List<Scholarship> getScholarshipsOfStudent(int studentId);
    //get all scholarships
    public List<Scholarship> getAllScholarships(String role);
    //add scholarship
    public Scholarship addScholarship( Scholarship s);
    //change status of scholarship
    //role = 1->institute
    //role = 2->nodal officer
    //role = 3->ministry
    public Scholarship updateStatus(int scholarshipId, int role, String type);
    // TODO:get all students details applied from given institute
    public List<Scholarship> getInstScholarships(String id);

}
