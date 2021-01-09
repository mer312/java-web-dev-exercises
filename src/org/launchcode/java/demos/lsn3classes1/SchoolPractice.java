package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {


    public static void main(String[] args) {

    }

    public void schoolPractice(){
        // Instantiate your Student class for part 2 here!

            Student matt = new Student("Matt",1, 1, 4.0);
            matt.returnAllData();

            Student Tom = new Student("Tom");
            Tom.returnAllData();

            Teacher austin = new Teacher("Austin", "Yates", "Computer Science", 2);
            austin.returnAllData();

            String[] students = {"Tom", "Peter", "Matt", "Jon", "Tim", "Hugh" };
            Course algebra101 = new Course();
            algebra101.setCourseData("Algebra", "Mr. Kotter", students);
            algebra101.getCourseData();
            System.out.println(algebra101.toString());
    }
}



