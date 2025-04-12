package map;
import java.util.Enumeration;
import java.util.HashMap;
import  java.util.Hashtable;
class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable();
        h.put(1,"one");
        h.put(2,"two");
        h.put(3,"three");
        h.put(null,"three");//null pointer Exception
        System.out.println(h);//we can't have null in hashtable as key and value

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(3,null);
        hm.put(null,null);
        System.out.println(hm);

        Enumeration<Integer> e=h.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
