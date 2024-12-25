package com.springrest.Springrest.entities;

public class Course {
    private int CourseID;
    private String CourseName;
    private String CourseInfo;
    private int CourseFees;

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int courseID) {
        CourseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseInfo() {
        return CourseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        CourseInfo = courseInfo;
    }

    public int getCourseFees() {
        return CourseFees;
    }

    public void setCourseFees(int courseFees) {
        CourseFees = courseFees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseID=" + CourseID +
                ", CourseName='" + CourseName + '\'' +
                ", CourseInfo='" + CourseInfo + '\'' +
                ", CourseFees='" + CourseFees + '\'' +
                '}';
    }

    public Course(int courseID, String courseName, String courseInfo, int courseFees) {
        CourseID = courseID;
        CourseName = courseName;
        CourseInfo = courseInfo;
        CourseFees = courseFees;
    }
    public Course(){
        super();
    }
}
