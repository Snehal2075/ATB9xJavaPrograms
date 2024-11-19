package Nov.ex_18112024_Exceptions_part2;

public class Lab038_Finally {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10 / a;
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        finally {
            System.out.println("I will be always executed");
        }; //Unchecked Exceptions
    }

}



