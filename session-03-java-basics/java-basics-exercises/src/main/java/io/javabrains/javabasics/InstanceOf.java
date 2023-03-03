package io.javabrains.javabasics;

import java.math.BigDecimal;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for (Object obj : objects) {
            determine(obj);
        }

    }

    static void determine(Object o) {
        if (o instanceof Integer) {
            System.out.println("type of " + o + " is integer");
        } else if (o instanceof String) {
            System.out.println("type of " + o + " is String");
        } else if (o instanceof Boolean) {
            System.out.println("type of " + o + " is boolean");
        } else if (o instanceof Float) {
            System.out.println("type of " + o + " is float");
        } else if (o instanceof Double) {
            System.out.println("type of " + o + " is double");
        } else if (o instanceof BigDecimal) {
            System.out.println("type of " + o + " is bigDecimal");
        }
    }
}
