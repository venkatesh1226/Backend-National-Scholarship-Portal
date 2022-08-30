package com.lti.nsp.models.scholarship;

import javax.persistence.*;

@Entity
@Table(name="ContactDetails")
public class ContactDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String state,district,block,houseNo,streetNo;
    private Integer pinCode;
//    @OneToOne(mappedBy = "contactDetails")
//    private Scholarship scholarship;

    public ContactDetails(){
        super();
    }

    public ContactDetails(String state, String district, String block, String houseNo, String streetNo, Integer pinCode) {
        this.state = state;
        this.district = district;
        this.block = block;
        this.houseNo = houseNo;
        this.streetNo = streetNo;
        this.pinCode = pinCode;

    }


//    public Scholarship getScholarship() {
//        return scholarship;
//    }

//    public void setScholarship(Scholarship scholarship) {
//        this.scholarship = scholarship;
//    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", block='" + block + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
