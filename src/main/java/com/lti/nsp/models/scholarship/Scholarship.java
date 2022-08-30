package com.lti.nsp.models.scholarship;


import javax.persistence.*;

@Entity
@Table(name="Scholarship")
public class Scholarship{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int studentId;

    private String schemeName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="basicDetails",referencedColumnName = "aadharNumber")
    private BasicDetails basicDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="academicDetails",referencedColumnName = "id")
    private AcademicDetails academicDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="tenthDetails",referencedColumnName = "rollNo")
    private TenthDetails tenthDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="twelfthDetails",referencedColumnName = "rollNo")
    private TwelfthDetails twelfthDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="feeDetails",referencedColumnName = "id")
    private FeeDetails feeDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="otherDetails",referencedColumnName = "id")
    private OtherDetails otherDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="contactDetails",referencedColumnName = "id")
    private ContactDetails contactDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="scholarshipStatus",referencedColumnName = "id")
    private ScholarshipStatus scholarshipStatus;

    public  Scholarship(){super();}
    public Scholarship(int id, int studentId, String schemeName, BasicDetails basicDetails, AcademicDetails academicDetails, TenthDetails tenthDetails, TwelfthDetails twelfthDetails, FeeDetails feeDetails, OtherDetails otherDetails, ContactDetails contactDetails, ScholarshipStatus scholarshipStatus) {
        this.id = id;
        this.studentId = studentId;
        this.schemeName = schemeName;
        this.basicDetails = basicDetails;
        this.academicDetails = academicDetails;
        this.tenthDetails = tenthDetails;
        this.twelfthDetails = twelfthDetails;
        this.feeDetails = feeDetails;
        this.otherDetails = otherDetails;
        this.contactDetails = contactDetails;
        this.scholarshipStatus = scholarshipStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public BasicDetails getBasicDetails() {
        return basicDetails;
    }

    public void setBasicDetails(BasicDetails basicDetails) {
        this.basicDetails = basicDetails;
    }

    public AcademicDetails getAcademicDetails() {
        return academicDetails;
    }

    public void setAcademicDetails(AcademicDetails academicDetails) {
        this.academicDetails = academicDetails;
    }

    public TenthDetails getTenthDetails() {
        return tenthDetails;
    }

    public void setTenthDetails(TenthDetails tenthDetails) {
        this.tenthDetails = tenthDetails;
    }

    public TwelfthDetails getTwelfthDetails() {
        return twelfthDetails;
    }

    public void setTwelfthDetails(TwelfthDetails twelfthDetails) {
        this.twelfthDetails = twelfthDetails;
    }

    public FeeDetails getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
    }

    public OtherDetails getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(OtherDetails otherDetails) {
        this.otherDetails = otherDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public ScholarshipStatus getScholarshipStatus() {
        return scholarshipStatus;
    }

    public void setScholarshipStatus(ScholarshipStatus scholarshipStatus) {
        this.scholarshipStatus = scholarshipStatus;
    }

    @Override
    public String toString() {
        return "Scholarship{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", schemeName='" + schemeName + '\'' +
                ", basicDetails=" + basicDetails +
                ", academicDetails=" + academicDetails +
                ", tenthDetails=" + tenthDetails +
                ", twelfthDetails=" + twelfthDetails +
                ", feeDetails=" + feeDetails +
                ", otherDetails=" + otherDetails +
                ", contactDetails=" + contactDetails +
                ", status=" + scholarshipStatus +
                '}';
    }
}