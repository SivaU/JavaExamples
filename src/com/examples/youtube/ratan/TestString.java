package com.examples.youtube.ratan;

/**
 * Created by hadoop on 7/5/16.
 */
public class TestString {



    public static void main(String args[]){

        TestString ob1 = new TestString();
        System.out.println(ob1);

        String s1 = "Siva";
        String s2 = new String("Krishna");
        String s3 = "Siva";
        System.out.println(s3.concat("Krishna"));

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        StringBuffer sb1 = new StringBuffer("Ummaleti");
        StringBuffer sb2 = new StringBuffer("Ummaleti");
        System.out.println(sb2.append("siva"));

        System.out.println(sb1);
        System.out.println(sb1 == sb2);

    }
}
