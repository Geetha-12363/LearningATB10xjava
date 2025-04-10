package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> names=new ArrayList();
        ArrayList<Integer> ages=new ArrayList();
        String continue_input="y";
        while(continue_input.equalsIgnoreCase("y")) {
            System.out.println("enter your name");
            String name = sc.nextLine();
            names.add(name);
            System.out.println("enter your age");
            int age=sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("do yu want to enter another record");
            continue_input=sc.nextLine();


        }
         for(Object o:names){
             System.out.println(o);
         }
         for(Object o1:ages){
             System.out.println(o1);
         }
            sc.close();
    }
}
