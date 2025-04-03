package statickeyword;

public class Static_Sib {
    public static void main(String[] args) {
        A a =new A();

    }

}
class A{
    static{
        System.out.println("am the static block");
        System.out.println("static block will be called when is loaded");
    }
}