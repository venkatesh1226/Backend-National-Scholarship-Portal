package com.lti.nsp.repositories;

import com.lti.nsp.models.student.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentRegistration,Integer> {

}
