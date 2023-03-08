package com.genericmaximumvalue;

public class GenericMax {
    static void testMax(Integer a, Integer b, Integer c) {
        Integer maximum = 0;
        if (a.compareTo(maximum) > 0) {
            maximum = a;
        } if (b.compareTo(maximum) > 0) {
            maximum = b;
        } if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is " + maximum);
    }

    public static void main(String[] args) {
        Integer a =50 ,b = 40, c = 30;
        GenericMax.testMax(a,b,c);
    }
}
