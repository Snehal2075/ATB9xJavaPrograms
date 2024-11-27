package Nov.ex_21112024;

import java.util.Enumeration;
import java.util.Vector;

public class Lab066_Vector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Dates");

        for (String o : vector) {
            System.out.println("First for loop");
            System.out.println(o);}

            // We cannot use Iterator for vector because it is lecacy Class
            // Enumeration


            Enumeration<String> enumeration = vector.elements();
            while (enumeration.hasMoreElements()) {
                System.out.println("Second for loop");
                System.out.println(enumeration.nextElement());
            }
        }
    }
