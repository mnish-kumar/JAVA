package String.String_Project;

import java.util.Scanner;

public class Project_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 80- 2114. Maximum Number of Words Found in Sentences
        String[] s = {"this is great thanks very much", "hello", "bye boys"};

        int max = Integer.MIN_VALUE;
        for (String words : s) {
            int length = words.split(" ").length;
            max = Math.max(length, max);
        }
        System.out.println("Maximum number of words in sentence is : " + max);

    }
}
