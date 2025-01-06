package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.28- Factorial of a number. 4=1*2*3*4

        System.out.println("Enter value :");
        int number = scanner.nextInt();
        int Product = 1;
        for (int i = 1; i <= number; i++) {
            Product *= i;
        }
        System.out.println(Product);
    }
}
