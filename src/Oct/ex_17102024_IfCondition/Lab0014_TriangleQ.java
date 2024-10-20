package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab0014_TriangleQ {
    public static void main(String[] args) {

        // Classify the Triangle on basis of its side lengths

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the value of side2");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the value of side3");
        double side3 = scanner.nextDouble();

        if(side1==side2 && side2==side3) {
            System.out.println("It is equilateral Triangle");

        } else if (side1==side2 && side2!=side3) {
            System.out.println("It is Isoceles Triangle");

        }else
            System.out.println("It is Scalene Triangle");

        scanner.close();



    }
}
