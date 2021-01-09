package exercises;
//This is what needs to get done
//1.write a static method to sum even numbers in array list
//2. write a static method to print the words with 5 letters
//3. ask the user for input number of letters
//4. split a string to an arraylist
import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayListPractice.sumEvenNumbers(numbers);
        ArrayListPractice.printWordsWithExactNumOfChars(cities);
        ArrayListPractice.stringToArrayList(pracStr);
    }

    private static final ArrayList<Integer> numbers = new ArrayList<>() {
        {
            for (int i = 0; i < 11; i++) {
                add(i);
            }
        }
    };

    private static final ArrayList<String> cities = new ArrayList<>() {
        {
            add("London");
            add("Tokyo");
            add("Chicago");
            add("LA");
            add("San Francisco");
        }
    };

    private static final String pracStr = "I would not, could not, in a box. I would not, could not with a fox." +
            " I will not eat them in a house. I will not eat them with a mouse.";

    public ArrayListPractice() {
        //Getters and Setters
    }

    public static void sumEvenNumbers(ArrayList<Integer> numbers) {
        int total = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        System.out.println(total);
    }

    public static void printWordsWithExactNumOfChars(ArrayList<String> arrList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length you want to check");
        int wordNum = input.nextInt();

        for (String word : arrList) {
            if (word.length() == wordNum)
                System.out.println(word);
        }
    }
    public static void stringToArrayList (String prcStr){
        String[] arr1 = prcStr.split(" ");
        List<String> al;
        al = Arrays.asList(arr1);
        for (String s : al) {
            System.out.println(s);
        }
    }
}
