package com.lti.nsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.nsp.dao.StudentLoginDAO;
import com.lti.nsp.pojo.StudentLoginPojo;


@Service
public class StudentLoginServiceImpl implements StudentLoginService {

	@Autowired
	StudentLoginDAO stu;
	
	@Override
	public boolean addStudentLogin(StudentLoginPojo Student) {
		// TODO Auto-generated method stub
		try {
		stu.save(Student);
		System.out.println(Student.getUser());
		return true;
		}catch (Exception e) {
			System.out.println(e);
		return false;
		}
	}

	@Override
	public List<StudentLoginPojo> getStudentLogin() {
		// TODO Auto-generated method stub
		return stu.findAll();
		
	}

	@Override
	public StudentLoginPojo validateUser(String user,String password) {
		// TODO Auto-generated method stub
		
		return new StudentLoginPojo();
	}

}
