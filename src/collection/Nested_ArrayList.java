package collection;
import java.util.List;
import  java.util.ArrayList;

public class Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits1=new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2=new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);


        List vegetables=new ArrayList();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("onion");
        System.out.println(vegetables);

        List Allfruits=new ArrayList();
        Allfruits.add(fruits1);
        Allfruits.add(fruits2);
        Allfruits.add(vegetables);
        System.out.println(Allfruits);
        System.out.println(Allfruits.get(0));

    }
}
