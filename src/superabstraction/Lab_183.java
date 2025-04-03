package superabstraction;

public class Lab_183 {
  public static void main(String[] args) {
    CBA c1=new CBA();
    c1.display();
  }
    }
class  ABC{
  protected int  gold=10;


}
class CBA extends ABC {
  void display() {
    System.out.println(super.gold);
  }
}

