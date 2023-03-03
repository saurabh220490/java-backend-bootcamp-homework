package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int marks =78;
        int total_marks =100;


        // Step 2: Perform arithmetic operations
        int percentage = (marks*100)/total_marks;
        marks = marks+13;
        int remainder = 23/10;
        marks = marks -3;
        int multiplied_marks = percentage*100;

        // Step 3: Print the results of the arithmetic operations
        System.out.println(marks);
        System.out.println(total_marks);
        System.out.println(percentage);
        System.out.println(remainder);
        System.out.println(multiplied_marks);

        // Step 4: Perform increment and decrement operations
        marks = marks -3;
        System.out.println(marks);
        marks = marks+13;
        System.out.println(marks);

        // Step 5: Print the results of the increment and decrement operations
        //done in last step

        // Step 6: Perform comparison operations
        if(percentage>=60)
            System.out.println("First Division Pass");

        // Step 7: Print the results of the comparison operations
        //done in last step

        // Step 8: Perform logical operations
        if(percentage>=60 && percentage<=100)
            System.out.println("Congratulations! Passed...Keep working hard and achieve more");

        // Step 9: Print the results of the logical operations
        //done in last step

    }
}
