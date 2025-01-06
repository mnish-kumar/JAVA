package Basics.controlFlow_Question;

import java.util.Scanner;

public class Project_19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Question 21- Electric Bill - Description on Graphic
        //Up to 100 units = Rs 4.2/unit
        //101 - 200 units = Rs 6/unit
        //201 - 400 units = Rs 8/unit
        //more than 400 units = Rs 13/unit

        System.out.println("Enter consume units :");
        double units = scanner.nextInt();
        double bill = 0;

        if (units > 400) {
            bill += (units - 400) * 13;
            units = 400;
        }
        if (units >= 201 && units <= 400) {
            bill += (units - 200) * 8;
            units = 200;
        }
        if (units >= 101 && units >= 200) {
            bill += (units - 100) * 6;
            units = 100;
        }
        bill += units * 4.2;
        System.out.println(bill);

    }
}
