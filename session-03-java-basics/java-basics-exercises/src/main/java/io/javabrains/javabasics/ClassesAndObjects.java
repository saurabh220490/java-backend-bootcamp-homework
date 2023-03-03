package io.javabrains.javabasics;

/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */

public class ClassesAndObjects {

    public static void main(String[] args) {
        Car toyota_car = new Car("Toyota","Camry",2020);
        System.out.println("Make: "+toyota_car.getMake());
        System.out.println("Model: "+toyota_car.getModel());
        System.out.println("Year: "+toyota_car.getYear_of_car());
        System.out.println("Details: "+toyota_car.getYear_of_car()+" "+toyota_car.getMake()+" "+toyota_car.getModel());
    }
}

class Car{
    String make;
    String model;
    int year_of_car;
     Car(String make, String model, int year_of_car){
        this.make=make;
        this.model=model;
        this.year_of_car=year_of_car;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear_of_car() {
        return year_of_car;
    }

    public void setYear_of_car(int year_of_car) {
        this.year_of_car = year_of_car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year_of_car=" + year_of_car +
                '}';
    }
}

