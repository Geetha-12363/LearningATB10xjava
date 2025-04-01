package superkeyword;

public class Lab_181 {
    public static void main(String[] args) {
        Son s=new Son();
        s.t1();
    }
}
class Father{
    Father(){
        super();
        System.out.println("father");
    }
    int gold=100;
    void home(){
        System.out.println("father home");
    }
}
class Son extends Father{
    Son(){
        super();
    }
    void t1(){
        super.home();
        System.out.println(super.gold);
    }
}