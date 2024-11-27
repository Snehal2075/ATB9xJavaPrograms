package Nov.ex_21112024;

import java.util.ArrayList;
import java.util.List;

public class Lab057_Iterator {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Snehal");
        mylist.add("Ruhi");
        mylist.add("Sawant");

        System.out.println(" - To Print Arraylist 1 ");

        for (String str : mylist){
            System.out.println(str);

        }

        System.out.println(" - To Print Arraylist 2");

        for (int i = 0; i < mylist.size();i++){
            System.out.println(mylist.get(i));
        }


    }
}
