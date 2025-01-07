package Array.Project_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Project_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 61- Array Reverse Without Using Extra space.
        int array[] = {1, 2, 3, 4, 5};
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
    }
}
