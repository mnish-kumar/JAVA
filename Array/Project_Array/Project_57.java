package Array.Project_Array;

import java.util.Scanner;

public class Project_57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //57- Check if array is sorted in increasing order or not.
        //       Ex 1 - { 1, 5, 8,  9, 10, 15 } - OP = "YES"
        //       Ex 2 - { 1, 8, 6, 9, 10, 15 } - OP = "NO"

        System.out.println("Enter size of an array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean isSorted = true;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " elements");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Increasing order" : "Not Increasing order");

    }
}
