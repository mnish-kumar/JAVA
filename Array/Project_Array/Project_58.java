package Array.Project_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Project_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //58- Take n integer inputs from user and store them in an array.
        //Now, copy all the elements in an another array but in reverse order and print it.

        int[] array = {12, 34, 2, 3, 43};
        int[] temp = new int[array.length];

        int start = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            temp[start] = array[i];
            start++;
        }
        System.out.print("Reverse array is = ");
        System.out.println(Arrays.toString(temp));
    }
}
