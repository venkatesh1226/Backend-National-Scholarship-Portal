package com.lti.nsp.models.scholarship;

import javax.persistence.*;

@Entity
@Table(name="TenthDetails")
public class TenthDetails {
    @Id
    private String rollNo;
    private String boardName;
    private Integer passingYear,marks;



    public TenthDetails(){
        super();
    }

    public TenthDetails(String rollNo, String boardName, Integer passingYear, Integer marks) {
        this.rollNo = rollNo;
        this.boardName = boardName;
        this.passingYear = passingYear;
        this.marks = marks;
    }



//    public Scholarship getScholarship() {
//        return scholarship;
//    }

//    public void setScholarship(Scholarship scholarship) {
//        this.scholarship = scholarship;
//    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public Integer getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(Integer passingYear) {
        this.passingYear = passingYear;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "TenthDetails{" +
                "rollNo='" + rollNo + '\'' +
                ", boardName='" + boardName + '\'' +
                ", passingYear=" + passingYear +
                ", marks=" + marks +
                '}';
    }
}
