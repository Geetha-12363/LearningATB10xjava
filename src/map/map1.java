package map;
import java.util.*;

public class map1 {
    public static void main(String[] args) {
        Map m1=new HashMap();
        m1.put("name","pramod");
        m1.put("rollno","1");
        m1.put("phone","9876543210");
        System.out.println(m1);
        System.out.println("__________");
        Map m2=new LinkedHashMap();
        m2.put("name","pramod");
        m2.put("rollno","1");
        m2.put("phone","9876543210");
        System.out.println(m2);
        System.out.println("__________");
        Map m3=new TreeMap();
        m3.put("name","pramod");
        m3.put("rollno","1");
        m3.put("phone","9876543210");
        System.out.println(m3);

    }
}
