package Nov.ex_18112024_Exceptions_part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab042Throws_1 {
    public static void main(String[] args) {

        // Throws - Checked
        try {
            FileInputStream fileInputStream = new FileInputStream ("c+//a.log");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
