package arrayprograms;

public class Cars {
    public static void main(String[] args) {
        car c1=new car();
        System.out.println(c1.name);
        c1.name="tesla model 3";
        System.out.println(c1.name);

    }
}
class car{
    String name;
    String model;
    int year;
    car(){
        name="unknown name";
        model="xxx";
        year=2000;

    }
}
