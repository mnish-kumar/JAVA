package String.String_Project;

import java.util.Scanner;

public class Project_71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //71- Accept a string from user and print its each character on a new line

        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
