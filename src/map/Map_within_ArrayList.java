package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map_within_ArrayList {
    public static void main(String[] args) {
        HashMap<String,String> student=new HashMap<>();
        student.put("name","pramod");
        student.put("roll","1");
        student.put("phoneno","96543210");
        System.out.println(student);

        HashMap<String,String> student1=new HashMap<>();
        student1.put("name","amit");
        student1.put("roll","2");
        student1.put("phoneno","65432356");
        System.out.println(student1);

        List students=new ArrayList();
        students.add(student);
        students.add(student1);
        System.out.println(students);
    }
}
