package org.launchcode.java.studios.countingCharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// TODO: 1/7/2021
//1. Create string
//2. Create Method to take in a string and convert to array by character.
//3. Create blank hashmap to store characters and value of times they occur
//4. print hashmap

public class CountingCharacters {


    public static void main(String [] args ){

          CountingCharacters.charCount(quote);
    }

    private static String quote = "If the product of two terms is zero then common sense says at least one of the " +
            "two terms has to be zero to start with. So if you move all the terms over to one side, " +
            "you can put the quadratics into a form that can be factored allowing that side of " +
            "the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


    public CountingCharacters(){
    }

    public static void charCount(String qt){
        HashMap<Character, Integer> charCounter = new HashMap<>();
        char[] charsInString = qt.toCharArray();

        for( char letter : charsInString) {
            if (!charCounter.containsKey(letter)) {
                charCounter.put(letter, 1);
            } else {
                charCounter.put(letter, charCounter.get(letter) + 1);
            }
        }
        for(Map.Entry entry : charCounter.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());

        }
    }
}


