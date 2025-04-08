package exceptions;

import java.lang.Exception;

public class Exception3 {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
