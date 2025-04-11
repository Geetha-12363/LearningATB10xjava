package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Iteration {
    public static void main(String[] args) {
        List<String> l=new ArrayList();
        l.add("pramod");
        l.add("amit");
        l.add("dutta");
        System.out.println(" to print Arraylist 1");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("to print Arraylist 2");
        for(Object str: l){
            System.out.println(str);

        }
        System.out.println("to print Array list 3");
        Iterator iterator=l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("to printl Arraylist-4");
    }
}
