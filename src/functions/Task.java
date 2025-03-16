package functions;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        int result_add=add(a,b);
        int  result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        System.out.println(result_add);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }

}
