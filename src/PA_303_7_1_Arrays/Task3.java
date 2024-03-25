package PA_303_7_1_Arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*Task 3: Write a program that creates an array of String type and initializes
        it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length.
         Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
         the new array to verify that the original array was copied.
         */
        String[] a={"red","green","blue","yellow"};
        System.out.println("array length "+a.length);
        String[] b=a.clone();
        System.out.println("new array elements cloned from sourcearray  "+ Arrays.toString(b));

    }
}
