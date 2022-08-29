package com.lti.nsp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.nsp.models.StudentRegistration;
@Repository
public interface StudentRepository extends JpaRepository<StudentRegistration,Integer>{


	

}
