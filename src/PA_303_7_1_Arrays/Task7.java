package PA_303_7_1_Arrays;

public class Task7 {
    public static void main(String[] args) {
        /*Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element, except for the middle (index 2) element.
         */
        int[] a={48,23,54,71,10};
        for(int i=0;i<a.length;i++){
            if(a[i]==a[2]){continue;}
            System.out.println(a[i]);
        }
    }
}
