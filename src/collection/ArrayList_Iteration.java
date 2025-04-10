package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Iteration {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("pramod");
        l.add("amit");
        l.add("dutta");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        for(Object str: l){
            System.out.println(str);

        }
        Iterator iterator=l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
