package Array.Project_Array;

import java.util.Scanner;

public class Project_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question-> 62- Linear Search an array - If element found print the index else -1

        int[] array = {1, 21, 3, 23, 423, 44};
        System.out.println("Enter the target which value is present in array :");
        int Target = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Target) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
