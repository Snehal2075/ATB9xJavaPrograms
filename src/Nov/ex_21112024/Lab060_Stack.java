package Nov.ex_21112024;

import java.util.Stack;

public class Lab060_Stack {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.add("Snehal");
        s.add("Ruhika");
        s.add("Sawant");
        System.out.println(s);

        Stack r = new Stack();
        r.push("Milk");
        r.push("Banana");
        r.push("Carrot");
        r.push("Avocado");
        System.out.println(r.size());
        System.out.println(r);
        System.out.println(r.peek());
        System.out.println(r);
        System.out.println(r.pop());
        System.out.println(r);
        System.out.println(r.add("Kiwi"));
        System.out.println(r);;
        r.add(2,"Apple");
        System.out.println(r);
    }
}
