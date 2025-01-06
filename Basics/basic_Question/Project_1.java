package Basics.basic_Question;
import java.util.Scanner;

public class Project_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Question-Accept the length and width of a rectangle. Calculate & print the area and perimeter.

        //Area: A = l × w, where l is the length and w is the width
        //Perimeter: P = 2(l + w)

        System.out.println("Enter the value of length");
        double l = scanner.nextDouble();

        System.out.println("Enter the value of width:");
        double w = scanner.nextDouble();

        double Area =l*w;
        double perimeter=2*(l + w);

        System.out.println(Area);
        System.out.println(perimeter);

    }
}
