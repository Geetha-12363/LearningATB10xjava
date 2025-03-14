package loops_conditions;

import java.util.Scanner;

public class If_elseif_else {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num1");
        num1=sc.nextInt();
        System.out.println("enter the value of num2");
        num2=sc.nextInt();
        if (num1>num2) {
            System.out.println(num1);
        }
        else if(num2>num1){
            System.out.println(num2);
        }
        else{
            System.out.println("equal");
        }
    }
}
