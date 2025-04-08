package exceptions;

import java.lang.Exception;

public class EC {
    public static void main(String[] args) {
        String ip = null;
        try {
            ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100 / a;
            ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}