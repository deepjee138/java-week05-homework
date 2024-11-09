package programme;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *Write a Java program to iterate through all elements in an array list using
 * Iterater
 */

public class Programme_5_ArrayListIteratorExample {

    public static void main(String[] args) {

        // create a new array list

        ArrayList<String> color = new ArrayList<>();


        // add colour in list
        color.add("Green");
        color.add("White");
        color.add("Blue");
        color.add("Black");
        color.add("Orange");
        color.add("Green");
        color.add("Pink");

        //Get a iterator for the list
        Iterator<String> iterator = color.iterator();

        //iterator all elements
        System.out.println("Color in the list");
        while (iterator.hasNext()){

            String colour = iterator.next();
            System.out.println(color);
        }
    }
}
