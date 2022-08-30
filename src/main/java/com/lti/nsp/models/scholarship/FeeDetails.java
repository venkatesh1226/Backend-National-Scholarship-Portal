package com.lti.nsp.models.scholarship;

import javax.persistence.*;

@Entity
@Table(name="FeeDetails")
public class FeeDetails {
    private Integer admissionFee,tuitionFee,otherFee;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
//    @OneToOne(mappedBy = "feeDetails")
//    private Scholarship scholarship;

    public FeeDetails(){super();}

    public FeeDetails(Integer admissionFee, Integer tuitionFee, Integer otherFee) {
        this.admissionFee = admissionFee;
        this.tuitionFee = tuitionFee;
        this.otherFee = otherFee;
    }



//    public Scholarship getScholarship() {
//        return scholarship;
//    }

//    public void setScholarship(Scholarship scholarship) {
//        this.scholarship = scholarship;
//    }

    public Integer getAdmissionFee() {
        return admissionFee;
    }

    public void setAdmissionFee(Integer admissionFee) {
        this.admissionFee = admissionFee;
    }

    public Integer getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(Integer tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public Integer getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Integer otherFee) {
        this.otherFee = otherFee;
    }

    @Override
    public String toString() {
        return "FeeDetails{" +
                "admissionFee=" + admissionFee +
                ", tuitionFee=" + tuitionFee +
                ", otherFee=" + otherFee +
                '}';
    }
}
