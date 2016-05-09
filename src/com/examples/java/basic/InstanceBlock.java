package com.examples.java.basic;

/**
 * Created by hadoop on 5/5/16.
 */
public class InstanceBlock {
    public static void main(String args[]){
        instA ob1 = new instA();
        instA ob2 = new instA();
//        new instA(10,20);

    }
}

class instA{

    instA(){
        this(10,20);
        System.out.println("Inside 1 arg constructor");
    }
    instA(int A, int B){
        System.out.println("Inside 2 arg constructor");
    }
    {
        System.out.println("Inside 1- instance bolck");
    }
    {
        System.out.println("Inside 2- instance block");
    }
}