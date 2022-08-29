package com.lti.nsp.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.nsp.pojo.StudentLoginPojo;

public interface StudentLoginDAO extends JpaRepository<StudentLoginPojo,String>{
//	public boolean addStudentLogin(StudentLoginPojo Student);
//	public List<StudentLoginPojo>getStudentHome();
//	public StudentLoginPojo validateUser(String Email,String password);

}
