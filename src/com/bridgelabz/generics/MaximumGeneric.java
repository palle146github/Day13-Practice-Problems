package com.bridgelabz.generics;

import java.util.Scanner;
public class MaximumGeneric {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
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
        System.out.println("Enter first integer Number");
        int integer1 = s.nextInt();

        System.out.println("Enter second integer Number");
        int integer2 = s.nextInt();

        System.out.println("Enter third integer Number");
        int integer3 = s.nextInt();

        int integerMax = maximum(integer1, integer2, integer3);
        System.out.println("Greatest number of integer type is : " + integerMax);
        System.out.println();

        System.out.println("Enter first float Number");
        float float1 = s.nextFloat();

        System.out.println("Enter second float Number");
        float float2 = s.nextFloat();

        System.out.println("Enter third float Number");
        float float3 = s.nextFloat();

        float floatMax = maximum(float1, float2, float3);
        System.out.println("Greatest number of float type is : " + floatMax);
        System.out.println();

        System.out.println("Enter first String");
        String string1 = s.next();

        System.out.println("Enter second String");
        String string2 = s.next();

        System.out.println("Enter third String");
        String string3 = s.next();

        String stringMax = maximum(string1, string2, string3);
        System.out.println("Greatest string type is : " + stringMax);
        System.out.println();
    }
}
