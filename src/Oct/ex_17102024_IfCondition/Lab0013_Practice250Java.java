package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab0013_Practice250Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score(0-100)");

        int score = scanner.nextInt();

        char grade;

        if (score <= 100 && score >=90) {
            System.out.println("The grade is A");

        } else if (score <= 89 && score >= 80) {
            System.out.println("The grade is B");

        } else if (score <= 79 && score >= 60) {
            System.out.println("The grade is C");

        } else if (score <= 59 && score >= 50) {
            System.out.println("The grade is D");

        } else
        {
            System.out.println("The grade is F");

            System.out.println("The letter grade is + :" + score );
        }
        scanner.close();


        }
    }

