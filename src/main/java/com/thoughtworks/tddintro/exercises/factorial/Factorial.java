package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {

    public Integer compute(int i) {
        if (i < 0){
            throw new IllegalArgumentException("Negative numbers not allowed.");
        }

        int result = 1;
        for (int j = result; j <= i; ++j) {
            result *= j;
        }
        return result;
    }
}
