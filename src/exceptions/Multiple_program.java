package exceptions;

import java.lang.Exception;

public class Multiple_program {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        try {
            c=10/a;
            String s1=null;
            s1.trim();

        } catch (ArithmeticException  | NullPointerException ne) {
            System.out.println(ne.getMessage());
        }
        System.out.println(c);

    }
}
