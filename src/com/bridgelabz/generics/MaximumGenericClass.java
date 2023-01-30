package com.bridgelabz.generics;

import java.util.Scanner;

public abstract class MaximumGenericClass<E> implements Comparable<E> {

    E element1, element2, element3;

    public MaximumGenericClass(E element1, E element2, E element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public static <E extends Comparable<E>> E testMaximum(E element1, E element2, E element3) {
        System.out.println("The numbers are : " + element1 + ",  " + element2 + ",   " + element3);
        E max = element1;
        if (max.compareTo(element2) > 0) {
            max = element2;
        }
        if (max.compareTo(element3) > 0) {
            max = element3;
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

        int integerMax = testMaximum(integer1, integer2, integer3);
        System.out.println("Greatest number of integer type is : " + integerMax);
        System.out.println();

        System.out.println("Enter first float Number");
        float float1 = s.nextFloat();

        System.out.println("Enter second float Number");
        float float2 = s.nextFloat();

        System.out.println("Enter third float Number");
        float float3 = s.nextFloat();

        float floatMax = testMaximum(float1, float2, float3);
        System.out.println("Greatest of float number is : " + floatMax);
        System.out.println();


        System.out.println("Enter first String");
        String string1 = s.next();

        System.out.println("Enter second String");
        String string2 = s.next();

        System.out.println("Enter third String");
        String string3 = s.next();

        String stringMax = testMaximum(string1, string2, string3);
        System.out.println("Greatest String among three strings is : " + stringMax);
        System.out.println();
    }
}

