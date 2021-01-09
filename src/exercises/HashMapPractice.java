package exercises;

//you want this to do :
//1. it takes in name and ID numbers
//2. the keys should be the IDs and the values should be the names
//3. modify the roster

import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMapPractice hashmap = new HashMapPractice();
        hashmap.updateRoster();

    }

    public HashMapPractice() {

    }

    public void updateRoster(){

        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Id: ");
                Double newId = input.nextDouble();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}
