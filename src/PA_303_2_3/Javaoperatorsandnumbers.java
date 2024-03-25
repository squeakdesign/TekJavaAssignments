package PA_303_2_3;

public class Javaoperatorsandnumbers {
    public static void main(String[] args) {
        /*Write a program that declares an integer a variable x, assigns the value 2 to it,
         and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
         Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
          Before printing the results, write a comment with the predicted decimal value
          and binary string. Now, print out x in decimal form and in binary notation.

Perform the preceding exercise with the following values:
9
17
88 */
        //1.left shift operator for x=2
        int x=2;  // binary of 2 is 10
        System.out.println("binary of x=2 is "+Integer.toBinaryString(x));
        x=x<<1;
        System.out.println("value of decimal number 2 after(<<) shifting by 1 = "+x);  //predicted decimal value=4,binary=100

        //2.left shift operator for y=9
        int y=9;  // binary of 9 is 1001
        System.out.println("binary of 9 is "+Integer.toBinaryString(y));
        y=y<<1;
        System.out.println("value of decimal 9 after(<<) shifting by 1 = "+y+"\n");  //predicted decimal value=18,binary=10010

     /*Write a program that declares a variable a, and assigns 150 to it,
     and prints out the binary string version of the number. Now use the
     right shift operator (>>) to shift by 2 and assign the result to a.
     Write a comment indicating what you anticipate the decimal and binary values to be.
     Now print the value of x and the binary string.
        Perform the preceding exercise with the following values:
        225 */

        int a=150;
        System.out.println("binary of a=150 is "+(Integer.toBinaryString(a)));
        a=a>>2;
        System.out.println("value of a=150 after(>>) right shift "+a); // predicted decimal value=37,binary=100101
        System.out.println("equivalent binary is "+(Integer.toBinaryString(a)));

        int b=225;
        System.out.println("binary of a=225 is "+(Integer.toBinaryString(b)));
        b=b>>2;
        System.out.println("value of b=225 after(>>) right shift "+b); // predicted decimal value=56,binary=111000
        System.out.println("equivalent binary is "+(Integer.toBinaryString(b))+"\n");



       /* Write a program that declares three int variables: x1, y1, and z1. Assign 7 to x1 and 17 to y1.
        Write a comment that indicates what you predict will be the result of the bitwise and operation
         on x1 and y1. Now use the bitwise AND (&) operator to derive the decimal and binary values,
          and assign the result to z1.
        */

        int x1,y1,z1;
        x1=7;
        y1=17;
        //bitwise and
        // 111 & 10001 =00001, equivalent decimal =1
        z1=x1&y1;
        System.out.println("x1&y1 is " + z1);

        /*Now, with the preceding values, use the bitwise and operator to
        calculate the “or” value between x1 and y1. As before,
        write a comment that indicates what you predict the values to be before printing them out.
         */
        z1=x1|y1;
        //bitwise OR
        // 111 & 10001 =10111, equivalent decimal =23
        System.out.println("x1|y1 is "+ z1);

        /*Write a program that declares an integer variable, assigns a number,
         and uses a postfix increment operator to increase the value. Print the value before
         and after the increment operator.
         */
        int i=5;
        System.out.println("value of i= " + i);
        i=i++; //postfix operator
        System.out.println("value of i++ = "+i+"\n");

        /*Write a program that demonstrates at least three ways to increment a variable by 1 and
         does this multiple times. Assign a value to an integer variable, print it, increment by 1,
          print it again, increment by 1, and then print it again.
         */
        int n=5;
        System.out.println("value of n = "+n);
        n=n+1;
        System.out.println("value of n+1 "+n);
        n+=1;
        System.out.println("value of n=+1 "+n);
        n=++n;
        System.out.println("value of ++n "+n);

        /*Write a program that declares two integer variables: p, and q, and then assigns 5 to p and 8 to q.
         Create another variable sum and assign the value of ++p added to q, and print the result.
         Notice the value of the sum (should be 14). Now change the increment operator to postfix (p++)
          and re-run the program. Notice what the value of the sum is.The first configuration incremented p,
           and then calculated the sum, while the second configuration calculated the sum, and
            then incremented p.

         */
        int p,q,sum;
        p=5;
        q=8;
        sum=++p + q;
        //sum=p++ + q;
        System.out.println("\nsum = "+sum);




    }
}
