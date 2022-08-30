package com.lti.nsp.models.scholarship;

import javax.persistence.*;

@Entity
@Table(name = "ScholarshipStatus")
public class ScholarshipStatus {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String approvedByInstitute, approvedByNodal, approvedByMinistry;
    public ScholarshipStatus(){
        super();
        approvedByInstitute ="No";
        approvedByNodal ="NO";
        approvedByMinistry ="NO";
    }

    public ScholarshipStatus(String approvedByInstitute, String approvedByNodal, String approvedByMinistry) {
        this.approvedByInstitute = approvedByInstitute;
        this.approvedByNodal = approvedByNodal;
        this.approvedByMinistry = approvedByMinistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApprovedByInstitute() {
        return approvedByInstitute;
    }

    public void setApprovedByInstitute(String approvedByInstitute) {
        this.approvedByInstitute = approvedByInstitute;
    }

    public String getApprovedByNodal() {
        return approvedByNodal;
    }

    public void setApprovedByNodal(String approvedByNodal) {
        this.approvedByNodal = approvedByNodal;
    }

    public String getApprovedByMinistry() {
        return approvedByMinistry;
    }

    public void setApprovedByMinistry(String approvedByMinistry) {
        this.approvedByMinistry = approvedByMinistry;
    }

    @Override
    public String toString() {
        return "ScholarshipStatus{" +
                "id=" + id +
                ", approvedByInstitute='" + approvedByInstitute + '\'' +
                ", approvedByNodal='" + approvedByNodal + '\'' +
                ", approvedByMinistry='" + approvedByMinistry + '\'' +
                '}';
    }
}
