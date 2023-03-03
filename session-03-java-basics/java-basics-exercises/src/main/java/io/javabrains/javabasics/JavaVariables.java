package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int age = 10;
        // long variable to store a long value
        long population_count =  1200000000L;
        // float variable to store a floating-point value
        float percentage = 10.534f;

        // double variable to store a double value
        double marks_percentage  = 73.8;

        // char variable to store a single character
        char s = 'S';

        // boolean variable to store a boolean value
        boolean true_flag =true;

        // String variable to store a string of characters
        String name = "bootcamp";

        // Step 2: Print the values of the variables to the console
        System.out.println(age);
        System.out.println(population_count);
        System.out.println(percentage);
        System.out.println(marks_percentage);
        System.out.println(s);
        System.out.println(true_flag);
        System.out.println(name);

        // Step 3: Modify the values of the variables and print the updated values
        age=age+15;
        population_count=population_count+50L;
        percentage=percentage+1;
        marks_percentage=marks_percentage+5;
        s = 's';
        true_flag = !true_flag;
        name="javabrains bootcamp";
        System.out.println("+++++++++++++++ UPDATED VALUES +++++++++++++++++++++");
        System.out.println(age);
        System.out.println(population_count);
        System.out.println(percentage);
        System.out.println(marks_percentage);
        System.out.println(s);
        System.out.println(true_flag);
        System.out.println(name);
    }
}
