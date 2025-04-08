package statickeyword;

public class Real {
    public static void main(String[] args) {
        ATB1 a=new ATB1();
    }
}
class ATB1{
    {
        System.out.println("this is iib,it will be  called whenever the object is created");
    }
    private String name;
    private String phone;
    static String course_name="Atb";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    void readDocuments(){
        System.out.println("non static method");
        System.out.println("course name");
    }
    static void doAssignment(){
        System.out.println("doAssignment");//static method can't access the non static variables
    }
}


