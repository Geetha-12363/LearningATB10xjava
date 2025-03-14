package loops_conditions;
import  java.util.Scanner;

public class Odd_Even_program {
    public static void main(String[] args) {
      int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
