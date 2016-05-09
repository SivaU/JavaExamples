package com.examples.youtube.ratan;

/**
 * Created by hadoop on 8/5/16.
 */
public class variablesAssign2 {

    int a = 10;
    int b = 20;

    static int c = 30;
    static int d = 40;

    void m3(){
        System.out.println(a);
        System.out.println(b);

        System.out.println(variablesAssign2.c);
        System.out.println(variablesAssign2.d);
    }

    static void m4(){
        variablesAssign2 ob4 = new variablesAssign2();
        System.out.println(ob4.a);
        System.out.println(ob4.b);

        System.out.println(variablesAssign2.c);
        System.out.println(variablesAssign2.d);
    }
    public static void main(String[] args){
        // you can create same object also 'ob4' since it will be destroyed after the method ends
        variablesAssign2 ob5 = new variablesAssign2();
        ob5.m3();
        variablesAssign2.m4();

    }
}
