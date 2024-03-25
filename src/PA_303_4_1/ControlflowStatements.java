package PA_303_4_1;
import java.util.Scanner;
public class ControlflowStatements {
    public static void main(String[] args) {
         /*Write a program that declares 1 integer variable x, and then
assigns 7 to it. Write an if statement to print out “Less than 10” if x is
less than 10. Change x to equal 15, and notice the result (console
should not display anything).*/
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        /*2. Write a program that declares 1 integer variable x, and then
assigns 7 to it. Write an if-else statement that prints out “Less than 10”
if x is less than 10, and “Greater than 10” if x is greater than 10.
Change x to 15 and notice the result.

         */
        x = 7;
        if (x < 10)
            System.out.println("Less than 10");
        else System.out.println("Greater than 10");

/*Write a program that declares 1 integer variable x, and then
assigns 15 to it. Write an if-else-if statement that prints out “Less than
10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but
less than 20, and “Greater than or equal to 20” if x is greater than or
equal to 20. Change x to 50 and notice the result.*/
        x = 15;
        if (x < 10)
            System.out.println("Less than 10");
        else if ((x >= 10) && (x < 20)) {
            System.out.println("Between 10 and 20");

        }
/*Write a program that declares 1 integer variable x, and then
assigns 15 to it. Write an if-else statement that prints “Out of range” if
the number is less than 10 or greater than 20 and prints “In range” if
the number is between 10 and 20 (including equal to 10 or 20).
Change x to 5 and notice the result.*/
        x = 5;
        if ((x < 10) || (x > 20))
            System.out.println("Out of range");
        else if ((x >= 10) && (x <= 20))
            System.out.println("in range");

        /*5. Write a program that uses if-else-if statements to print out grades
A, B, C, D, F, according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
Use the Scanner class to accept a number score from the user to
determine the letter grade. Print out “Score out of range” if the score
is less than 0 or greater than 100.
*/
        Scanner input = new Scanner(System.in);

        System.out.println("enter the score");
        int score = input.nextInt();
        if ((score >= 90) && (score <= 100))
            System.out.println("Grade A");
        else if ((score >= 80) && (score < 90))
            System.out.println("Grade B");
        else if ((score >= 70) && (score < 80))
            System.out.println("Grade C");
        else if ((score >= 60) && (score < 70))
            System.out.println("Grade D");
        else if ((score < 60))
            System.out.println("Grade F");
        else if ((score > 100) || (score < 0))
            System.out.println("Out of range");
        /*6. Write a program that accepts an integer between 1 and 7 from
the user. Use a switch statement to print out the corresponding
weekday. Print “Out of range” if the number is less than 1 or greater
than 7. Do not forget to include “break” statements in each of your
cases.

         */
        System.out.println("enter an integer between 1 and 7");
        int a = input.nextInt();
        switch (a) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("out of range");
        }
/*7. Create a program that lets the users input their filing status and
income. Display how much tax the user would have to pay
according to status and income.
❑ The U.S. federal personal income tax is calculated based
on the filing status and taxable income.
❑ There are four filing statuses: Single, Married Filing Jointly,
Married Filing Separately, and Head of Household.
❑ The tax rates for 2009 are shown below.*/
        input.nextLine();
        System.out.println("enter the filing status S,MFJ,MFS,HOH");
        String status = input.nextLine();
        System.out.println("enter the income");
        int income = input.nextInt();
        enum Status {S,MFJ,MFS,HOH;}
        Status c;
        c=Status.valueOf(status);

        switch (c) {
            case S: if(income<=8350) System.out.println("tax rate 10% "+(income*10/100));
            else if(income<=33950) System.out.println("tax rate 15% "+(income*15/100) );
            else if(income<=82250) System.out.println("tax rate 25% "+(income*25/100) );
            else if(income<=171550) System.out.println("tax rate 28% "+(income*28/100) );
            else if(income<=372950) System.out.println("tax rate 33% "+(income*33/100) );
            else if(income>=372951) System.out.println("tax rate 35% "+(income*35/100) );
                System.out.println("single");
                break;
            case MFJ: if(income<=16700) System.out.println("tax rate 10% "+(income*10/100));
            else if(income<=67900) System.out.println("tax rate 15% "+(income*15/100) );
            else if(income<=137050) System.out.println("tax rate 25% "+(income*25/100) );
            else if(income<=208850) System.out.println("tax rate 28% "+(income*28/100) );
            else if(income<=372950) System.out.println("tax rate 33% "+(income*33/100) );
            else if(income>=372951) System.out.println("tax rate 35% "+(income*35/100) );
                System.out.println("Married filing jointly");
                break;
            case MFS: if(income<=8350) System.out.println("tax rate 10% "+(income*10/100));
            else if(income<=33950) System.out.println("tax rate 15% "+(income*15/100) );
            else if(income<=68525) System.out.println("tax rate 25% "+(income*25/100) );
            else if(income<=104425) System.out.println("tax rate 28% "+(income*28/100) );
            else if(income<=186475) System.out.println("tax rate 33% "+(income*33/100) );
            else if(income>=186476) System.out.println("tax rate 35% "+(income*35/100) );
                System.out.println("MFS");break;

            case HOH: if(income<=8350) System.out.println("tax rate 10% "+(income*10/100));
            else if(income<=8350) System.out.println("tax rate 15% "+(income*15/100) );
            else if(income<=33950) System.out.println("tax rate 25% "+(income*25/100) );
            else if(income<=68525) System.out.println("tax rate 28% "+(income*28/100) );
            else if(income<=104425) System.out.println("tax rate 33% "+(income*33/100) );
            else if(income>=186475) System.out.println("tax rate 35% "+(income*35/100) );
                System.out.println("HOH");break;

            default:
                System.out.println("out of status");


        }


    }
}
