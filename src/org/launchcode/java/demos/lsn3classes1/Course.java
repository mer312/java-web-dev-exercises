package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private String teacher;
    private ArrayList<String> studentNames = new ArrayList<>();

    public void setCourseData(String cName, String tName ,String[] names){
        courseName = cName;
        teacher = tName;
        for( String name : names){
            studentNames.add(name);
        }
    }

    public void getCourseData(){
        System.out.println(courseName);
        System.out.println(teacher);
        System.out.println(studentNames);
    }

}
