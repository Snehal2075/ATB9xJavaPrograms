package Nov.ex_18112024_Exceptions_part2.Examplebank;

public class Lab044_Custom_Exceptions {
    public static void main(String[] args) {

        Bank sbi = new Bank("INR",200);
        Bank icici = new Bank("INR",400);
        System.out.println(sbi.add(icici));

        Bank Capital_One = new Bank("USD",500);
        System.out.println(sbi.add(Capital_One));
    }
}
