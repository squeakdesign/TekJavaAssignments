package PA_303_7_1_Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.  Print out the value at the first index and the last index
        using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).
          Notice the type of exception which is produced. Now try to assign a value to the array index 5.
          You should get the same type of exception.
         */
        int[] a={12,54,48,36,7};
        int i=a.length;
        System.out.println("Value of first index "+a[0]);
        System.out.println("value of last index "+a[a.length-1]);
        // System.out.println("value at index=length "+a[a.length]);


    }
}
