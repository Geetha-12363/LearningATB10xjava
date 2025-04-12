package set;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet<>();
        hs.add("orange");
        hs.add("apple");
        hs.add("Banana");
        hs.add("apple");
        System.out.println("Set elements:"+hs);
    }
}
