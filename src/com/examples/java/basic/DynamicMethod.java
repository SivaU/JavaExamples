package com.examples.java.basic;

/**
 * Created by hadoop on 29/4/16.
 */
public class DynamicMethod {
    public static void main(String args[]){
        A a = new A();
        a.show();;
        B b = new B(10,20);
        C c = new C();

        A ref;

        ref = b;
        ref.show();

        ref = c;
        c.show();
    }
}

class A{

    int i;

    void show(){
        System.out.println("Inside class A");
    }
}

class B extends A{

    int i;

    B(int a, int b){
    super.i = a;
        i = b;
    }

    void show(){
        super.show();
        System.out.println("Inside class B");
    }
}

class C extends A{
    void show(){
        super.show();
        System.out.println("Inside class C");
    }
}
