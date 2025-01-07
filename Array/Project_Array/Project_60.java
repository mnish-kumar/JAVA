package Array.Project_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Project_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question -> 60. Array left rotation by K elements

        int[] array = {1, 2, 3, 4, 5};

        int m = 2;
        m = m % array.length;

        for (int i = 1; i <= m; i++) {

            int temp = array[0];
            for (int k = 1; k < array.length; k++) {
                array[k - 1] = array[k];
            }
            array[array.length - 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
