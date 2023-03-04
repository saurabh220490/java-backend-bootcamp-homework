package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String[] args) {

        Person person1 = new Person("John","Deer",45);
        Person person2 = new Person("John","Deer",45);
        Person person3 = new Person("John","Deer",44);
        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));

    }
}

class Person{
    String firstName;
    String lastName;
    int age;
    Date lastModifiedDate;
    Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
