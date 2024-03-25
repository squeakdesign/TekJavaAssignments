package PA_303_7_1_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
/*Task 11: Write some Java code that asks the user how many favorite things they have.
 Based on their answer, you should create a String array of the correct size.
 Then ask the user to enter the things and store them in the array you created.
 Finally, print out the contents of the array.


Example
How many favorite things do you have?
7

Enter your thing: phone
Enter your thing: tv
Enter your thing: xbox
Enter your thing: wine
Enter your thing: beer
Enter your thing: sofa
Enter your thing: book
Your favorite  things are:
phone tv xbox wine beer sofa book
*/
        Scanner input=new Scanner(System.in);
        System.out.println("How many favourite things do you have");
        int n=input.nextInt();
        String[] a=new String[n];
        input.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("enter the favourite thing");
            a[i]=input.nextLine();
        }
        System.out.println("Your favorite things are :");
        for(int j=0;j<n;j++){
            System.out.println(a[j]);

        }

    }
}