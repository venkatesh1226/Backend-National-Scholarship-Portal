package com.lti.nsp.models.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentLogin {
    @Id
    private String userId;
    private String password;

    public StudentLogin(){super();}

    public StudentLogin(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StudentLogin{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
