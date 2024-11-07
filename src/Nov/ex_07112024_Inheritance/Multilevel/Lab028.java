package Nov.ex_07112024_Inheritance.Multilevel;

public class Lab028 {

    public static void main(String[] args) {

        Child c = new Child();
        c.home();
        c.gf();
        c.f();
        c.extra();


        Father f = new Father();
        f.gf();
        f.home();
        f.extra();
        f.f();


        Grandfather g = new Grandfather();
        g.gf();
        g.home();
    }
}
