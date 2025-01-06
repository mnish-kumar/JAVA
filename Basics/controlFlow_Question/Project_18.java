package Basics.controlFlow_Question;

import java.util.Scanner;

public class Project_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//         Question.20- Shop discount - Description on Graphic
//        0-5000=0%
//        5001-7000=10%
//        7001-10000=20%
//        >10000=30%


        double amt = 8000.0;
        if (amt > 0 && amt <= 5000) {
            System.out.println("Amount " + amt);
        } else if (amt > 5000 && amt <= 7000) {
            System.out.println("Amount after discount = " + amt * 0.9);
        } else if (amt > 7000 && amt <= 10000) {
            System.out.println("Amount after discount = " + amt * 0.8);
        } else {
            System.out.println("Amount after discount" + amt * 0.7);
        }
    }
}
