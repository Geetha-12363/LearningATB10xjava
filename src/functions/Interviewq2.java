package functions;
import  java.util.Scanner;
public class Interviewq2 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
      int  b=sc.nextInt();
        int result=add(a,b);
        System.out.println(result);

    }
    static int add(int a,int b){
            return a+b;
        }
    }

