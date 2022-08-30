package com.lti.nsp.repositories;

import com.lti.nsp.models.login.StudentLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentLoginRepository extends JpaRepository<StudentLogin,String> {

	StudentLogin findByUserId(String userId);
}
