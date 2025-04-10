package collection;
import  java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("geetha");
        v.add("1");
        v.add("jeevan");
        System.out.println(v);
        v.remove("1");
        System.out.println(v);
        /*vector is thread_safe and similar to Arraylist.
        all the operations  are in the vector is thread_safe.
        all the operations are done by one by one,by each thread

         */

    }
}
