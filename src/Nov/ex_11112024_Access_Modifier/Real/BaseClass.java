package Nov.ex_11112024_Access_Modifier.Real;

public class BaseClass {

    private String Browser;

    BaseClass() {
        System.out.println("DC-BaseClass");
    }

    public BaseClass(String b) {
        System.out.println("PC-BaseClass");
        ;
    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.Browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }

    void OpenBrowser(){
        System.out.println("Opening a Browse");
    }

    void OpenBrowser(String browserName){
        System.out.println("Open Browser!!" + browserName);  //Method Overloading
    }

    void CloseBrowser(){
        System.out.println("Closing a Browser");
    }
}
