package arrayprograms;

public class OOps_con {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        System.out.println(a);
        System.out.println(a1);
    }
}
class A{
    A(){
        System.out.println("constructor");
    }
}