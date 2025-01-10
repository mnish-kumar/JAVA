package String.String_Project;

import java.util.Scanner;

public class Project_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //72- Accept a string and print it in reverse order
        String Anything = sc.nextLine();

        for (int i = Anything.length() - 1; i >= 0; i--)
            System.out.print(Anything.charAt(i));

    }
}
