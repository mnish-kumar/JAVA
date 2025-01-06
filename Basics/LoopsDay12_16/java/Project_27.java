package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.27- Sum up to n terms.
        System.out.println("Enter value of sum = ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Total sum is = " + sum);
    }
}
