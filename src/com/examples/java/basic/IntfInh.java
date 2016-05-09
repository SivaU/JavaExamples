package com.examples.java.basic;

/**
 * Created by hadoop on 1/5/16.
 */
public class IntfInh {
    public static void main(String args[]){
        test3 ob1 = new test3();
        ob1.test1show();
        ob1.test2show();
        ob1.test1display();

        test1 ob2 = new test1() {
            @Override
            public void test1show() {
                System.out.println("This is overriding default method");
            }
        };

        test1.test1static();
        ob2.test1show();
    }
}

interface test1{
    void test1show();
    default void test1display(){
        System.out.println("Inside default method");
    }
    static void test1static(){
        System.out.println("Inside static method");
    }
}

interface test2 extends test1{
    void test2show();
}

class test3 implements test2{
    public void test2show(){
        System.out.println("This is for test2 show");
    }

    public void test1show(){
        System.out.println("This is for test1 show");
    }

//    public void test1display(){
//        System.out.println("Default method overriding");
//    }
}