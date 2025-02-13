package arrays;

import java.util.Scanner;

public class Array_UserInput {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i <size; i++) {
            System.out.println("enter the number");
            number[i] = sc.nextInt();
        }
        for (int i=0; i<number.length-1; i++) {
            System.out.println(number[i]);

        }
    }
}