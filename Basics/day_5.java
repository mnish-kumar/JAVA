package Basics;

import java.util.Scanner;

public class day_5 {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);


        // isme space diye to ek hi baar me  a aur b ki value add ho jayega.

//        System.out.println("Enter the value of a->");
//        int a=mk.nextInt();
//        System.out.println("Enter the value of b->");
//        int b=mk.nextInt();
//        System.out.println("Total value:"+(a+b));


        // Isme dummy data bhi collect hoga like  space and other type of dummy data
//          String a=mk.nextLine();
//          String b =mk.nextLine();
//          System.out.println("Data->"+a+b);


        System.out.println("Enter age:-");
        int age = mk.nextInt();
        System.out.println("Enter name");
        String name = mk.nextLine();
        System.out.println("Hello Ji " + "Your name is " + name + " and your age is" + age);
    }
}
