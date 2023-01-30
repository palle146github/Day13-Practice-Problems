package com.bridgelabz.generics;

import java.util.List;
import java.util.Arrays;

public abstract class MaximumMorethanThreeVariable<E extends Comparable<E>> {


    public static <E extends Comparable<E>> E testMaximum(List<E> list) {
        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0)
                max = element;
        }
        return max;
    }

    public static <E extends Comparable<E>> E printMax() {

        int maxInt = testMaximum(Arrays.asList(4, 6, 7, 19, 43, 18, 35, 18, 94));
        System.out.println("Maximum integer is " + maxInt);
        float maxFloat = testMaximum(Arrays.asList(4.6F, 7.4F, 8.9F, 3.5F, 6.9F, 3.9F));
        System.out.println("Maximum Float is " + maxFloat);
        String maxString = testMaximum(Arrays.asList("Hello", "Great", "Bad", "Good", "Secret", "David", "John"));
        System.out.println("Maximum String is " + maxString);
        return null;
    }

    public static void main(String[] args) {
        printMax();
    }
}
