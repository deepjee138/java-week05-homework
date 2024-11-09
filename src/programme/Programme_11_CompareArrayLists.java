package programme;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink
 */

public class Programme_11_CompareArrayLists {

    public static void main(String[] args) {

        // Declare the Two array
        ArrayList<String> c1= new ArrayList<String>();
        ArrayList<String> c2= new ArrayList<String>();


        // adding the list1
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // adding the list 2
        c2.add("Red");
       c2.add("Green");
       c2.add("Black");
       c2.add("Pink");

       // comparing list 1 and 2
        if(c1.equals(c2)){
            System.out.println("The two ArrayLists are same.");
        }else {
            System.out.println("The two ArrayLists are not same.");
        }
    }
}
