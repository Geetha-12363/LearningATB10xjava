package superabstraction;

public class Lab_185 {
    public static void main(String[] args) {
    Wagnor w1=new Wagnor();
    w1.drive();
}
}
abstract class Engine {
     abstract void startengine();
     abstract  void stopengine();

 }
 class Wagnor extends Engine{
    void startengine(){
        System.out.println("start");
    }
    void stopengine(){
        System.out.println("stop");
    }
    void drive(){
        startengine();
        System.out.println("am driving");
        stopengine();
    }
 }