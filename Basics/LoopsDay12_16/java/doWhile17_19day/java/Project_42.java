package Basics.LoopsDay12_16.java.doWhile17_19day.java;

import java.util.Scanner;

public class Project_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Question. 42- Print Weekday using Switch

        System.out.println("Enter the number which days print.");
        int day = scanner.nextInt();

        // This is latest version of java, in switch method.

//        String day_name = switch (day) {
//            case 1 -> "Monday";
//
//            case 2 -> "Tuesday";
//
//            case 3 -> "Wednesday";
//
//            case 4 -> "Thursday";
//
//            case 5 -> "Friday";
//
//            case 6 -> "Saturday";
//
//            case 7 -> "Sunday";
//
//            default -> {
//                yield "wrong input.";
//            }
//        };
//        System.out.println(day_name);





        // This method is old so, java is better than break method again and again used upper method.

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Default input.");
                break;
        }

    }
}
