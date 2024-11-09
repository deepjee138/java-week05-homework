package programme;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme_8_HashSetExample {

    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet<Integer> numbers = new HashSet<>();

        // Add numbers to the HashSet
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Check which numbers between 1 and 10 are in the set


        System.out.println("Checking numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}


