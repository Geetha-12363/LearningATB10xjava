package superabstraction;

public class Lab_186_Interface {
    public static void main(String[] args) {
      S  c1=new S();
      c1.drive();
    }
}
 class S implements Event,Brake {
    void drive(){
        startengine();
        applybreak();
        stopengine();
    }

     @Override
     public void applybreak() {
         System.out.println("apply break");
     }

     @Override
     public void startengine() {
         System.out.println("start engine");
     }

     @Override
     public void stopengine() {
         System.out.println("stop engine");

     }

 }interface Event {
         void startengine();

         void stopengine();
     }

     interface Brake {
         void applybreak();
     }


