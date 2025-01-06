package Basics.Loops.java;

import java.util.Scanner;

public class Switch_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //weekend days print thorough switch method. switch as expression ek line return hoga primary already jab rutrn n karaye otherwise {}use
        int day = 1;
        String dayName = switch (day) {

            case 1 -> {
                System.out.println("extra task");
                yield "monday";
            }
            case 2 -> "Tuesday";

            case 3 -> "Wednesday";

            default -> { // it is mandatory
                yield "wrong input";
            }

        };
        System.out.println(dayName);




//        char ch= scanner.next().charAt(0);
//        switch (ch){
//            case 'a','e','i','o','u' -> System.out.println("vowel ");
//            default -> System.out.println("consonant");
//        }



    }
}
