package Basics;

import java.util.Scanner;


public class day_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//       System.out.println("ata".charAt(0));
        // print char using input method
        // System.out.println(9.9%3.3);

        //! exlamation
        //~ ->tilda -> bits  ki value ko  change  kar deta hai like  0000 0000 -> 1111 1111
        //^ ->same rahega to 0 warna  1
        // <<  -> multiply by 2.
        //  >> -> divide  by 2.

        // Unary Operator => ++, --


        int a = 10;
        //System.out.println(++a);  // Pre increment->Pahle increment  phir use
        //System.out.println(a++); // Post increment -> Phle use  phir increment
        //System.out.println(a);


        // System.out.println(--a); // phle decrement  phir  use
        //System.out.println(a--);  // Phle use  phir decrement
        // System.out.println(a);


        // Math Class -> it is inside the java.lang
        System.out.println(Math.cbrt(a));

    }
}
