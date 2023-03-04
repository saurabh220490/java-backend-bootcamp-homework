package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(3);
        integerList.add(6);
        integerList.add(-7);
        int sum = 0;

        for(int i : integerList){
            sum=sum+i;
        }

        System.out.println("sum of integeres are "+sum);
    }
}
