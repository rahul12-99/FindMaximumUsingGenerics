package com.genericmaximumvalue;

import java.util.Arrays;

public class GenericMax {


    public static <T extends Comparable<T>> T testMax(T a,T b,T c) {
        T maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is " + maximum);
        return maximum;
    }

    public static <E> void printMax(E x, E... arg) {
        Arrays.sort(arg);
        System.out.println("Maximum is " + arg[arg.length - 1]);
    }

    public static void main(String[] args) {
        testMax(10,20,30);
        testMax(12.3f,23.4f,34.5f);
        testMax("rahul","kundan","sahil");
        printMax(1,2,3,4,5,6,7,8,9,10);
    }
}
