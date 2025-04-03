package superabstraction;

public class Lab_187_interface_p2 {
    public static void main(String[] args) {

    P p=new P();
    p.icm1();
    p.icm2();
}}
class P implements I1,I2{
    @Override
    public void icm1() {
        System.out.println("icm1");
    }

    @Override
    public void icm2() {
       System.out.println("icm2");
    }
    public void icm3(){
        System.out.println("icm3");
    }
}
interface  I1{
   void icm1();
   void icm2();
}
interface  I2{
 void icm3();
}