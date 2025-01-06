package Basics.Loops.java;

import java.util.Scanner;

public class second_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = 15;
//        int evensum = 0, oddsum = 0;
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 == 0) {
//                evensum = i++;
//            } else {
//                oddsum += i;
//            }
//        }
//        System.out.println("Sum of even = " + evensum + "\nSum of odd = " + oddsum);



        //Factor of numbers.
//        int n = 20;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//            }
//        }

        // int n=12; int sum=0; for; if n%i==0 -> sum=sum+i;
        // prime number => int count=0; s.out(count ==2 ? "prime" : "not prime")

        int a=2,b=5;
        int ans=1;
        for (int i=0; i<=b; i++){
            ans=ans*a;
        }
        System.out.println(ans);

    }
}
