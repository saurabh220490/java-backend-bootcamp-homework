package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal2 cat =  new Animal2() {
            @Override
            public void makeSound() {
                System.out.println("Cat says meow");
            }
        };
        cat.makeSound();
    }
}

abstract class Animal2{
    public abstract void makeSound();
}