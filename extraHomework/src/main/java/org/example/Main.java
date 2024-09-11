package org.example;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = (String s) -> s.length();
        System.out.println("Length of 'Hello, World!' " + stringLength.apply("Hello, World!"));

        Predicate<String> isEmpty = (String s) -> s.isEmpty();
        System.out.println("'Hello' is empty: " + isEmpty.test("Hello"));
        System.out.println("'' is empty" + isEmpty.test(""));

        Consumer<String> printUpperCase = (String s) -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello, world!");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value " + randomValue.get());

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("Product of 5 and 3 " + multiply.apply(5, 3));
    }
}
