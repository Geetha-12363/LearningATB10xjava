package collection;
import java.util.List;
import java.util.ArrayList;

public class ArrayList_Class_Element {
    public static void main(String[] args) {
        Student s=new Student("Geetha","2");
        Student s1=new Student("jeevan","3");
        Student s2=new Student("sree","4");

        List<Student> mylist=new ArrayList();
        mylist.add(s);
        mylist.add(s1);
        mylist.add(s2);
        System.out.println(mylist);
        s.printdetails();
        s2.printdetails();
        s2.printdetails();



    }
}
