package arrayprograms;

import java.sql.SQLOutput;

public class Param_con {
    public static void main(String[] args) {
        Mobile oppo=new Mobile("oppo","2014");
        System.out.println(oppo.modelname);
        System.out.println(oppo.year);
        Mobile oneplus=new Mobile("oneplus","2020");
        System.out.println(oneplus.modelname);
        System.out.println(oneplus.year);
        oppo.display();

    }
}
class Mobile{
    String modelname;
    String year;
    Mobile(String modelname, String year){
        this.modelname=modelname;
        this.year=year;
    }
    void display(){
        System.out.println("details of models");
    }

}