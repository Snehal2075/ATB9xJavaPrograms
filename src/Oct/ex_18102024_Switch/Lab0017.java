package Oct.ex_18102024_Switch;

import java.util.Scanner;

public class Lab0017 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Options to convert units");
        System.out.println("1 : Kilometers to Miles");
        System.out.println("2 : Fahrenheit to Celsius");
        System.out.println("Enter your choice between 1 and 2");
        int choice = scanner.nextInt();

        switch(choice) {

            // Kilometers to Miles conversion

            case 1:
                System.out.print("Enter distance in kilometers:");
                double kilometers = scanner.nextDouble();
                double miles = kilometers * 0.621371;
                System.out.printf("%.2f kilometers is %.2f miles.%n", kilometers, miles);
                break;

            case 2:
                System.out.println("Enter distance in kilometers");
                double Fahrenheit = scanner.nextDouble();
                double  Celsius =  (Fahrenheit - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", Fahrenheit, Celsius );
                break;

            default:
                System.out.println("Please Choice only between 1 and 2");

        }
             }





        }



