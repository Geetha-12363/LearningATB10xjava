package polymerphism;

public class Method_Overriding {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.home();
        Father f1=new Father();
        f1.home();
        Father f2=new Son();//which  is called dynamic method dispatch or method overriding
        f2.home();

    }
}
