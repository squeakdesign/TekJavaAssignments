package PA_303_7_1_Arrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        /*Write a program to sort the following int array
         in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
          and print the smallest and the largest element of the array.
          The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13*/
        int[] a={4,2,9,13,1,0};


        int minval=a[0];
        int maxval=a[0];
        int temp=0;
        System.out.println("array before sorting "+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(a[i]<minval)
            {minval=a[i];
            }
            if(a[i]>maxval){
                maxval=a[i];
            }
        }
        for(int i=0;i<a.length;i++)
        {for(int j=i+1;j<a.length;j++)
        {if(a[i]>a[j]) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        }}



        System.out.println("Array in Ascending order "+ Arrays.toString(a));
        System.out.println("The smallest number is "+ minval);
        System.out.println("The biggest number is "+maxval);



    }
}
