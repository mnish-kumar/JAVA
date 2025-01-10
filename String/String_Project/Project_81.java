package String.String_Project;

import java.util.Arrays;

public class Project_81 {
    public static void main(String[] args) {

        // 81- Accept a string and print the frequency of each character present in the string

//        String Alphabet = "ababgzzsgchdtf";
//
//        int[] bitMap = new int[26];
         // a = 97 , A = 65 -> 97-65=32
//        for (char word : Alphabet.toCharArray())
//            bitMap[word - 97]++;

//        for (int i = 0; i < bitMap.length; i++) {
//            if (bitMap[i] != 0)
//                System.out.println((char) (i + 97) + " - " + bitMap[i]);
//        }


        // Method II
        String s = "tate";
        String s1 = "taste";

        char [] ch1 = s.toCharArray();
        char [] ch2 = s1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1.length == ch2.length ? "anagram" : "not");

    }
}
