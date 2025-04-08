package exceptions;


import java.lang.Exception;

public class try_catch_finally {
    public static void main(String[] args) {
        int a=1;
        int c=0;
        try {
            int b=10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i will be always executed");
        }
    }
}
