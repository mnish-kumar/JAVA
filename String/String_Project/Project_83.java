package String.String_Project;

import java.util.Arrays;
import java.util.Scanner;

public class Project_83 {
    public static void main(String[] args) {
        // 83- Sort the words of the sentence

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
