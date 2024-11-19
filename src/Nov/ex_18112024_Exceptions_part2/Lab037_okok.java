package Nov.ex_18112024_Exceptions_part2;

public class Lab037_okok {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
            String s1 = null;
            s1.trim();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(c); //Unchecked Exceptions

    }}
