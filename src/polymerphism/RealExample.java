package polymerphism;

public class RealExample {
    public static void main(String[] args) {
        Testcase1 t1=new Testcase1();
        t1.openbrowser();

        Testcase2 t2=new Testcase2();
        t2.openbrowser();

    }
}
class CommonToAll{
    void openbrowser(){
        System.out.println("browser will open in 5 seconds");
    }
}
class Testcase1 extends CommonToAll{

    void tc1(){
        openbrowser();
    }
        }
 class Testcase2 extends CommonToAll{
    void openbrowser(){
        System.out.println("browser will open in 2 seconds");
    }
 }