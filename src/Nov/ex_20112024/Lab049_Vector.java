package Nov.ex_20112024;

import java.util.Vector;

public class Lab049_Vector {

    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Monika");
        v.add("Krishna");
        v.add("Sunita");
        v.add("Rohini");
        v.remove("Krishna");
        System.out.println(v.contains("Sunita"));
        System.out.println(v);

    }
}
