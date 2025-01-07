package Array.Project_Array;

import java.util.Arrays;

public class Project_70 {

    public static int Permutation(int nums[], int ans[]) {
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return Permutation(nums, ans);
    }

    public static void main(String[] args) {

        // 70- Leet code 1920 - Build Array from Permutation

        int[] nums = {0, 2, 1, 5, 3};
        int[] ans = new int[nums.length];
        Permutation(nums,ans);
    }
}
