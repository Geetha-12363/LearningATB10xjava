package literals;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class To {
    public static void main(String[] args) {
        int num = -5;
        String result = num > 0 ? "positive" : "negative";
        System.out.println(result);
    }
}