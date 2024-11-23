package Nov.ex_20112024;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab052_ArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList <String> names = new ArrayList <>();
        ArrayList < Integer> ages = new ArrayList<>();

        String continueInput  =  "Y";
         while (continueInput.equalsIgnoreCase("Y")) {

             System.out.println("Enter name: ");
             String name = scanner.nextLine();
             names.add(name);

             System.out.println("Enter age:  ");
             Integer age = scanner.nextInt();
             ages.add(age);


             scanner.nextLine();

             System.out.println("Do you want to enter another record Y/N:  ");
             continueInput = scanner.nextLine();

         }

             // Displaying the collected data

             System.out.println("\nNames:  " + names);
             System.out.println("Ages:   "+ ages);


         }



    }

