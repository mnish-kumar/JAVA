package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //33- Write a program to take two inputs a, b & find the value of a  raised to the power of b.
        //Ex - a = 2, b = 5
        //OP - 2^5 = 32

        System.out.println("Enter value of a:");
        int a = scanner.nextInt();
        System.out.println("Enter value of b:");
        int b = scanner.nextInt();

//        System.out.println(Math.pow(a,b));     this way is simple

        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println(a + " to the power of " + b + " is = " + ans);
    }
}
