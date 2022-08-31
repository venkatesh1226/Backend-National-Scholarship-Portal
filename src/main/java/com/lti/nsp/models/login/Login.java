package com.lti.nsp.models.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loginId;
    private String userId;
    private String password;

    private String role;

    public int getLoginId() {
        return loginId;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + loginId +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public Login(String userId, String password, String role) {
        this.userId = userId;
        this.password = password;
        this.role = role;
    }
    public Login(int loginId, String userId, String password, String role) {
        this.loginId = loginId;
        this.userId = userId;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Login(){super();}

    public Login(String userId, String password) {
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

}
