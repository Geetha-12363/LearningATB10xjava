package functions;

import java.util.Scanner;

public class user_defined_one {
    public static void main(String[] args) {
        greet();
        String s=greet_with_hello();
        System.out.println(s);
        int a=age_to_vote();
        System.out.println(a);
        greet_with_name("tirumanyam");
        greet_with_full_name("geetha","tirumanyam");
        int add=add(3,4);
        System.out.println(add);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of name");
        String name=sc.next();
        System.out.println("enter the value of age");
        int age1=sc.nextInt();
        System.out.println("enter the value of salary");
        int salary=sc.nextInt();
    }
    static void greet(){
        System.out.println("hi,how are u");//without arg and without return type

    }
    static String greet_with_hello(){
        return "hi,how are you, example2";//with return type and without arg
    }
    static int age_to_vote(){
        return 18;
    }
    static void greet_with_name(String name){
        System.out.println("hi,your name is"+name); //without return type and with parameter
    }
    static void greet_with_full_name(String firstname,String lastname){
        System.out.println("hi your  full name is"+firstname+lastname);

    }
    static void greet_with_details(String name,int age,double salary) {
    System.out.println("your name is ->"+name+"\n your age is"+age+
            "\n your salary is"+ salary);
    }
    static int add(int a,int b){
        return a+b;
    }
}
