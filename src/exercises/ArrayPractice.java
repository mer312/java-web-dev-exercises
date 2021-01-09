package exercises;
import java.util.*;

//This project should do the following
//1.create and loop through an array to find odd numbers
//2. use a split method to to divide a string and store the individual words.
//3. Repeat 2 to split string at period.

public class ArrayPractice {


    public static void main(String[] args) {

        ArrayPractice arrPrac = new ArrayPractice();
        arrPrac.findOddNumbers();
        arrPrac.splitString(" ");
        arrPrac.splitString("\\. ");
    }

    private final int[] arr = {1, 1, 2, 3, 5, 8};

    private final String pracStr = "I would not, could not, in a box. I would not, could not with a fox." +
            " I will not eat them in a house. I will not eat them with a mouse.";

    public ArrayPractice() {
    }

    public void findOddNumbers() {

        for (int j : this.arr) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }

    public void splitString(String x) {
        String[] strArr = this.pracStr.split(x);
        System.out.println(Arrays.toString(strArr));
    }
}