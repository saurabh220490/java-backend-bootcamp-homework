package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int age =10;

        // Step 2: Convert primitive variables to wrapper objects
        Integer new_age=age;

        // Step 3: Print the values of the wrapper objects
        System.out.println("Primitive type "+ age+" ");
        System.out.println("Non-Primitive type "+ new_age+" ");

        // Step 4: Convert wrapper objects back to primitive variables
         age = new_age;

        // Step 5: Print the values of the primitive variables
        System.out.println("Primitive type "+ age+" ");
        System.out.println("Non-Primitive type "+ new_age+" ");
    }
}
