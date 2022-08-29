package com.lti.nsp.services;
import java.util.List;

import com.lti.nsp.models.StudentRegistration;

public interface StudentRegistrationService {

	public boolean addStudentregistration(StudentRegistration Student);
	
	public List<StudentRegistration> getStudentregistrations();
	
}
