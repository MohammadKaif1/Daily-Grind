package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//
//        double d= scan.nextDouble();
//
//        String s = scan.next();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int:" +i);



                // Declare the object and initialize with
                // predefined standard input object

        int overFlow = 2147483647;
        int UnderFlow = -2147483648;
        System.out.println("Overflow :" + (overFlow+1));
        System.out.println("UnderFlow :"+ (UnderFlow-1));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
//        String s = "Kaif ";
//        System.out.printf(s);





Scanner in = new Scanner (System.in);
fun("kaif","faiz","alina");
multiple(2,3,"hello","kaif","arish","world");

    }

     static void multiple(int a,int b,String...l) {
         System.out.println(Arrays.toString(l));
    }

    /*Variable Length Arguments
    length of arguments will vary.
    */
    static void fun(String...name)
    {
        System.out.println(Arrays.toString(name));
    }


}
