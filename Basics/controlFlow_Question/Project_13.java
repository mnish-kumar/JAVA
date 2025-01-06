package Basics.controlFlow_Question;

import java.util.Scanner;
import java.util.Scanner;

public class Project_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Question = 15. Accept an integer and check whether it is an even number or odd.

        System.out.println("Enter value:");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number");
        }
    }
}
