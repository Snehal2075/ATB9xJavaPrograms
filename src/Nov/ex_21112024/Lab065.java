package Nov.ex_21112024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab065 {
    public static void main(String[] args) {

        Set hs = new HashSet();  // Order is not maintained.

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        hs.add(123);
        System.out.println(hs);


        Set r = new LinkedHashSet();  // Order is maintained

        r.add("Apple");
        r.add("Orange");
        r.add("Watermelon");
        r.add("Watermelon");
        r.add("Kiwi");
        r.add(null);
        r.add(123);
        System.out.println(r);



        Set p = new TreeSet();  //  use only same Datatype
        p.add("Avocado");
        p.add("Kiwi");
        p.add("Muskmelon");
        p.add("Pear");
       // p.add(null);  cannot add null *
        System.out.println(p);

    }
}
