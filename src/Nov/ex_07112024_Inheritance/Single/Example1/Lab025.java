package Nov.ex_07112024_Inheritance.Single.Example1;

public class Lab025 {
    public static void main(String[] args) {


        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.BHK2();   // Son  extended
        s1.BHK3();

        Father f1 = new Father();
        f1.BHK2();
       // f1.BHK3(); Father not extended



    }
}
