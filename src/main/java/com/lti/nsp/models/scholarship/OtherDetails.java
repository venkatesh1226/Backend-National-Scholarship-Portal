package com.lti.nsp.models.scholarship;

import javax.persistence.*;

@Entity
@Table(name = "OtherDetails")
public class OtherDetails {

    private Boolean isDisabled;
    private String disabilityName;
    private Integer disabilityPercentage;
    private String maritalStatus,parentsProfession;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    @OneToOne(mappedBy = "otherDetails")
//    private Scholarship scholarship;
    public OtherDetails(Boolean isDisabled, String disabilityName, Integer disabilityPercentage, String maritalStatus, String parentsProfession) {
        this.isDisabled = isDisabled;
        this.disabilityName = disabilityName;
        this.disabilityPercentage = disabilityPercentage;
        this.maritalStatus = maritalStatus;
        this.parentsProfession = parentsProfession;
    }

    public OtherDetails(){super();}


//    public Scholarship getScholarship() {
//        return scholarship;
//    }
//
//    public void setScholarship(Scholarship scholarship) {
//        this.scholarship = scholarship;
//    }

    public Boolean getDisabled() {
        return isDisabled;
    }

    public void setDisabled(Boolean disabled) {
        isDisabled = disabled;
    }

    public String getDisabilityName() {
        return disabilityName;
    }

    public void setDisabilityName(String disabilityName) {
        this.disabilityName = disabilityName;
    }

    public Integer getDisabilityPercentage() {
        return disabilityPercentage;
    }

    public void setDisabilityPercentage(Integer disabilityPercentage) {
        this.disabilityPercentage = disabilityPercentage;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getParentsProfession() {
        return parentsProfession;
    }

    public void setParentsProfession(String parentsProfession) {
        this.parentsProfession = parentsProfession;
    }

    @Override
    public String toString() {
        return "OtherDetails{" +
                "isDisabled=" + isDisabled +
                ", disabilityName='" + disabilityName + '\'' +
                ", disabilityPercentage=" + disabilityPercentage +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", parentsProfession='" + parentsProfession + '\'' +
                '}';
    }
}
