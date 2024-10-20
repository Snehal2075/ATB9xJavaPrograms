package Oct.ex_15102024_Increment_Decrement;

public class Lab009 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + a++ + a++);
//     Line | Exp | a
//      6   | NA | 10
//      7   | 11 | 11
//      7   | 11 | 12
//      7  |  12 | 13
//      7  11+11+12 = 34 and a=13

        System.out.println(a);




    }
}
