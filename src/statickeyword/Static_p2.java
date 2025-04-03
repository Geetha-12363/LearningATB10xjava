package statickeyword;

public class Static_p2 {
    public static void main(String[] args) {
        ATB a = new ATB("meena", 91771);
       ATB a1 = new ATB("geetha", 24566);
        System.out.println(a.name);
        System.out.println(a.phoneno);
        System.out.println(a1.name);
        System.out.println(a1.phoneno);
        System.out.println(ATB.coursename);
    }

}
class ATB{
   static  String coursename="Atb";
   String name;
   int phoneno;
   ATB(String name,int phoneno){
       this.name=name;
       this.phoneno=phoneno;
   }
   void display(){
       System.out.println(name+" "+phoneno+" "+coursename);
   }
   static void m1(){
       System.out.println("am a static method");
   }
}
