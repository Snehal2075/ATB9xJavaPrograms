package Oct.ex_11102024_Operators;

public class Lab007 {
    public static void main(String[] args) {

//        Types of Operators

//        1. Assignment Operator
        int age = 20;

//        2.Arithmetic Operators
//       a) Addition Operator
        int a = 50;
        int b = 40;
        System.out.println(a+b);

//       b) Subtraction Operator
        System.out.println(a-b);

//       c) Multiplication Operator
        System.out.println(a*b);

//        d) Division
        System.out.println(a/b);

//        e) Modulo
        System.out.println(a%b);

//        3.Relational Operators -> true or false

        int c = 67;
        int d = 50;

//        a) Less than <
        boolean e = c<d;
        System.out.println(e);

//        b) Less than or equal to <=
        boolean f = c<=d;
        System.out.println(f);

//         c) Greater than >
        boolean g = c>d;
        System.out.println(g);

//        d) Greater than or equal to >=
        boolean i = c>=d;
        System.out.println(i);

//        e)Equal to ==
        boolean j = c==d;
        System.out.println(j);

//        f) Not equal to !=
        boolean k = c!=d;

//        4. Unary Operator
        int l = 76;     // + -> Unary Operator
        int m = -20;

        System.out.println(l+1);
        System.out.println(l-m);

//       5.    Logical Operators

//        a) && (AND)
        boolean p = true;
        boolean q = true;
        boolean s = p && q;
        System.out.println(s);

//        b) || ( OR )
        boolean r = p || q;
        System.out.println(r);

//        c) ! (NOT)
        System.out.println(!r);
        System.out.println(!!r);

//        6. Compound Assignment Operators
//        +=, -=, /=, *=
         int t = 20;
         t +=10;
        System.out.println(t);
         t -=40;
        System.out.println(t);
        t /= 10;
        System.out.println(t);
        t*=30;
        System.out.println(t);


















    }
}
