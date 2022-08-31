package com.lti.nsp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InstitutionRegistration")
public class InstitutionEntity {
	   

	private String institutionCategory;

	private String name;

	private String instState;

	private String instDistrict;
	
	
	@Id
	private String institutionCode;
	
	

	private String email;

	private String diseCode;

	private String location;

	private String institutionType;

	private String affiliatedUnivState;

	private String affiliatedUnivBoard;

	private String startAdmitYear;

	private String setPassword;
	private String confirmPassword;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String state;

	private String district;

	private String pincode;

	private String principleName;

	private String mobileNumber;

	private String telephone;
 	
 	InstitutionEntity()
 	{
 		
 	}

	public InstitutionEntity(String institutionCode, String institutionCategory, String name, String instState,
							 String instDistrict, String email, String dISEcode, String location, String institutionType,
							 String affiliatedUnivState, String affiliatedUnivBoard, String startAdmitYear,
							 String setPassword, String confirmPassword, String addressLine1, String addressLine2, String city,
							 String state, String district, String pincode, String principleName, String mobileNumber,
							 String telephone) {
		super();
		this.institutionCode = institutionCode;
		this.institutionCategory = institutionCategory;
		this.name = name;
		this.instState = instState;
		this.instDistrict = instDistrict;
		this.email = email;
		this.diseCode = dISEcode;
		this.location = location;
		this.institutionType = institutionType;
		this.affiliatedUnivState = affiliatedUnivState;
		this.affiliatedUnivBoard = affiliatedUnivBoard;
		this.startAdmitYear = startAdmitYear;
		this.setPassword = setPassword;
		this.confirmPassword = confirmPassword;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.principleName = principleName;
		this.mobileNumber = mobileNumber;
		this.telephone = telephone;
	}

	public String getInstitutionCode() {
		return institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getInstitutionCategory() {
		return institutionCategory;
	}

	public void setInstitutionCategory(String institutionCategory) {
		this.institutionCategory = institutionCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstState() {
		return instState;
	}

	public void setInstState(String instState) {
		this.instState = instState;
	}

	public String getInstDistrict() {
		return instDistrict;
	}

	public void setInstDistrict(String instDistrict) {
		this.instDistrict = instDistrict;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiseCode() {
		return diseCode;
	}

	public void setDiseCode(String dISEcode) {
		diseCode = dISEcode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInstitutionType() {
		return institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public String getAffiliatedUnivState() {
		return affiliatedUnivState;
	}

	public void setAffiliatedUnivState(String affiliatedUnivState) {
		this.affiliatedUnivState = affiliatedUnivState;
	}

	public String getAffiliatedUnivBoard() {
		return affiliatedUnivBoard;
	}

	public void setAffiliatedUnivBoard(String affiliatedUnivBoard) {
		this.affiliatedUnivBoard = affiliatedUnivBoard;
	}

	public String getStartAdmitYear() {
		return startAdmitYear;
	}

	public void setStartAdmitYear(String startAdmitYear) {
		this.startAdmitYear = startAdmitYear;
	}

	public String getSetPassword() {
		return setPassword;
	}

	public void setSetPassword(String setPassword) {
		this.setPassword = setPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPrincipleName() {
		return principleName;
	}

	public void setPrincipleName(String principleName) {
		this.principleName = principleName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "InstitutionEntity [InstitutionCode=" + institutionCode + ", institutionCategory=" + institutionCategory
				+ ", name=" + name + ", inststate=" + instState + ", instdistrict=" + instDistrict + ", email=" + email
				+ ", DISEcode=" + diseCode + ", Location=" + location + ", InstitutionType=" + institutionType
				+ ", affilatedUniversityState=" + affiliatedUnivState + ", AffilatedUniversityBoardName="
				+ affiliatedUnivBoard + ", YearFromWhichAdmissionStarted=" + startAdmitYear
				+ ", SetPassword=" + setPassword + ", ConfirmPassword=" + confirmPassword + ", AddressLine1="
				+ addressLine1 + ", AddressLine2=" + addressLine2 + ", City=" + city + ", state=" + state
				+ ", district=" + district + ", pincode=" + pincode + ", PrincipleName=" + principleName
				+ ", mobileNumber=" + mobileNumber + ", Telephone=" + telephone + "]";
	}
 	  
     
}