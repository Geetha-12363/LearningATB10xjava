package collection;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("geetha");
        al.add(123);
        al.add("jeevan");
        al.add(123);
        al.add(null);
        System.out.println(al.size());
    }
}
