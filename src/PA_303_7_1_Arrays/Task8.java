package PA_303_7_1_Arrays;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        /*Write a program that creates a String array of 5 elements and swaps
        the first element with the middle element without creating a new array.
         */
        String[] a={"red","green","yellow","white","black"};
        String temp;
        temp=a[0];
        a[0]=a[2];
        a[2]=temp;
        System.out.println(Arrays.toString(a));



    }
}
