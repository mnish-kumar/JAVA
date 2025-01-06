package Basics.LoopsDay12_16.java;

import java.util.Scanner;

public class Project_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //39- Automorphic number 5 = 25 = 625 = 390625, 6=36, 76 = 5776


        int number = scanner.nextInt();  //Ex-25
        int temp = number;
        int square = number * number;
        int c = 0;

        while (number != 0) {
            c++;
            number /= 10;
        }
        int ans = square % (int) Math.pow(10, c);
        System.out.println(ans == temp ? "Automorphic" : "Not morphic");
    }
}
