package io.javabrains.javacollections;

/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        Iterator<String> iterator = list.iterator();
        System.out.println("forward order printing");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("++++++++++++++++++++++++++++++++++");

        System.out.println("reverse order printing");
        //  ??
        ListIterator<String> listIterator = list.listIterator(list.size());

        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }

    }
}
