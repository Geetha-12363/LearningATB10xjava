package javaprogram_30thtask;

import java.sql.SQLOutput;

public class Maximum_Three {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        if(a>b && a>c){
            System.out.println("a is larger");
        }
        else if(b>a && b>c){
            System.out.println("b is larger");

        }
        else{
            System.out.println(" c is larger");
        }
    }
}
