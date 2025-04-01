package Inheritance;

public class Multilevel {
    public static void main(String[] args) {
        Son1 jeevan =new Son1();
        jeevan.bhk3();
        jeevan.fh();
        jeevan.extra();
        jeevan.home();
        Father1 f=new Father1();
        f.fh();
        f.extra();
        f.home();
        Grandfather g1=new Grandfather();
        g1.fh();
        g1.home();
    }
}
