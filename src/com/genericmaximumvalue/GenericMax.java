package com.genericmaximumvalue;

public class GenericMax <generics extends Comparable<generics>>{

    generics s,t,r;

    public GenericMax(generics s, generics t, generics r) {
        this.s = s;
        this.t = t;
        this.r = r;
    }


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

    public static void main(String[] args) {
//        Character xch ='a',ych ='b',zch ='c';
        testMax(10,20,30);
        testMax(12.3f,23.4f,34.5f);
        testMax("rahul","kundan","sahil");
//        GenericMax.testMax(xch,ych,zch);
    }
}
