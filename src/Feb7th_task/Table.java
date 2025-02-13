package Feb7th_task;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println(a);
        for(int i=1;i<=10;i++){
            System.out.println("a*i"+"="+a*i);
        }
    }
}
