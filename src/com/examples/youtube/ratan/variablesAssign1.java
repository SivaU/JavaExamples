package com.examples.youtube.ratan;

/**
 * Created by hadoop on 8/5/16.
 */
public class variablesAssign1 {

    int a = 10;
    int b = 20;

    static void m1(){
        variablesAssign1 ob = new variablesAssign1();
        System.out.println(ob.a);
        System.out.println(ob.b);

    }// method completed,object destroyed, hence create a new object in m2

    static void m2(){
        variablesAssign1 ob1 = new variablesAssign1();
        System.out.println(ob1.a);
        System.out.println(ob1.b);

    }
    public static void main(String[] args){
        variablesAssign1.m1();
        variablesAssign1.m2();

    }
}
