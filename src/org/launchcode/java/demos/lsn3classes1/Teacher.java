package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject=subject;
        this.yearsTeaching=yearsTeaching;
    }
    public Teacher(String firstName, String lastName) {
        this(firstName, lastName,"", 0);
    }

    public String TeacherInfo() {
        return (this.firstName + " teaches: " + this.subject);
    }
    public String getName(){
        return firstName + lastName;
    }
    public void returnAllData(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(subject);
        System.out.println(yearsTeaching);
    }
}









//    private String firstName;
//    private String lastName;
//    private String subject;
//    private int yearsTeaching = 0;
//
//    public String getName(){
//        return firstName + lastName;
//    }
//    public void setFirstName(String aName){
//        firstName = aName;
//    }
//    public void setLastName(String bName){
//        lastName = bName;
//    }
//    public void setSubject(String aSubject){
//        subject = aSubject;
//    }
//    public void setCreditsAndGpa(int numYearsTeaching){
//        yearsTeaching = numYearsTeaching;
//    }
//    public void returnAllTeacherData(){
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(subject);
//        System.out.println(yearsTeaching);
//    }
//}
