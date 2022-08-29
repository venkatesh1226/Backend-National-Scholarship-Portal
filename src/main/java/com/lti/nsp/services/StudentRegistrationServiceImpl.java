package com.lti.nsp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.lti.nsp.models.StudentRegistration;
import com.lti.nsp.repositories.StudentRepository;
import com.lti.nsp.services.StudentRegistrationService;

public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	StudentRepository student;
	
	@Override
	public boolean addStudentregistration(StudentRegistration Student) {
		// TODO Auto-generated method stub
		try {
		student.save(Student);
		return true;
		}
		catch(Exception e)
		{
			System.out.print(e);
			return false;
		}
		
	}

	@Override
	public List<StudentRegistration> getStudentregistrations() {
		 //TODO Auto-generated method stub
		List<StudentRegistration> users=new ArrayList<>();
		student.findAll().forEach(users::add);
		return users;
		//return student.getStudentregistration();
	}

}
