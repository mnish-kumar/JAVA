package String.String_Project;

import java.util.Scanner;

public class Project_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //82- Check Two Strings are Anagram or Not
        //        Anagrams words have the same word length & same character count
        //        Examples of anagram words are arc and car, state and taste, night and thing etc.

        System.out.println("Enter the number: ");
        String s = sc.nextLine();
        System.out.println("Enter 2nd number: ");
        String s1 = sc.nextLine();

        if (s.length() != s1.length())
            System.out.println("Not anagrams.");

        else {
            boolean isAnagram = true;
            int[] arr = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char ch1 = s.charAt(i);
                char ch2 = s1.charAt(i);
                arr[ch1 - 97]++;
                arr[ch2 - 97]--;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    isAnagram = false;
                }
            }
            System.out.println(isAnagram ? "yes" : "not");
        }

    }
}
