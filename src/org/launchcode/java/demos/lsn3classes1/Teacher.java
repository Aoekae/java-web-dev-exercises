package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.subject=subject;
        this.yearsTeaching=yearsTeaching;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getSubject() {
        return subject;
    }

    int getYearsTeaching() {
        return yearsTeaching;
    }

    void setFirstName(String aFirstName) {
        firstName=aFirstName;
    }

    void setLastName(String aLastName) {
        lastName = aLastName;
    }

    void setSubject(String aSubject) {
        subject=aSubject;
    }

    void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching=aYearsTeaching;
    }
}
