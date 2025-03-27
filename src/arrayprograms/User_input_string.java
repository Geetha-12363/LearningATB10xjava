package arrayprograms;


import java.util.Scanner;

public class User_input_string {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        size=sc.nextInt();
        String[] str=new String[size];
        for(int i=0;i<str.length;i++){
            System.out.println("enter the names");
            str[i]= sc.next();
        }
        System.out.println("......");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }


    }
}
