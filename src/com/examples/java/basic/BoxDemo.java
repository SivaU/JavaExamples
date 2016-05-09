package com.examples.java.basic;

/**
 * Created by hadoop on 29/4/16.
 */
public class BoxDemo {
    public static void main(String args[]) {
        Box ob1 = new Box(10,20,30);
        Box ob3 = new Box(10,20,30);
        Box ob2 = new Box(ob1);
        Box ob4;
//        ob.depth = 10;
//        ob.height = 20;
//        ob.width = 30;

//        double vol = ob.volume(10,20,30);
        double vol1 = ob1.volume();
        double vol2 = ob2.volume();
//        ob4 = ob1.increment();
        System.out.println("Volume of the Box : " + vol1);
        System.out.println("Volume of the Box : " + vol2);
        System.out.println("equals" + ob1.equalTo(ob3));
//        System.out.println("Increment" + ob1.increment());
    }

}

class Box {
    double width;
    double height;
    double depth;
//    int a = 10;

    Box(Box ob1) {
        height = ob1.height;
        width = ob1.width;
        depth = ob1.depth;

    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    //    double volume(double h,double w,double d) {
//
//        height = h;
//        width = w;
//        depth = d;
//        double volume(double height,double width,double depth){
//            this.height = height;
//            this.width = width;
//            this.depth = depth;
//        double vol;
//    double volume(Box ob1) {
//        ob.height = height;
//        ob.width = width;
//        ob.depth = depth;
    double volume() {
        return height * depth * width;
    }
//        System.out.println("Volume of the Box : " + vol);

//    double volume(double x){
//        height = width = depth = x;
//        return height * depth * width;
//    }

    boolean equalTo(Box ob) {

        if (ob.height == height && ob.width == width & ob.depth == depth) return true;
        else
            return false;
    }
}
//        Box increment (){
//            Box temp = new Box(a+10);
//            return temp;
//        }
//    }


