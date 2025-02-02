package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId=studentId;
        this.numberOfCredits=numberOfCredits;
        this.gpa = gpa;
    }

    //what is the most restrictive access modifier that will function?

    String getName() {
        return name;
    }

    int getStudentId() {
        return studentId;
    }

    int getNumberOfCredits() {
        return numberOfCredits;
    }

    double getGpa() {
        return gpa;
    }

    void setName(String name) {
        this.name = name;
    }

    void setStudentId(int studentId) {
        this.studentId=studentId;
    }

    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
