package edu.Bootcamp;

import com.sun.deploy.util.SystemUtils;

public class Main {

    public static void main(String[] args) {
//      Conditional statement template:
//          if (condition) true-statement;
//      For example, the below results in the true-statement running.
System.out.println("\nFirst example:");
        int value1 = 10;
        int value2 = 4;
        if (value1 > value2) System.out.println("Value 1 is bigger");
//      The statement below, however, is false and will not run the true-statement.
System.out.println("\nSecond example:");
        int value3 = 9;
        int value4 = 3;
        if (value3 < value4) System.out.println("Value 3 is smaller");

//      To get a statement to run when the condition is false, include an else statement:
//          if (condition) true-statement;
//          else false-statement;

//      For example:
System.out.println("\nThird example:");
        int value5 = 8;
        int value6 = 2;
        if (value5 < value6) System.out.println("Value 5 is smaller");
        else System.out.println("That condition was false :/");

//      We can also string link conditional statements together if there is a chain of them. The result will be the first one in the chain to return as true.
//      For example:
System.out.println("\nFourth example:");

        int value7 = 2;
        if (value7 < 1) System.out.println("This value is less than 1!");
        else if (value7 < 2) System.out.println("This value is less than 2!");
        else if (value7 < 3) System.out.println("This value is less than 3");
        else if (value7 < 4) System.out.println("This value is less than 4!");
        else System.out.println("This is pretty big. At least, it's more than 4.");

    }
}
