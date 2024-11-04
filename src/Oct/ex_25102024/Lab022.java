package Oct.ex_25102024;

public class Lab022 {

    public static void main(String[] args) {

        String s2 = "Hello";
        String s3 = "Hello";    // SCP
        String s6 = "Hello";

        String a8 = new String ("Hello");
        String a7 = new String("hello");   // OA

        // 3 Strings

        // comparision = checks the reference location

        System.out.println(s2==s3);
        System.out.println(s6==a7);

        // Equals = checks the (content) value
        // equals == value

        System.out.println(s2.equals(a7));
        System.out.println(s2.equalsIgnoreCase(a8));


    }
}
