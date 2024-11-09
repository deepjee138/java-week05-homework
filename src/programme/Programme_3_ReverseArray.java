package programme;

import java.util.Arrays;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */

public class Programme_3_ReverseArray {

    // method to reverse an array
    public static void reverseArray(int[]arr){

        int start = 0;
        int end = arr.length -1;


        // swap elements from both ends towards the center
        while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            // move the pointers towards the center
            start++;
            end --;
        }


    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};


        // Display origanal array
        System.out.println("Orignal array:" + Arrays.toString(arr));

        // reverse to the array
        reverseArray(arr);

        // Display the reversed array
        System.out.println("Reversed Array" +Arrays.toString(arr));
    }


}
