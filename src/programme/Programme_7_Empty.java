package programme;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

public class Programme_7_Empty {
    public static void main(String[] args) {


        // create array list
        ArrayList <Integer> number = new ArrayList<>();

        // check the number is empty
        if (number.isEmpty()){
            System.out.println("The number is empty");
        }else {
            System.out.println("The number is not empty");
        }

        // add a number to the list

        number.add(1);

        // check again after editing
        if (number.isEmpty()){
            System.out.println("The Array lists is empty");
        }else {
            System.out.println("The Array list is not empty");
        }

    }
}