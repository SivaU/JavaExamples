package com.examples.java.basic;

/**
 * Created by hadoop on 30/4/16.
 */
public class AbstractClass {
    public static void main(String args[]) {
        demoAbs ob = new demoAbs();
        ob.sample();
        ob.samplePrint();


    }
}

abstract class AbstractDemo {

    abstract void sampleprint();

    void testprint() {
        System.out.println("This is for sample print");
    }
}

class demoAbs extends AbstractClass {

    void sample() {
        System.out.println("This is for sample demo");
    }

    void samplePrint(){
        System.out.println("Finally you are declaring abstract here");
    }
}



