package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InstitutionRegistration")
public class InstitutionEntity {
	   
	@Column(name="institutioncategory")
	private String institutionCategory;
	@Column(name="name")
	private String name;
	@Column(name="inststate")
	private String inststate;
	@Column(name="instdistrict")
	private String instdistrict;
	
	
	@Id
	@Column(name="institutioncode")
	private String InstitutionCode;
	
	
	@Column(name="email")
	private String email;
	@Column(name="disecode")
	private String DISEcode;
	@Column(name="location")
	private String Location;
	@Column(name="institutiontype")
	private String InstitutionType;
	@Column(name="affilateduniversitystate")
	private String affilatedUniversityState;
	@Column(name="affilateduniversityboardname")
	private String AffilatedUniversityBoardName;
	@Column(name="yearfromwhichadmissionstarted")
	private String YearFromWhichAdmissionStarted;
	@Column(name="setpassword")
	private String SetPassword;
	@Column(name="confirmpassword")
	private String ConfirmPassword;
	@Column(name="addresssline1")
	private String AddressLine1;
	@Column(name="addressline2")
	private String AddressLine2;
	@Column(name="city")
	private String City;
	@Column(name="state")
	private String state;
	@Column(name="district")
	private String district;
	@Column(name="pincode")
	private String pincode;
	@Column(name="principlename")
	private String PrincipleName;
	@Column(name="mobileNumber")
	private String mobileNumber;
	@Column(name="telephone")
	private String Telephone;
 	
 	InstitutionEntity()
 	{
 		
 	}

	public InstitutionEntity(String institutionCode, String institutionCategory, String name, String inststate,
			String instdistrict, String email, String dISEcode, String location, String institutionType,
			String affilatedUniversityState, String affilatedUniversityBoardName, String yearFromWhichAdmissionStarted,
			String setPassword, String confirmPassword, String addressLine1, String addressLine2, String city,
			String state, String district, String pincode, String principleName, String mobileNumber,
			String telephone) {
		super();
		this.InstitutionCode = institutionCode;
		this.institutionCategory = institutionCategory;
		this.name = name;
		this.inststate = inststate;
		this.instdistrict = instdistrict;
		this.email = email;
		this.DISEcode = dISEcode;
		this.Location = location;
		this.InstitutionType = institutionType;
		this.affilatedUniversityState = affilatedUniversityState;
		this.AffilatedUniversityBoardName = affilatedUniversityBoardName;
		this.YearFromWhichAdmissionStarted = yearFromWhichAdmissionStarted;
		this.SetPassword = setPassword;
		this.ConfirmPassword = confirmPassword;
		this.AddressLine1 = addressLine1;
		this.AddressLine2 = addressLine2;
		this.City = city;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.PrincipleName = principleName;
		this.mobileNumber = mobileNumber;
		this.Telephone = telephone;
	}

	public String getInstitutionCode() {
		return InstitutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		InstitutionCode = institutionCode;
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

	public String getInststate() {
		return inststate;
	}

	public void setInststate(String inststate) {
		this.inststate = inststate;
	}

	public String getInstdistrict() {
		return instdistrict;
	}

	public void setInstdistrict(String instdistrict) {
		this.instdistrict = instdistrict;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDISEcode() {
		return DISEcode;
	}

	public void setDISEcode(String dISEcode) {
		DISEcode = dISEcode;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getInstitutionType() {
		return InstitutionType;
	}

	public void setInstitutionType(String institutionType) {
		InstitutionType = institutionType;
	}

	public String getAffilatedUniversityState() {
		return affilatedUniversityState;
	}

	public void setAffilatedUniversityState(String affilatedUniversityState) {
		this.affilatedUniversityState = affilatedUniversityState;
	}

	public String getAffilatedUniversityBoardName() {
		return AffilatedUniversityBoardName;
	}

	public void setAffilatedUniversityBoardName(String affilatedUniversityBoardName) {
		AffilatedUniversityBoardName = affilatedUniversityBoardName;
	}

	public String getYearFromWhichAdmissionStarted() {
		return YearFromWhichAdmissionStarted;
	}

	public void setYearFromWhichAdmissionStarted(String yearFromWhichAdmissionStarted) {
		YearFromWhichAdmissionStarted = yearFromWhichAdmissionStarted;
	}

	public String getSetPassword() {
		return SetPassword;
	}

	public void setSetPassword(String setPassword) {
		SetPassword = setPassword;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
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
		return PrincipleName;
	}

	public void setPrincipleName(String principleName) {
		PrincipleName = principleName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	@Override
	public String toString() {
		return "InstitutionEntity [InstitutionCode=" + InstitutionCode + ", institutionCategory=" + institutionCategory
				+ ", name=" + name + ", inststate=" + inststate + ", instdistrict=" + instdistrict + ", email=" + email
				+ ", DISEcode=" + DISEcode + ", Location=" + Location + ", InstitutionType=" + InstitutionType
				+ ", affilatedUniversityState=" + affilatedUniversityState + ", AffilatedUniversityBoardName="
				+ AffilatedUniversityBoardName + ", YearFromWhichAdmissionStarted=" + YearFromWhichAdmissionStarted
				+ ", SetPassword=" + SetPassword + ", ConfirmPassword=" + ConfirmPassword + ", AddressLine1="
				+ AddressLine1 + ", AddressLine2=" + AddressLine2 + ", City=" + City + ", state=" + state
				+ ", district=" + district + ", pincode=" + pincode + ", PrincipleName=" + PrincipleName
				+ ", mobileNumber=" + mobileNumber + ", Telephone=" + Telephone + "]";
	}
 	  
     
}