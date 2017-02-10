package com.swedbank.itacademy.util;

public class MathUtil {

    // TODO implement code
    public static int factorial(int number) {
        int factorial = 1;
        while (number > 1) {
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }
}
