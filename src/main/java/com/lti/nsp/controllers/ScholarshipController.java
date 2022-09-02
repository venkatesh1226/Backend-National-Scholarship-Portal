package com.lti.nsp.controllers;

import com.lti.nsp.models.scholarship.Scholarship;
import com.lti.nsp.services.ScholarshipService.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
public class ScholarshipController {
    @Autowired
    ScholarshipService serve;

    @GetMapping(value ={"/scholarships/{sid}"})
    public List<Scholarship> studentsScholarships(@PathVariable int sid){
        return serve.getScholarshipsOfStudent(sid);
    }

    @GetMapping(value = {"/scholarships/approval/{role}"})
    public List<Scholarship> allScholarships(
            @PathVariable String role
    ){
        return serve.getAllScholarships(role);
    }

    @GetMapping(value = {"/inst-scholarships/{id}"})
    public List<Scholarship> getInst(@PathVariable String id){
        return serve.getInstScholarships(id);
    }

    @PostMapping("/apply")
    public Scholarship applyScholarship(@RequestBody Scholarship s){
        return serve.addScholarship(s);
    }

    @PutMapping("scholarships/status/{id}/{role}")
    public Scholarship changeStatus(@PathVariable Integer id,@RequestBody String status,@PathVariable Integer role){

        return serve.updateStatus(id,role,status);
    }


}
