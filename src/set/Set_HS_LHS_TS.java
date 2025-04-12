package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_HS_LHS_TS {
    public static void main(String[] args) {
        Set s=new HashSet();
        s.add("Apple");
        s.add("orange");
        s.add("WaterMelon");
        s.add("WaterMelon");
        s.add(null);
        s.add(123);
        System.out.println(s);
        System.out.println("_________");
        Set lhs=new LinkedHashSet();  //order will maintain and no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("WaterMelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());
        System.out.println("____________________");

        Set ts=new TreeSet();// order will maintain,natural sorting is doned
        ts.add("dapple");
        ts.add("apple");
        ts.add("orange");
        ts.add("watermelon");
        //ts.add(123);//sorting is not possible with Strings tree set,we will get"class cast exception"
        //ts.add(null); // null is not allowed in treeset,we will get null pointer exception
        System.out.println(ts);



    }
}
