package Basics.controlFlow_Question;
import java.util.Scanner;

public class Project_17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Question 19.  Accept a year and check if it's a leap year or not (google to find out what's a leap year)
        //century year 00 - year % 400=0
        //not century - year % 4 ==0

        int year=2022;

        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("leap");
            }else {
                System.out.println("not leap");
            }

        } else if (year%4==0) {
            System.out.println("leap");
        }else {
            System.out.println("not leap");
        }
    }
}
