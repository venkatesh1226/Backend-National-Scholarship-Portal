package com.lti.nsp.services;
import java.util.List;

import com.lti.nsp.pojo.*;

public interface StudentLoginService  {
	public boolean addStudentLogin(StudentLoginPojo Student);
	public List<StudentLoginPojo>getStudentLogin();
	public StudentLoginPojo validateUser(String user,String password);

}
