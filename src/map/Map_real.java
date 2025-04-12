package map;

import java.util.*;

public class Map_real {
    public static void main(String[] args){
        Map<String,Object> student=new HashMap<>();
        student.put("name","diwakar");
        student.put("phoneno","9875643210");
        student.put("address","Bangalore");
         Set book_read_items=new HashSet();
         book_read_items.add("rich dad poor dad");
         book_read_items.add("sapaiens");
         book_read_items.add("secret");
         book_read_items.add("Atomic Habit");
         book_read_items.add("Atomic Habit");
         book_read_items.add("eat the frog");
        System.out.println(student);

        }
    }

