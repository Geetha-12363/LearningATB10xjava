package literals;

import java.sql.SQLOutput;

public class Concat_Plus {
    public static void main(String[] args) {
        String first_name="geetha";
        String last_name="tirumanyam";
        int a=10;
        int b=10;
        System.out.println("firstname"+"lastname"+a+b);
        System.out.println(a+b+"firstname"+"lastname");
        System.out.println("firstname"+"lastname"+(a+b));
    }
}
