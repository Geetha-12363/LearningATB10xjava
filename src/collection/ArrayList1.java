package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayList1 {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("bread");
        l.add("milk");
        l.add("butter");
        l.add("paneer");
        l.add("jam");
        l.add("cheeze");
        l.add(123);
        l.add(true);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));
        System.out.println("defult for loop");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        Iterator iterator=l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
