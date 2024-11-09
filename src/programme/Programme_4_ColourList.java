package programme;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

public class Programme_4_ColourList {

    public static void main(String[] args) {
        // create a new array list
        ArrayList<String> colour = new ArrayList<>();

        // add a colour
        colour.add("Red");
        colour.add("White");
        colour.add("Yellow");
        colour.add("Grin");
        colour.add("Blue");
        colour.add("Purple");
        colour.add("Orange");
        colour.add("Marun");


        // print using for loop
        System.out.println("Color in the list");
        for (String color : colour){
            System.out.println(color);
        }
    }
}
