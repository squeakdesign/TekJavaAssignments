package PA_303_7_1_Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*Task 2: Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2} and
         produce the following output: 7
         */
        int[] array = {13, 5, 7, 68, 2};
        int temp;
        int l = array.length/2;
        System.out.println("middle element");
        System.out.println(array[l]);

    }
}
