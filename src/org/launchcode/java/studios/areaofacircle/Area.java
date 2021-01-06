package org.launchcode.java.studios.areaofacircle;

//This task is asking us for three things;
//1. Ask the user for the radius
//2. Calculate the area
//3. Print the result

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }

    public Area() {
    }

    private void calculateArea() {

        Scanner input = new Scanner(System.in);

        try {

            boolean keepLooping = true;

            while (keepLooping) {

                System.out.println("Enter the radius of the circle: ");
                Double myRadius = input.nextDouble();

                if (myRadius <= 0) {
                    System.out.println("Please input a positive number");

                } else {
                    Double getArea = Circle.getArea(myRadius);
                    System.out.println("The area of the circle is: " + getArea);
                    keepLooping = false;
                    }
                }
            } catch(Exception error){
                System.out.println("You must provide a numeric input.");
            }
        input.close();
    }
}