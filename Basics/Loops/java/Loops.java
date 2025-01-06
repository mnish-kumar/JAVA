package Basics.Loops.java;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int i;
//        for (int i=0; i<5; i++){
//            System.out.println(i);
//        }



        //for(; ;s.out); kuch print karane ke liye.
        //  for?(; ;); for empty



//        int n = 8;
//        byte b = (byte) n;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("even");
            } else System.out.println("odd");
        }


    }
}
