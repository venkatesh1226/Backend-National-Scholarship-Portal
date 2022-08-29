//package com.lti.nsp.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.lti.nsp.pojo.StudentLoginPojo;
//
//public class StudentLoginDAOImpl {
//
//	@Autowired
//	EntityManager eMan;
//	
//	@Override
//	public boolean addStudentLogin(StudentLoginPojo Student) {
//		// TODO Auto-generated method stub
//		eMan.persist(Student);
//		 return true;
//	}
//
//	@Override
//	public List<StudentLoginPojo> getStudentHome() {
//		// TODO Auto-generated method stub
//		return eMan.createQuery("From StudentLoginPojo").getResultList();
//	}
//
//	@Override
//	public StudentLoginPojo validateUser(String Email,String password) {
//		// TODO Auto-generated method stub
//		StudentLoginPojo obj=eMan.find(StudentLoginPojo.class,Email);
//		return obj;
//	}
//	
//
//}
