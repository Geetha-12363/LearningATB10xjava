package stringfunctions;

import java.sql.SQLOutput;

public class Example_String {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        System.out.println(s1);
        System.out.println(s2);
        String s3=s1+s2;
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2)); //It will create a new String

        StringBuffer sb1=new StringBuffer("sonal");
        sb1.append("patel");
        System.out.println(sb1);// it will not create a new string

        StringBuilder sb2=new StringBuilder("Hello");
        sb2.append("world");
        System.out.println(sb2.toString());
        sb2.reverse();
        System.out.println(sb2);
        /*stringBuilder and StringBuffer are mutable in nature if we perform append
        it will not create a newString,it will a make  changes on existing string only*/

    }
}
