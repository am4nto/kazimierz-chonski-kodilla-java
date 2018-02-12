package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
       for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 != 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }

}
