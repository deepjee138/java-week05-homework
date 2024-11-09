package programme;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme_6_RetrieveElement {

    public static void main(String[] args) {

        // Creating array list
        ArrayList<Integer> number = new ArrayList<>();
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);

        // Specify index
        int indexToReceive =  2;

        // check the index is valid
        if (indexToReceive >= 0 && indexToReceive < number.size()){
        Integer elements = number.get(indexToReceive);
        System.out.println("Elements at index " + indexToReceive + ":" +   elements);
        }else{
        System.out.println("Index out of bond");
    }
}
}