package com.examples.youtube.ratan;

/**
 * Created by hadoop on 8/5/16.
 */
public class StaticExample {

    int a = 10;
    static int b= 20;

    public static void main(String[] args){
        StaticExample se = new StaticExample();
        System.out.println(se.a);
        System.out.println(se.b);
        se.a = 20;
        StaticExample.b = 999;

        // for static variables, only one memory will be allocated for multiple objects even.
        // for instance variables, multiple copies will be generated for multiple objects.
        StaticExample se1 = new StaticExample();
        System.out.println(se1.a);
        System.out.println(se1.b);

    }
}
