package Inheritance;


public class Single {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.gold_f);
        s.bhk();
       Son2 s1=new Son2();
        System.out.println(s1.gold_f);
        s1.bhk();
    }
}