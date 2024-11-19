package Nov.ex_18112024_Exceptions_part2;

public class Lab040_Multiple_catches {
    public static void main(String[] args) {
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsExceptions
            int a = Integer.parseInt(ip); //NumberFormatExceptions
            int b = 100 / a; // ArithmeticExceptions
            System.out.println(b);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("End");
        }
    }
}
