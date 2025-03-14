package loops_conditions;

import java.util.Scanner;

public class If_else_scanner {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of age");
        age=sc.nextInt();
        System.out.println(age);
        if(age>18){
            System.out.println(" ur allowed to vote");
        }
        else{
            System.out.println("ur not allowed to vote");
        }

    }
}
