package Basics.basic_Question;

import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question =>12.Accept two numbers and print the greatest between them

        System.out.println("Enter the value of a:");
        int a=scanner.nextInt();

        System.out.println("Enter the value of b:");
        int b=scanner.nextInt();
        if (a>b){
            System.out.println("a greater than b:");
        }else {
            System.out.println("b is greater.");
        }


        //Question = 13. Accept the gender from the user as char and print the respective greeting message
//        //Ex - Good Morning Sir (on the basis of gender)
//        System.out.println("Enter your Gender:M/F");
//        char gender=scanner.nextLine().charAt(0);
//        if (gender == 'm'||gender== 'M'){
//            System.out.println("Good Morning Sir 🙏.");
//        } else if (gender == 'f' || gender == 'F') {
//            System.out.println("Good Morning Ma'am 🙏 .");
//        }else {
//            System.out.println("Not Exist.");
//        }


        //Question = 15. Accept an integer and check whether it is an even number or odd.
//        System.out.println("Enter value:");
//        int a =scanner.nextInt();
//
//        if (a%2==0){
//            System.out.println("Even Number.");
//        }else {
//            System.out.println("Odd Number");
//        }


        /* Question = 16.Accept name and age from the user. Check if the user is a valid voter or not.
        Valid - Hello Shery, You are a valid voter.
        Invalid - Sorry Shery, you can't vote.
        Part 2 - Print after how many years the user will be eligible */

//        System.out.println("Enter Your name:");
//        String name =scanner.nextLine();
//
//        System.out.println("Enter age:");
//        int age = scanner.nextInt();
//
//        if (age>=18){
//            System.out.println("Valid - Hello ," + name + " You are a valid voter.");
//        }
//        else if (age < 18) {
//            System.out.println("Invalid - " + name +" you can't vote.");
//        }
//        else {
//            System.out.println("Eligible for vote minimum 18 years.");
//        }


        //Question = 17. Accept a day number between 1-7 and print the corresponding dayname

//        System.out.println("Enter the number :");
//        int day=scanner.nextInt();
//        if (day==1){
//            System.out.println("Monday");
//        } else if (day==2) {
//            System.out.println("Tuesday");
//        }else if (day==2) {
//            System.out.println("Wednesday");
//        }else if (day==2) {
//            System.out.println("Thursday");
//        }else if (day==2) {
//            System.out.println("Friday");
//        }else if (day==2) {
//            System.out.println("Saturday");
//        }else if (day==2) {
//            System.out.println("Sunday");
//        }else {
//            System.out.println("Invalid.");
//        }

        //Question 18. Accept three numbers and print the greatest among them.

//        System.out.println("Enter a");
//        int a=scanner.nextInt();
//
//        System.out.println("Enter b:");
//        int b=scanner.nextInt();
//
//        System.out.println("Enter c:");
//        int c=scanner.nextInt();
//        if (a>b && a>c){
//            System.out.println("a is greater.");
//        } else if (b>a&&b>c) {
//            System.out.println("b is Greater");
//        }
//        else {
//            System.out.println("c is greater.");
//        }

        // Another method 18 no.question
//        int a=7,b=4,c=9;
//        int ans = a;
//        if (b>ans){
//            System.out.println(b);
//        }
//        if (c>ans){
//            System.out.println(c);
//        }


        //Question 19.  Accept a year and check if it's a leap year or not (google to find out what's a leap year)
        //century year 00 - year % 400=0
        //not century - year % 4 ==0

//        int year=2022;
//
//        if (year%100==0){
//            if (year%400==0){
//                System.out.println("leap");
//            }else {
//                System.out.println("not leap");
//            }
//        } else if (year%4==0) {
//            System.out.println("leap");
//        }else {
//            System.out.println("not leap");
//        }


        // Question.20- Shop discount - Description on Graphic
        //0-5000=0%
        //5001-7000=10%
        //7001-10000=20%
        //>10000=30%
//        double amt=8000.0;
//        if (amt > 0 && amt <= 5000){
//            System.out.println("Amount "+amt);
//        } else if (amt > 5000 && amt <= 7000) {
//            System.out.println("Amount after discount = " + amt * 0.9);
//        } else if (amt > 7000 && amt <= 10000) {
//            System.out.println("Amount after discount = " + amt * 0.8);
//        } else {
//            System.out.println("Amount after discount" + amt * 0.7);
//        }


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


//        //Question.22- Accept an english alphabet from user and check if it is a consonant or vowel;
//        System.out.println("Enter digit :");
//        char ch = scanner.nextLine().charAt(0);
//        if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//            System.out.println("Vowels ");
//        }else {
//            System.out.println("Consonant :");
//        }
    }
}
