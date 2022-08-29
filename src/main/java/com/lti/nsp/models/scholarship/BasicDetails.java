package com.lti.nsp.models.scholarship;

import javax.persistence.*;

@Entity
@Table(name="BasicDetails")
public class BasicDetails {
    @Id
    private String aadharNumber;
    private String religion;
    private String communityCategory;
    private String fatherName, motherName;
    private Integer income;

//    @OneToOne(mappedBy = "basicDetails")
//    private Scholarship scholarship;

//    public Scholarship getScholarship() {
//        return scholarship;
//    }

//    public void setScholarship(Scholarship scholarship) {
//        this.scholarship = scholarship;
//    }

    public BasicDetails(){super();}


    public BasicDetails(String aadharNumber, String religion, String communityCategory, String fatherName, String motherName, Integer income) {
        this.aadharNumber = aadharNumber;
        this.religion = religion;
        this.communityCategory = communityCategory;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.income = income;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCommunityCategory() {
        return communityCategory;
    }

    public void setCommunityCategory(String communityCategory) {
        this.communityCategory = communityCategory;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "BasicDetails{" +
                "aadharNumber='" + aadharNumber + '\'' +
                ", religion='" + religion + '\'' +
                ", communityCategory='" + communityCategory + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", income=" + income +
                '}';
    }
}
