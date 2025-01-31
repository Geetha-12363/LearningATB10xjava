package javaprogram_29thtask;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("given character is vowel:" +ch);
        }
        else{
            System.out.println("given character is consonant"+ch);
        }

    }
}
