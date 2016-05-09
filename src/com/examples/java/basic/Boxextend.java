package com.examples.java.basic;

import sun.awt.image.ShortInterleavedRaster;

/**
 * Created by hadoop on 29/4/16.
 */
public class Boxextend {
    public static void main(String args[]){
        BoxShipment ob1 = new BoxShipment(1,2,3,4,5);
        BoxColor ob3 = new BoxColor(10,5);
        BoxWeight ob2;
        ob2 = ob3;
        double vol = ob2.volume();
        System.out.println("ob3.volume: " + vol) ;

        ob2 = ob1;
        ob2.volume();
        System.out.println("ob1.volume: " + ob2.volume()) ;

        System.out.println("Volume : " + ob1.volume());
        System.out.println(ob1.middleVolume());
        System.out.println(ob1.totalVolume());

    }

}

class BoxWeight{
    double height;
    double width;
    double depth;

    BoxWeight(){
      height = 0;
      width = 0;
      depth = 0;
  }
    BoxWeight(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }

    BoxWeight(double l){
        height = width = depth = l;
    }

    double volume(){
        System.out.println("Inside BoxWeight");
        return height * width * depth;
    }


}

class BoxColor extends BoxWeight{
    double color;

    BoxColor(){
        super();
        color = 0;
    }

    BoxColor(double h,double w, double d, double c){
        super(h,w,d);
        color = c;
    }

    BoxColor(double l,double c){
        super(l);
        color = c;
    }
    double middleVolume(){
        return height * width * depth * color;
    }

    double volume(){
        System.out.println("Inside BoxColor");
        return height * width * depth * color;
    }
}

class BoxShipment extends BoxColor{
    double Shipment;

    BoxShipment(){
        super();
        Shipment = 0;
    }

    BoxShipment(double h, double w, double d, double c, double s){
        super(h,w,d,c);
        Shipment = s;
    }

    BoxShipment(double l, double c,double s){
        super(l,c);
        Shipment = s;
    }

    double totalVolume(){
        return height * width * depth * color * Shipment;
    }

    double volume(){
        return height * width * depth * color * Shipment;
    }
}