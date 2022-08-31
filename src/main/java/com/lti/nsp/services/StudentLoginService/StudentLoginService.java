package com.lti.nsp.services.StudentLoginService;

import com.lti.nsp.models.login.Login;
import com.lti.nsp.models.student.StudentRegistration;

public interface StudentLoginService {
    public Boolean validate(String id,String pass);
    public StudentRegistration add(String id,String pass);

    public boolean logout();
    public Login login();

    public StudentRegistration getStudent(Login s);
}
