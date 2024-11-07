package Nov.ex_07112024_Inheritance.Single.Real;

public class TestCase1 extends CommonBaseTest {
    TestCase1(){
        System.out.println("DC - child");
    }

    void testcase(){
        start_browser();
        close_browser();
        read_Excel_File();

    }
}
