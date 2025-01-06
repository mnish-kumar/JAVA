package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.32- Check if the number is Prime or not.
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count == 2 ? "prime" : "not prime");
    }
}
