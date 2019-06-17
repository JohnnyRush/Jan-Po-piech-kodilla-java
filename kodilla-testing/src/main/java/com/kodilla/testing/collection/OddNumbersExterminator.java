package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> exterminatedOddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 != 0)
                exterminatedOddNumbers.add(number);
        }
        return exterminatedOddNumbers;
    }
}
