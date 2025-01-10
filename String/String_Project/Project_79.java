package String.String_Project;

import java.util.Scanner;

public class Project_79 {
    public static void main(String[] args) {
        // 79- Extend the prev question and capitalize first & last character of each word in the sentence and print the new sentence
        //      Ex - 	Hello bhai Kaise ho a
        //	HellO BhaI KaisE HO A


        String s = "Hello bhai Kaise ho a";
        String[] words = s.split(" ");
//        String ans = "";
//
//        for (String word : words) {
//            String temp = "";
//            if (word.length() <= 2) {
//                temp += word.toUpperCase();
//            } else {
//                temp += Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length() - 1) +
//                        Character.toUpperCase(word.charAt(word.length() - 1));
//            }
//            ans += temp + " ";
//        }
//        System.out.println(ans.trim());


        for (String word : words){
            String temp = "";
            if (word.length() <= 2){
                temp += word.toUpperCase();
            }
            else{
                temp += word.substring(0,1).toUpperCase() + word.substring(1,word.length()-1).toLowerCase() + Character.toUpperCase(word.charAt(word.length()-1));
            }
            System.out.print(temp + " ");
        }

    }
}
