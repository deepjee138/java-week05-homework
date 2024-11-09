package programme;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */

public class Programme_9_HashMapExample {

    public static void main(String[] args) {

        // create a Hashmap to store people
        HashMap<String, Integer> people = new HashMap<>();


        // add enter to the Hashmap
        people.put("Alice", 16);
        people.put("Ishika", 20);
        people.put("Hohan", 34);
        people.put("om", 35);

        // Use a for-each loop to iterate over and print only the values
        System.out.println("Ages of people:");
        for (Integer age : people.values()) {
            System.out.println(age);
        }
    }
}
