package Basics.Loops.java;

import java.util.Scanner;

public class third_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        int n = 548;
//        while (n != 0) {
//            //rem
//            int rem = n % 10;
//            //task
//            System.out.println(rem);
//
//            //reduction
//            n = n / 10;
//        }

//        int n = 548;
//        int sum = 0;
//        while (n != 0) {
//            //rem
//            int rem = n % 10;
//            //task
//            sum = sum + rem;
//
//            //reduction
//            n = n / 10;
//        }
//        System.out.println(sum);


//        int n = 548;
//        int sum = 0;
//        while (n != 0) {
//            //rem
//            int rem = n % 10;
//            //task
//            sum = sum * 10 + rem;
//
//            //reduction
//            n = n / 10;
//        }
//        System.out.println(sum);
        // sidha wala print karna hai

//        int n = 121;
//        int sum = 0;
//        int temp = n;
//        while (n != 0) {
//            //rem
//            int rem = n % 10;
//            //task
//            sum = sum * 10 + rem;
//            //reduction
//            n = n / 10;
//        }
//        System.out.println(sum == temp ? "Palindrome" : "Not palindrome");


        //strong number = per digit seperate factorial
//        int n = 145;
//        int sum = 0;
//        int temp = n;
//        while (n != 0) {
//            int rem = n % 10;
//            int fact = 1;
//            for (int i = 1; i <= rem; i++)
//                fact *= i;
//
//            //sum
//            sum = sum + fact;
//            n = n / 10;
//        }
//        System.out.println(sum == temp ?
//                "Strong" : "Weak");


        //Automorphic number
//
//        int n = 25;
//        int temp = n;
//        int sq = n * n; // 625
//        int c = 0;
//        while (n != 0) {
//            c++;
//            n /= 10;
//        }
//
//        int ans = sq%(int)Math.pow(10,c);
//        System.out.println(ans == temp ? "auto" : "not");

        //start
        int i = 1;
        do {
            System.out.println("hello");
            i++;
        } while (i <= 5);// ek bar chalta hi hai condition true ho ya false

    }
}
