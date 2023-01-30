package com.bridgelabz.generics;

import java.util.Scanner;
public class MaximumInteger {
        public static Integer maximumInteger(Integer x, Integer y, Integer z) {
            Integer max = x;
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
            System.out.println("Enter first Integer Number");
            int x = s.nextInt();

            System.out.println("Enter second Integer Number");
            int y = s.nextInt();

            System.out.println("Enter third Integer Number");
            int z = s.nextInt();

            int max = maximumInteger( x, y, z);
            System.out.println("Maximum of three integers are " + max);
        }
}
