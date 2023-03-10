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
    @SafeVarargs
    public static <E> E getMaxMoreThanThree(E x, E... arg) {
        Arrays.sort(arg);
        return arg[arg.length - 1];
    }

    public static void main(String[] args) {
        testMax(10,20,30);
        testMax(12.3f,23.4f,34.5f);
        testMax("rahul","kundan","sahil");
        System.out.println("maximum is " + getMaxMoreThanThree(4,5,6,8,12,45,31));
    }
}
