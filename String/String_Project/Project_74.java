package String.String_Project;

import java.util.Arrays;

public class Project_74 {
    public static void main(String[] args) {

        //74- Palindromic String using method and Two pointer algorithm (hint: Array reverse algo)
        String name = "aba";
        char convert[] = name.toCharArray();

        int i = 0, j = convert.length - 1;
        while (i < j) {
            char temp = convert[i];
            convert[i] = convert[j];
            convert[j] = temp;
            i++;
            j--;
        }
        //   System.out.println(Arrays.toString(convert));

        // Here convert Array to String
        String rev = new String(convert);
        System.out.println(rev.equals(name) ? "Yes" : "no");

    }
}
