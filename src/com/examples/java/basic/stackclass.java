package com.examples.java.basic;

/**
 * Created by hadoop on 1/5/16.
 */
public class stackclass {
    public static void main(String args[]){
    int i;
        stck ob1 = new stck(5);
        for(i=0;i< 10;i++) ob1.push(i);
        for (i=0;i<10;i++)
            System.out.println(ob1.pop());
    }
}

interface stack{
    void push(int item);
    int pop();
}

class stck implements stack{

    private int stk[];
    private int tos;
    private int i;

    stck(int size){
    stk = new int[size];
    tos = -1;

    }
    public void push(int item){
        if(tos == stk.length -1){
            int tmp[] = new int[stk.length *2];
            for(i=0;i<stk.length;i++) tmp[i] = stk[i];
            stk = tmp;
            System.out.println(stk);
            stk[++tos] = item;
        }

//            System.out.println("Stac is full");
        else
            stk[++tos] = item;
    }

    public int pop(){
        if(tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stk[tos--];

    }
}
