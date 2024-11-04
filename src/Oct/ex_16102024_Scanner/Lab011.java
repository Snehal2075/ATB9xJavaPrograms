package Oct.ex_16102024_Scanner;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print your name");
        String name = scanner.next();

        System.out.println("Print your age");
        int age = scanner.nextInt();

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary: " + salary);

        scanner.close();






    }
}
