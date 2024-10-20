package Oct.ex_18102024_Switch;

import java.util.Scanner;

public class Lab0015 {

    public static void main(String[] args) {

        // calculator that performs addition,
        //subtraction, multiplication, and division, modus based on user input using switch statements.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1");
        double number1 = scanner.nextDouble();

        System.out.println("Enter number 2");
        double number2 = scanner.nextDouble();


        System.out.println("Enter Operator (+, -, *, /)");
        char Operator = scanner.next().charAt(0);

        double result;


        switch (Operator) {

            case '+' :

                result = number1+number2;
                System.out.println(number1 +"+" + number2 + "=" + result);
                break;


            case '-' :

                result = number1-number2;
                System.out.println(number1 +"-"+ number2 + "=" + result);
                break;

            case '*' :

                result = number1*number2;
                System.out.println(number1 + "*" + number2 + "="+ result);
                break;



            case'/' :
                result = number1/number2;
                System.out.println(number1 + "/"+ number2 + "=" +result);
                break;

            default:

                System.out.println("Invalid Operator");
                break;





        }







    }
}
