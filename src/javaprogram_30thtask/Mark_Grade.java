package javaprogram_30thtask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mark_Grade {
    public static void main(String[] args) {
        int marks;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  marks");
        marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks > 80 && marks == 89) {
            System.out.println("A");
        } else if (marks > 70 && marks == 79) {
            System.out.println("B");

        } else if (marks > 60 && marks == 69) {
            System.out.println("C");
        } else if (marks > 50 && marks == 59) {
            System.out.println("D");
        } else if (marks > 40 && marks == 49) {
            System.out.println("E");
        } else if (marks <40) {
            System.out.println("Fail");
        }

      else{
            System.out.println("invalid");
        }

        }

    }

