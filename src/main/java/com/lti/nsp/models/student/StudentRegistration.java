package com.lti.nsp.models.student;
import javax.persistence.*;
  @Entity
    @Table(name="StudentRegistration")
    public class StudentRegistration {
      public Integer getId() {
          return id;
      }

      public void setId(Integer id) {
          this.id = id;
      }

      @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Integer id;

        private String aadhar;

        private String district;

        private String name;

        private String dob;

        private String gender;

        private String mobile;

        private String email;

        private String bankAcc;

        private String bankName;

        private String state;

        private String ifsc;

        private String instCode;

        private String password;

        @Override
        public String toString() {
            return "StudentRegistrationPojo [adhar=" + aadhar + ", district=" + district + ", name=" + name + ", dob=" + dob
                    + ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + ", bankAcc=" + bankAcc
                    + ", bankName=" + bankName + ", state=" + state + ", ifsc=" + ifsc + ", instCode=" + instCode
                    + ", password=" + password + "]";
        }

        public StudentRegistration() {
            super();
            // TODO Auto-generated constructor stub
        }





        public StudentRegistration(String aadhar, String district, String name, String dob, String gender, String mobile,
                                   String email, String bankAcc, String bankName, String state, String ifsc, String instCode,
                                   String password) {
            super();
            this.aadhar = aadhar;
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

        public String getAadhar() {
            return aadhar;
        }

        public void setAadhar(String aadhar) {
            this.aadhar = aadhar;
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
