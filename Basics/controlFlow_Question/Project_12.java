package Basics.controlFlow_Question;
import java.util.Scanner;

public class Project_12  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Question = 13. Accept the gender from the user as char and print the respective greeting message
        //Ex - Good Morning Sir (on the basis of gender)
        System.out.println("Enter your Gender:M/F");
        char gender=scanner.nextLine().charAt(0);
        if (gender == 'm'||gender== 'M'){
            System.out.println("Good Morning Sir 🙏.");
        } else if (gender == 'f' || gender == 'F') {
            System.out.println("Good Morning Ma'am 🙏 .");
        }else {
            System.out.println("Not Exist.");
        }
    }
}
