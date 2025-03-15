package loops_conditions;

import java.util.Scanner;

public class Switch_basics {
    public static void main(String[] args) {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the day");
        day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("u have entered invalid day");
        }






    }
}
