package map;

import java.util.HashMap;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        Map m1=new HashMap();
        m1.put("id",1);
        m1.put("id",2);
        m1.put("id2",2);
        m1.put("id3",34);
        m1.put("id4",null);
        m1.put("id5",null);
        m1.put(null,102);
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("id2"));
        System.out.println(m1.keySet());
        System.out.println(m1.get("id3"));
    }
}
