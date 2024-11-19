package Nov.ex_18112024_Exceptions_part2;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        Scanner sc = null ;
        sc = new Scanner(System.in);
       int v = sc.nextInt();
        try {
            int a = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Closing sc");
        }
        System.out.println("Hello");
        sc.close();


    }
}
