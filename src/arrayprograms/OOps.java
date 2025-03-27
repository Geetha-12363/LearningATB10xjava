package arrayprograms;

public class OOps {
    public static void main(String[] args) {
        Baby b=new Baby();
        new Baby();
        new Baby();
        Baby b1;


    }
}
class Baby{
    String name;
    //default constructor
    Baby(){
        System.out.println("Iam called,object was created");
    }
    //Instance initializtion block
    {
        System.out.println("iam called,when the class is  loaded");
    }
}