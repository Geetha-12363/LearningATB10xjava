package statickeyword;

public class Static_p3 {
    public static void main(String[] args) {

        Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver="firefox";
        System.out.println(Automation.driver);
    }
}
class Automation{
  static  String driver="chrome";
}