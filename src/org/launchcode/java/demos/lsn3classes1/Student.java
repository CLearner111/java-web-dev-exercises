package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String aname, int astudentId, int anumberOfCredits, double agpa) {
        this.name = aname;
        this.studentId = astudentId;
        this.numberOfCredits = anumberOfCredits;
        this.gpa = agpa;
    }

    public Student(String aname, int astudentId) {
        this.name = aname;
        this.studentId = astudentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void studentInfo(Student s) {
        System.out.println("Name: " + s.name + " | Id: " + s.studentId + " | Credits: " + s.numberOfCredits + " | GPA: " + s.gpa);
    }

    public String toString() {
        return "Name: " + name + " (Id: " + studentId + ", Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}