package Nov.ex_07112024_Inheritance.Single.Real;

public class TestCase2 extends CommonBaseTest {
    TestCase2() {
        System.out.println("DC - child");
    }

    void testcase2() {
        start_browser();
        System.out.println("T2 Executing");
        close_browser();
        read_Excel_File();


    }
}
