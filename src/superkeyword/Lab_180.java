package superkeyword;

public class  Lab_180{
    public static void main(String[] args) {
        Testcase1 t1=new Testcase1("chrome");
        t1.openBrowser();
        t1.closeBrowser();
        System.out.println(t1.getBrowser());
        Testcase1 t2=new Testcase1("edge");
        System.out.println(t2.getBrowser());
    }
}

class Base {
    private String browser;

    public Base(String browser) {
        this.browser=browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAdmin) {
        if(isAdmin){
            this.browser = browser;
        } else {
            System.out.println("change browser not allowed, not a admin");
        }
    }
    void openBrowser(){
        System.out.println("open browser");
    }
    void openBrowser(String browser){
        System.out.println("open browser" +browser);
    }
    void closeBrowser(){
        System.out.println("close browser!");
    }
}
class Testcase1 extends Base{
    public Testcase1(String browser){
        super(browser);
    }
    public void setBrowser(String browser,boolean isAdmin){
        System.out.println("overriden the parent set browser" );
    }
}