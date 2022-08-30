package com.lti.nsp.models.scholarship;

import javax.persistence.*;

@Entity
@Table(name = "ScholarshipStatus")
public class ScholarshipStatus {


    private String isApprovedByInstitute,isApprovedByNodal,isApprovedByMinistry;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    public ScholarshipStatus(){super();}

    public ScholarshipStatus(String isApprovedByInstitute, String isApprovedByNodal, String isApprovedByMinistry) {
        this.isApprovedByInstitute = isApprovedByInstitute;
        this.isApprovedByNodal = isApprovedByNodal;
        this.isApprovedByMinistry = isApprovedByMinistry;
    }



//    public Scholarship getScholarship() {
//        return scholarship;
//    }

//    public void setScholarship(Scholarship scholarship) {
//        this.scholarship = scholarship;
//    }

    public String isApprovedByInstitute() {
        return isApprovedByInstitute;
    }

    public void setApprovedByInstitute(String approvedByInstitute) {
        isApprovedByInstitute = approvedByInstitute;
    }

    public String isApprovedByNodal() {
        return isApprovedByNodal;
    }

    public void setApprovedByNodal(String approvedByNodal) {
        isApprovedByNodal = approvedByNodal;
    }

    public String isApprovedByMinistry() {
        return isApprovedByMinistry;
    }

    public void setApprovedByMinistry(String approvedByMinistry) {
        isApprovedByMinistry = approvedByMinistry;
    }

    @Override
    public String toString() {
        return "ScholarshipStatus{" +
//                "scholarshipId=" + scholarship +
                ", isApprovedByInstitute=" + isApprovedByInstitute +
                ", isApprovedByNodal=" + isApprovedByNodal +
                ", isApprovedByMinistry=" + isApprovedByMinistry +
                '}';
    }
}
