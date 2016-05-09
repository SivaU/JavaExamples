package com.examples.java.basic;

/**
 * Created by hadoop on 2/5/16.
 */
public class varargs {
    static void testvar(int ...v){
        System.out.println("There are " + v.length + "no.of arguments");

        for (int x:v)
            System.out.println("Contents :" + x);
    }

    static void testvar(boolean ...v){
        System.out.println("There are " + v.length + "no.of arguments");

        for (boolean x:v)
            System.out.println("Contents :" + x);
    }

    static void testvar(double i,int ...v){
        System.out.println("There are " + v.length + "no.of arguments");

        for (int x:v)
            System.out.println("Contents :" + x);
    }

    public static void main(String args[]){
        testvar(1,2,3);
        testvar(true,false,true);
        testvar(4.5,3);

    }
}
