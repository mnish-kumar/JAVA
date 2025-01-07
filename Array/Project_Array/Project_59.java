package Array.Project_Array;

import java.util.Arrays;

public class Project_59 {
    public static void main(String[] args) {

        //59- Array left Rotation by 1

        int array[] = {1, 2, 3, 4, 5};

        // Take first element
        int temp = array[0];

        // shift an array
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // put the first element in last
        array[array.length - 1] = temp;

        System.out.println(Arrays.toString(array));
    }
}
