package Basics.LoopsDay12_16.java.doWhile17_19day.java;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Project_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double num1, num2, result;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiply");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice between (1-5) ");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter first number:");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();


                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result" + num1 + " and" + num2 + "= " + result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result " + num1 + " * " + num2 + " = " + result);
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;   //system.exit(status:0) program ko rokne ke liye and loop rokne ke liye break
                }
            } else if (choice == 5) {
                System.out.println("Exiting the calculator.");
            } else {
                System.out.println("invalid choice! please select valid choice.");
            }
        } while (choice != 5);


    }
}
