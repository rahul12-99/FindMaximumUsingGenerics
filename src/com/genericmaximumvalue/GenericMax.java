package com.genericmaximumvalue;

public class GenericMax {
    public static void testMax(Float x, Float y, Float z) {
        Float maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        System.out.println("Maximum is " + maximum);
    }

    public static void main(String[] args) {
        GenericMax.testMax(23.5f,54.6f,55.6f);
    }
}
