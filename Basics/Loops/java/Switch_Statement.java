package Basics.Loops.java;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = 1;
        switch (day) {


//            case 4 ->{  curly bracket me multiple line likh sakte hai
//                System.out.println("friday");
//                System.out.println("hello");
//            }


            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Wrong input");
        }


    }
}
