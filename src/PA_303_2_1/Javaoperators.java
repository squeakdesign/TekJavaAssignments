package PA_303_2_1;

public class Javaoperators {
    public static void main(String[] args) {
        /*Write a program that declares two integer variables,
        assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.
         */

        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("sum = "+sum);

        /*Write a program that declares two double variables,
        assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
         */

        double d1=3.0245;
        double d2=4.258;
        double sum1=d1+d2;
        System.out.println("sum of two doubles ="+sum1);

        /*Write a program that declares an integer variable and
        a double variable, assigns numbers to each, and adds them together.
         Assign the sum to a variable. Print out the result. What variable type must the sum be?
         */
        int i=7;
        double d=5.03245;
        double s=i+d;
        System.out.println("sum of one int and one double "+s);

/*Write a program that declares two integer variables, assigns an integer to each,
 and divides the larger number by the smaller number. Assign the result to a variable.
  Print out the result. Now change the larger number to a decimal. What happens?
   What corrections are needed?  Answer:  We need to change datatype from int to double.
 */
        double a1=18.032;
        int b1=3;
        double div=a1/b1;
        System.out.println("division result "+div);

/*Write a program that declares two double variables, assigns a number to each,
 and divides the larger by the smaller number. Assign the result to a variable.
  Print out the result. Now, cast the result to an integer. Print out the result again.
 */
        double a2=25.032;
        double b2=2.034;
        double div2=a2/b2;
        System.out.println("result is "+ div2);
        System.out.println("result is "+ (int)div2);//cast the result to an integer.//
        /* Write a program that declares two integer variables, x and y, and
        assigns the number 5 to x and the number 6 to y.
         Declare a variable q and assign y/x to it and print q.
         Now, cast y to a double and assign it to q. Print q again.*/
        int x=5;
        int y=6;
        int q=y/x;

        System.out.println("q ="+q);
        System.out.println("q ="+(double)y/x);// cast y to a double

        /*Write a program that declares a named constant and uses it in a calculation.
         Print the result.
         */
        final double PI=3.14;
        int rad=2;
        double area=PI*rad*rad;
        System.out.println("area of circle is "+ area);
        /*
        Write a program where you create three variables that represent products at a cafe.
         The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
         Assign prices to each product. Create two more variables called subtotal and
         totalSale and complete an “order” for three items of the first product,
         four items of the second product, and two items of the third product.
         Add them all together to calculate the subtotal.
         Create a constant called SALES_TAX and add sales tax to the subtotal
          to obtain the totalSale amount. Be sure to format the results to two decimal places.

         */
        double coffee=3.25;
        double cappuccino=2.00;
        double espresso=1.52;
        double green_tea=0.50;
        double subtotal,total_sale;
        final double SALES_TAX=3.2;
        subtotal=(3*coffee)+(4*cappuccino)+(2*espresso);
        total_sale=subtotal+SALES_TAX;
        System.out.println("total_amount = "+(float)total_sale);



    }
}
