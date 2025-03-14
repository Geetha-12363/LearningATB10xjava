package loops_conditions;
import java.util.Scanner;
import java.sql.SQLOutput;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of side1");
        int side1=sc.nextInt();
        System.out.println("enter the value of side2");
        int side2=sc.nextInt();
        System.out.println("enter the value of side3");
        int side3=sc.nextInt();
        if(side1<=0 ||side2<=0||side3<=0) {
            System.out.println("invalid input sides must be positive");
        }
            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("the triangle is equilateral triangle");
            } else if (side1 == side2 || side2 == side1 || side3 == side1) {
                System.out.println("isocelous triangle");
            }

          else{
              System.out.println("scalene");
          }

    }
}
