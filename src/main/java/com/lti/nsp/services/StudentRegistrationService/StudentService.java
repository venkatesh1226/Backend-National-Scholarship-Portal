package com.lti.nsp.services.StudentRegistrationService;

import com.lti.nsp.models.student.StudentRegistration;

import java.util.List;

public interface StudentService {
    public StudentRegistration addStudents(StudentRegistration student);
    public List<StudentRegistration> getStudents();
    public  StudentRegistration getStudent(Integer id);
    public List<StudentRegistration> getStudentByInstituteCode(String instCode);
}
