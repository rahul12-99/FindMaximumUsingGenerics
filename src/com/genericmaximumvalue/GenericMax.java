package com.genericmaximumvalue;

public class GenericMax {
    public static void testMax(String x, String y, String z) {
        String maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        System.out.println("Maximum is " + maximum);
    }

    public static void main(String[] args) {
        GenericMax.testMax("Apple", "Peach", "Banana");
    }
}
