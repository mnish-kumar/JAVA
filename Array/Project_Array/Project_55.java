package Array.Project_Array;

import java.util.Scanner;

public class Project_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Question -> 55- Find the greatest element.
        //      {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index

        int[] arr = {2, 96, 69, 77, 145, 20};
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Maximum Element = " + max +  "\nFound at index = " + index);
    }
}
