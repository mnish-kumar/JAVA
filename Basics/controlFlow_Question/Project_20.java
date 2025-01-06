package Basics.controlFlow_Question;

import java.util.Scanner;

public class Project_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question.22- Accept an english alphabet from user and check if it is a consonant or vowel;


        System.out.println("Enter digit :");
        char ch = scanner.nextLine().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowels ");
        } else {
            System.out.println("Consonant :");
        }
    }
}
