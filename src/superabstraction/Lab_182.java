package superabstraction;

public class Lab_182 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.display();

    }

}
class Car extends Vehicle{
    private  int maxspeed=281;

Car(){
    super(10);

}
Car(int a){
    System.out.println("this is a parameter constructoer of car");
}
void test(){
    System.out.println("test");
}
void display(){
    System.out.println("override- car");
    System.out.println(super.maxspeed);
    System.out.println(this.maxspeed);
    super.notest();
    this.test();
}
}

class Vehicle{
    int maxspeed=180;

    Vehicle(){
        System.out.println("Dc");
    }
    Vehicle(int a){
        System.out.println("pc");
    }
    void notest(){

    }
    void message(){
        System.out.println("no return, no argument");
    }
    void message(int a){
        System.out.println("no return with argument");
    }
    void display(){
        System.out.println("vehicle parent");
    }
}