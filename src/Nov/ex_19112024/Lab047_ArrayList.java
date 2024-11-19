package Nov.ex_19112024;

import java.util.ArrayList;
import java.util.List;

public class Lab047_ArrayList {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");  //0
        list.add("2"); //1
        list.add("3"); //2
        list.add("4");  // 3
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1)); // Int check
        System.out.println(list.indexOf("3"));
        System.out.println(list.indexOf("4"));

    }

}
