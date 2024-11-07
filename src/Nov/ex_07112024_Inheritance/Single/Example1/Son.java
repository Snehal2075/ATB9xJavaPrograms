package Nov.ex_07112024_Inheritance.Single.Example1;

public class Son extends Father{

    int gold_s = 700;

    void BHK3 (){
        System.out.println("3BHK");
        System.out.println(gold_f);  // Attribute of Father
        BHK2();    //        Behaviour of Son
    }
}
