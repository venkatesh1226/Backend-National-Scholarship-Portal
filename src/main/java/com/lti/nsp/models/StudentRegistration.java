package com.lti.nsp.models;
import javax.persistence.*;

@Entity
@Table(name="studentregistration")
public class StudentRegistration {
	@Id
	@Column(name="std_id")
	private int std_id;
	@Column(name="adhar")
	private String adhar;
	@Column(name="district")
	private String district;
	@Column(name="name")
	private String name;
	@Column(name="dob")
	private String dob;
	@Column(name="gender")
	private String gender;
	@Column(name="mobile")
	private String mobile;
	@Column(name="email")
	private String email;
	@Column(name="bankAcc")
	private String bankAcc;
	@Column(name="bankName")
	private String bankName;
	@Column(name="state")
	private String state;
	@Column(name="ifsc")
	private String ifsc;
	@Column(name="instCode")
	private String instCode;
	@Column(name="password")
	private String password;
	
	@Override
	public String toString() {
		return "StudentRegistrationPojo [adhar=" + adhar + ", district=" + district + ", name=" + name + ", dob=" + dob
				+ ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + ", bankAcc=" + bankAcc
				+ ", bankName=" + bankName + ", state=" + state + ", ifsc=" + ifsc + ", instCode=" + instCode
				+ ", password=" + password + "]";
	}
	
	public StudentRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public StudentRegistration(String adhar, String district, String name, String dob, String gender, String mobile,
			String email, String bankAcc, String bankName, String state, String ifsc, String instCode,
			String password) {
		super();
		this.adhar = adhar;
		this.district = district;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.bankAcc = bankAcc;
		this.bankName = bankName;
		this.state = state;
		this.ifsc = ifsc;
		this.instCode = instCode;
		this.password = password;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankAcc() {
		return bankAcc;
	}

	public void setBankAcc(String bankAcc) {
		this.bankAcc = bankAcc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getInstCode() {
		return instCode;
	}

	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
