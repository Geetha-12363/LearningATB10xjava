package arrayprograms;

public class Cats {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.name="tom";
        Cat c2=null;
        c2.running();
        c1.running();
       // cat c2=null;
        //new Cat(); which is object without reference
    }}
class Cat{
    String name;
    void running(){
        System.out.println("running");
    }

}