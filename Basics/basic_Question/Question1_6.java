package Basics.basic_Question;

import java.util.Scanner;

public class Question1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Question_1 . Sum two integers
//        int a=scanner.nextInt();
//        int b=scanner.nextInt();
//        System.out.println("Value of a:" + a + " Value of b:" + b + " Total value=>" + (a+b));


        // Question_2 . Print the messege along with values and sum
        //	Ex - The sum of 45 & 12  = 57
//        int a=45 ,b=12;
//        System.out.println(a+b);


        //Question_3. Accept two integers from user and print the sum
        //	Ex - The sum of 45 & 12 = 57
//        int a=scanner.nextInt();
//        int b=scanner.nextInt();
//        System.out.println("Value of a:"+a+" Value of b:"+b+" Total=>"+(a+b));


        //Question_4. Accept the User's name, age and print in following manner
        //	Ex - Hello Shery, you are 12 years old.
//        System.out.println("Enter age:");
//        int age=scanner.nextInt();
//        System.out.println("Hello Shery , you are "+age+" years old.");


        //Question_5. Accept two numbers from user and swap their values
//        int a=10;
//        int b=11;
//        int temp=a;
//            a=b;
//            b=temp;
//        System.out.println("Swap= "+a+" "+b);


        // Question 6- Accept two numbers from user and swap their values
        //                Part 2 - Swap without using third variable

        int s = 5;
        int w = 6;
        s = s + w;
        w = s - w;
        s = s - w;
        System.out.println(s + " " + w);


    }
}
