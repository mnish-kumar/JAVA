package Array.Project_Array;

import java.util.Scanner;

public class Project_69 {
    public static void main(String[] args) {
        //69- Leet code 1929 - Concatenation of array


        // kth max number
        int[] arr = {2, 3, 43, 233, 311};

        int max_number = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max_number) {
                third = second;
                second = max_number;
                max_number = arr[i];

            } else if (arr[i] > second && arr[i] < max_number) {
                third = second;
                second = arr[i];

            } else if (arr[i] > third && arr[i] < second)
                third = arr[i];
        }

        System.out.println(third);

    }
}
