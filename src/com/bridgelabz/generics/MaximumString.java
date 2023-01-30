package com.bridgelabz.generics;

import java.util.Scanner;
public class MaximumString {
    public static String maximumString(String x, String y, String z) {
        String max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first String Number");
        String x = s.next();
        System.out.println("Enter second String Number");
        String y = s.next();

        System.out.println("Enter third String Number");
        String z = s.next();

        String max = maximumString(x, y, z);
        System.out.println("Maximum of three Strings is " + max);
    }
}