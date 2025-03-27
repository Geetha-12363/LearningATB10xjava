package arrayprograms;
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of size");
        size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the value");
            a[i] = sc.nextInt();
            System.out.println(a[i]);
        }
            System.out.println("________");
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);

            }
        }
    }
