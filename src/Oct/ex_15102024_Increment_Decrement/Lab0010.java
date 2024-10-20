package Oct.ex_15102024_Increment_Decrement;

public class Lab0010 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);

//        Line No. | Exp | a
//          6      | NA |  20
//          7      | 19 |  19
//          7      | 19 |  20
//          7      | 20 |  19
//          7    Exp = 19 + 19 + 20 = 58 and value of a = 19
        System.out.println(a);
    }
}
