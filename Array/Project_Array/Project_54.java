package Array.Project_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Project_54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //question -> 54- Accept size n from user and create a n size array then take n inputs into the and finally
        //    Print the sum & Avg of all elements.

        System.out.println("Enter size of an array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Value of an array
        System.out.println("Enter " + size + " value of an array. \n");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " element,");
            array[i] = scanner.nextInt();
        }

        // Print value of array.
        System.out.println("Elements of an array = " + Arrays.toString(array));


        // SUM of array value
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of array = " + sum);
        System.out.println("Average = " + sum / size);
    }
}
