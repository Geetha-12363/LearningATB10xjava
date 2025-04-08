package exceptions;

import java.lang.Exception;

public class Interviewq5 {
    public static void main(String[] args) {
        int a= 0;
        try {
            a = 10/0;
                    System.out.println(a);
            System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("hello last");
        }
    }
}
