package Array.Project_Array;

public class Project_63 {
    public static void main(String[] args) {

        //63 -> Binary Search. If element found print the index else -1

        int[] array = {21, 23, 43, 53, 234, 542};
        int target = 23;
        int ans = -1;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid_Element = (start + end) / 2;
            if (array[mid_Element] == target) {
                ans = mid_Element;
                break;
            } else if (array[mid_Element] > target)
                end = mid_Element - 1;
             else
                 start = mid_Element + 1;
        }
        System.out.println(ans);
    }
}
