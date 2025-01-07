package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Build_Array {
    public static void main(String[] args) {
        // build an array
//        int[] arr = {1, 2, 1};
//        int n = arr.length;
//        int[] ans = new int[2 * n];

//
//        for (int i = 0; i < arr.length; i++) {
//            ans[i] = arr[i];
//            ans[i + n] = arr[i];
//        }
//        System.out.println(Arrays.toString(ans));

        int[][] arr = new int[3][];
//        arr[0]=new int[3];
//        arr[1]=new int[2];
//        arr[2]=new int[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // for printing
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
