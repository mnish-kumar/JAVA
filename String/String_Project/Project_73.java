package String.String_Project;

import java.util.Arrays;
import java.util.Scanner;

public class Project_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //73- Check if the string is Palindromic or not
        System.out.println("Enter the String, then i check palindrome or not : ");
        String PalindromeCheck = sc.nextLine();
        String reverse = "";

        for (int i = PalindromeCheck.length() - 1; i >= 0; i--)
            reverse = reverse + PalindromeCheck.charAt(i);

        System.out.println(reverse.equals(PalindromeCheck) ? "Palindrome" : "Not Palindrome");
    }
}
