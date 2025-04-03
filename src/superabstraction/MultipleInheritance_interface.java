package superabstraction;

public class MultipleInheritance_interface {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.money();
    }
}
class Child1 implements MM1,FF1 {

    @Override
    public void money() {
        System.out.println("only -1 money");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void f1() {
        System.out.println("f1");
    }
}
    interface MM1 {
        void money();

        void m2();

    }

    interface FF1 {
        void money();

        void f1();
    }

