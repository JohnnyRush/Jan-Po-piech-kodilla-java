package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
                IntStream.range(0, numbers.length)
                .forEach(s -> System.out.println(numbers[s]));

                double average =
                IntStream.range(0, numbers.length)
                        .average().getAsDouble();

                return average;

    }
}