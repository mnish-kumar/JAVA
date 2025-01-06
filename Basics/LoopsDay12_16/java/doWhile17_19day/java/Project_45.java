package Basics.LoopsDay12_16.java.doWhile17_19day.java;

import java.util.Locale;
import java.util.Scanner;

public class Project_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question.45- Project Restaurant v 1.0

        System.out.println("Welcome to our restaurant...☺️ \n");
        int serve;
        int Indian, Italian, South_Indian;
        int Bill = 0;

        do {
            System.out.println("Here's our menu: ");
            System.out.println("1. Indian");
            System.out.println("2. Italian");
            System.out.println("3. South_Indian");
            System.out.println("4. Nothing order.");
            System.out.println("5. Exit to restaurant");
            serve = scanner.nextInt();

            if (serve >= 1 && serve <= 4) {

                switch (serve) {
                    case 1 -> {
                        System.out.println("(i) Biryani - ₹50 \n(ii) Pani Puri -₹10 \n(iii) Samosa - ₹10");
                        Bill += 50 + 10 + 10;
                    }
                    case 2 -> {
                        System.out.println("(i) Pizza Margherita - ₹60 \n(ii) Pasta Carbonara - ₹70\n(iii) Risotto - ₹35");
                        Bill += 60 + 70 + 35;
                    }
                    case 3 -> {
                        System.out.println("(i) Idli - ₹59 \n(ii) Dosa -₹48 \n(iii) Biryani - ₹50");
                        Bill += 59 + 48 + 50;
                    }
                    case 4 -> {
                        System.out.println("Not order something. Enjoy the couples of time.\n" +
                                "If you wish, you can place an order by pressing 6.");
                        if (serve == 4)
                            System.exit(0);
                    }
                }
                ;
            } else if (serve == 5) {
                System.out.println("Thank You 🙏 for visiting Restaurant...");
            } else {
            System.out.println("Invalid option choose again,Thank you.");
             }
            System.out.println("Your bill is = " + Bill + "\n");

        } while (serve != 5);

    }
}
