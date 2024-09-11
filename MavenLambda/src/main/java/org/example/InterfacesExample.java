package org.example;

public class InterfacesExample {
    @FunctionalInterface
    interface Converter<T, R> {
        R convert(T input);
    }

    @FunctionalInterface
    interface BiOperation<T> {
        T apply(T a, T b);
    }

    @FunctionalInterface
    interface Predicate<T> {
        boolean test(T t);
    }
}
