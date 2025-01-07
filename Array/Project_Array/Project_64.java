package Array.Project_Array;

import java.util.Arrays;

public class Project_64 {
    public static void main(String[] args) {

        // 64-> Bubble Sort.


        int[] array = {8, 4, 2, 9, 7, 10};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
