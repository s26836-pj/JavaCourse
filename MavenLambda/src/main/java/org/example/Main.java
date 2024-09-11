package org.example;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        LAMBDA

        InterfacesExample.Converter<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);

        System.out.println("Converted '123' to " + stringToInteger.convert("123"));


        InterfacesExample.BiOperation<Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 5 and 10 " + add.apply(5, 10));

        Predicate<String> isLongerThan5 = (String s) -> true;
        System.out.println("'HelloWorld' is longer than 5 " + isLongerThan5.test("HelloWorld"));


//        ENUM
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }

        double x = 10, y = 5;
        for (Operation op : Operation.values()) {
            System.out.println(op + " of " + x + " and " + y + ": " + op.apply(x, y));
        }

        for (Color color : Color.values()) {
            color.printInfo();
        }
    }
}
