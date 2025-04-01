package police;

public class Cop {
    int gun=1;
    String icard;

 public  Cop(int gun){
        this.gun=gun;
    }
  protected void canIshoot(){
        System.out.println("yes,u can shoot");
    }
}
