package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.sql.SQLOutput;


public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId= studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }
    public Student(String name){
        this(name, nextStudentId);
        nextStudentId++;
    }
    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }
    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }
    public void setCreditsAndGpa(int credits, double aGpa){
        numberOfCredits = credits;
        gpa = aGpa;
    }
    public void returnAllData(){
        System.out.println(name);
        System.out.println(studentId);
        System.out.println(numberOfCredits);
        System.out.println(gpa);
    }
}
