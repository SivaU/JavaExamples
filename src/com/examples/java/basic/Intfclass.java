package com.examples.java.basic;

/**
 * Created by hadoop on 30/4/16.
 */
public class Intfclass {
    public static void main(String args[]){
        testinf ob1 = new testinf();
        anotherclass ob2 = new anotherclass();
        absclass ob3 = new absclass() {
            @Override
            public void show() {
                System.out.println("This is strange");
            }
        };

        inhtclass ob4 = new inhtclass();

        sampleintf ref;

        ref = ob1;
        ref.show();

        ref = ob2;
        ref.show();

        ref = ob3;
        ref.show();

        ob3.show();
        ob3.display();

        ob4.display();

        ob3= ob4;
        ob3.display();

    }

}

interface sampleintf{
    void show();

}

class testinf implements sampleintf{
//    The method should be declared as public when implementing interface methods
    public void show(){
        System.out.println("This is an example for interface'");
    }

    void anothermethod(){
        System.out.println("This is another method");
    }

}

class anotherclass implements sampleintf{
    public void show(){
        System.out.println("This is inside another class interface example");
    }

    void testmethod(){
        System.out.println("This is test method");
    }
}

abstract class absclass implements sampleintf{
    void display(){
        System.out.println("This is an example of abstract with interface");
    }
}

class inhtclass extends absclass{

    public void show(){
        super.display();
        System.out.println("you are implmenting the interface method here");
    }

    void display(){
        System.out.println("This is super");
    }
}