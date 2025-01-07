package Array.Project_Array;

import java.util.Arrays;

public class Project_66 {
    public static void main(String[] args) {

        //66-> Print the count of sub-arrays whose sum is equal to the target.
        //Ex - {1,2,3,7,5}, T = 12  O/P - 2 - [ {2,3,7}, {7,5} ] - Both the sub-arrays has sum(7+5)=12

        int[] arr = {1, 2, 3, 7, 5};
        int Target = 12;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == Target)
                    count++;
            }
        }
        System.out.println("Final count of sub arrays = " + count);
    }
}
