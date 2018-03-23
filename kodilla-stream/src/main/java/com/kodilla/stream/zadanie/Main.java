package com.kodilla.stream.zadanie;

import java.util.*;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings) {
        long count = strings.stream()
                .filter(s -> s.isEmpty())
                .count();
        return count;
    }

    public static long getCountLength3UsingJava8(List<String> strings) {
        long count = strings.stream()
                .filter(s -> s.length() == 3)
                .count();
        return count;
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        return new ArrayList<>();
    }

    public static String getMergedStringUsingJava8(List<String> strings, String string) {
        return "";
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {
        return new ArrayList<Integer>();
    }

    public static Integer getMaxJava8(List<Integer> numbers) {
        return 0;
    }

    public static Integer getMinJava8(List<Integer> numbers) {
        return 0;
    }


    public static Integer getSumJava8(List<Integer> numbers) {
        return 0;
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
        return 0;
    }
}
