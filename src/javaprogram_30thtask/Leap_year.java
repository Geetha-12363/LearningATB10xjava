package javaprogram_30thtask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args){
        int year;
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
     year =sc.nextInt();
    if((year%400== 0 && year%4==0) ||(year%100!=0)){
            System.out.println("given year is leap year");
        }
        else{
        System.out.println("not a leap year");
        }

    }
}
