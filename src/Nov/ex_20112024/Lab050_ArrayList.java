package Nov.ex_20112024;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab050_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("Coconut");
        list.add("Milk");
        list.add ("Bread");
        list.add("Rice");
        list.add("Cheese");
        list.add("Oil");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println("Default for loop");
        for (int i = 0; i<list.size();i++) {
            System.out.println(list.get(i));
        }

        System.out.println("for each loop");

        for (Object o : list)
            System.out.println(o);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
        System.out.println(iterator.next());
        }

    }
}
