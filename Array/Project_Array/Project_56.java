package Array.Project_Array;

import java.util.Scanner;

public class Project_56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question -> 56- Find the second greatest element
        // {2, 96, 69, 77, 145, 20} = Second greatest element = 96

        int[] arr = {2, 96, 96, 69, 77, 145, 20};
        int second_max = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        // traverse the all elements which is max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] < max)
                second_max = arr[i];
        }
        System.out.println("Second Maximum Elements = " + second_max);
    }
}