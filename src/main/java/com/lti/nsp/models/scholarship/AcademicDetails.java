package com.lti.nsp.models.scholarship;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AcademicDetails")
public class AcademicDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String instituteName, currentCourse;
    private Integer presentYear;
    private String modeOfStudy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startData;
    private String boardName,prevCourse;
    private Integer prevPassingYear,prevClassMarks;

//    @OneToOne(mappedBy = "academicDetails")
//    private Scholarship scholarship;

    public AcademicDetails(){
        super();
    }

    public AcademicDetails(String instituteName, String currentCourse, Integer presentYear, String modeOfStudy, Date startData, String boardName, String prevCourse, Integer prevPassingYear, Integer prevClassMarks) {
        this.instituteName = instituteName;
        this.currentCourse = currentCourse;
        this.presentYear = presentYear;
        this.modeOfStudy = modeOfStudy;
        this.startData = startData;
        this.boardName = boardName;
        this.prevCourse = prevCourse;
        this.prevPassingYear = prevPassingYear;
        this.prevClassMarks = prevClassMarks;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    public Integer getPresentYear() {
        return presentYear;
    }

    public void setPresentYear(Integer presentYear) {
        this.presentYear = presentYear;
    }

    public String getModeOfStudy() {
        return modeOfStudy;
    }

    public void setModeOfStudy(String modeOfStudy) {
        this.modeOfStudy = modeOfStudy;
    }

    public Date getStartData() {
        return startData;
    }

    public void setStartData(Date startData) {
        this.startData = startData;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getPrevCourse() {
        return prevCourse;
    }

    public void setPrevCourse(String prevCourse) {
        this.prevCourse = prevCourse;
    }

    public Integer getPrevPassingYear() {
        return prevPassingYear;
    }

    public void setPrevPassingYear(Integer prevPassingYear) {
        this.prevPassingYear = prevPassingYear;
    }

    public Integer getPrevClassMarks() {
        return prevClassMarks;
    }

    public void setPrevClassMarks(Integer prevClassMarks) {
        this.prevClassMarks = prevClassMarks;
    }

//    public Scholarship getScholarship() {
//        return scholarship;
//    }

//    public void setScholarship(Scholarship scholarship) {
//        this.scholarship = scholarship;
//    }

    @Override
    public String toString() {
        return "AcademicDetails{" +
                "instituteName='" + instituteName + '\'' +
                ", currentCourse='" + currentCourse + '\'' +
                ", presentYear=" + presentYear +
                ", modeOfStudy='" + modeOfStudy + '\'' +
                ", startData=" + startData +
                ", boardName='" + boardName + '\'' +
                ", prevCourse='" + prevCourse + '\'' +
                ", prevPassingYear=" + prevPassingYear +
                ", prevClassMarks=" + prevClassMarks +
                '}';
    }
}
