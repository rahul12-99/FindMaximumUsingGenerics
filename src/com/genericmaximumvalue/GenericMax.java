package com.genericmaximumvalue;

public class GenericMax {
    public static <generics extends Comparable<generics>> generics testMax(generics a,generics b, generics c) {
        generics maximum = a;
        if (b.compareTo(maximum) > 0) {
            maximum = b;
        }
        if (c.compareTo(maximum) > 0) {
            maximum = c;
        }
        System.out.println("Maximum is " + maximum);
        return maximum;
    }

    public static void main(String[] args) {
//        Character xch ='a',ych ='b',zch ='c';
        testMax(10,20,30);
        testMax(12.3f,23.4f,34.5f);
        testMax("rahul","kundan","sahil");
//        GenericMax.testMax(xch,ych,zch);
    }
}
