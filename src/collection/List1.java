package collection;
import java.util.LinkedList;
import  java.util.List;
import  java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
        List l=new ArrayList(5);
        List l1=new ArrayList();

        List l2=new LinkedList();
        l2.add("geetha");
        l2.add("1");
        l2.add("jeevan");
        l2.add(null);
        l2.add(true);
        l2.add(123);
        System.out.println(l2.isEmpty());
        System.out.println(l2.contains("1"));
        System.out.println(l2.size());
        System.out.println(l2.indexOf("jeevan"));
        System.out.println(l2);


    }
}
