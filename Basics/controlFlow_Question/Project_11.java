package Basics.controlFlow_Question;

import java.util.Scanner;

import java.util.Scanner;

public class Project_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question =>12.Accept two numbers and print the greatest between them

        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a greater than b:");
        } else {
            System.out.println("b is greater.");
        }

    }
}
