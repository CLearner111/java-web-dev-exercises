package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {

//    public static Student createStudent(String name, int studentId, int numberOfCredits, double gpa) {
//        Student student = new Student(name, studentId, numberOfCredits, gpa);
//        return student;
//    }


    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student student = new Student("Spock",111,1,4.0);
        student.studentInfo(student);
        System.out.println(student);

//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        createStudent("Spock",111,1,4.0);
//        studentArrayList.add(createStudent("Spock",111,1,4.0));
//        for (Student s:studentArrayList) {
//            student.studentInfo(s);
//        }

    }
}
