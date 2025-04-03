package superabstraction;

public class Lab_184 {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.loan25k();
        c1.loan50k();

    }
}
abstract class Father{
    abstract void loan50k();

         void loan25k(){
             System.out.println("given 20k");
    }
}
class Child extends Father{
    void loan50k(){
        System.out.println("child will pay 50k");
    }
    void loan25k(){
        System.out.println("child will pay the loan");
    }
}