package Basics.controlFlow_Question;

import java.util.Scanner;

public class Project_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Question 18. Accept three numbers and print the greatest among them.

        System.out.println("Enter a");
        int a = scanner.nextInt();

        System.out.println("Enter b:");
        int b = scanner.nextInt();

        System.out.println("Enter c:");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater.");
        } else if (b > a && b > c) {
            System.out.println("b is Greater");
        } else {
            System.out.println("c is greater.");
        }
    }
}
