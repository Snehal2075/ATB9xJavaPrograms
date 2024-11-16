package Nov.ex_11112024_Access_Modifier.Real;

public class TestCase1 extends BaseClass {


    public TestCase1(){
        super();  // Calling parent constructor
        System.out.println("DC-TC1");
    }

  public   void StartTestCase (){
        OpenBrowser("Chrome");
        CloseBrowser();

    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("My Own Logic");
        super.setBrowser(browser, isAuth);
    }

    @Override
    public String toString() {
        return "TestCase1{}";
    }
}
