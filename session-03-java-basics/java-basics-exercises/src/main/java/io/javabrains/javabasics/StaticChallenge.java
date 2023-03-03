package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {
        Rectangale r1 = new Rectangale();
        System.out.println(r1.getArea(10, 2));

        Rectangale r2 = new Rectangale();
        System.out.println(r2.getArea(30, 2));


        Rectangale r3 = new Rectangale();
        System.out.println(r3.getArea(50, 2));

        Rectangale r4 = new Rectangale();
        System.out.println(r4.getArea(10.0, 2.0));

        Rectangale r5 = new Rectangale();
        System.out.println(r5.getArea(10.55, 2.23));

        System.out.println("total number of rectangles created " + Rectangale.getNumOfRectangles());
    }
}

class Rectangale {
    static int numOfRectangles = 0;
    double width;
    double height;

    Rectangale() {
        numOfRectangles++;
    }

    public double getArea(double width, double height) {
        return width * height;
    }

    public double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static int getNumOfRectangles() {
        return numOfRectangles;
    }

}
