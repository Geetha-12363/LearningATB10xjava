
package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Interviewq1 {
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(58);
        marks.add(89);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println(Collections.reverseOrder());


    }
}
