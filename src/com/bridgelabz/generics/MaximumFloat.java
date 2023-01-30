package com.bridgelabz.generics;

import java.util.Scanner;

public class MaximumFloat {

    public static Float maximumFloat(Float x, Float y, Float z) {
        Float max = x;
        if( y.compareTo(x) > 0 ) {
            max = y;
        }
        if( z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first Float Number");
        float x = s.nextFloat();

        System.out.println("Enter second Float Number");
        float y = s.nextFloat();

        System.out.println("Enter third Float Number");
        float z = s.nextFloat();

        float max = maximumFloat( x, y, z);
        System.out.println("Maximum of three Float nuumber is " + max);
    }

}
