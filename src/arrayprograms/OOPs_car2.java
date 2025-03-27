package arrayprograms;

public class OOPs_car2 {
    public static void main(String[] args) {
        Car2 c2=new Car2();
        Car2 tesla=new Car2("tesla",2025);
        System.out.println(tesla.modelname);
        System.out.println(tesla.year);
        Car2 nano=new Car2("nano",2014);
        System.out.println(nano.modelname);
        System.out.println(nano.year);
    }
}
