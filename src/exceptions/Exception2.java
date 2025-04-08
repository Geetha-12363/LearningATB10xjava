package exceptions;

import java.lang.Exception;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println("start!");
        String s1=null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
