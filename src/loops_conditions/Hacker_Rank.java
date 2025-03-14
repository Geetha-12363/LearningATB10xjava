package loops_conditions;

import java.util.Scanner;

public class Hacker_Rank {
    public static void main(String[] args) {
        int score;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of score");
        score=sc.nextInt();
        if(score>=90 && score<=100){
            System.out.println('A');
        }
        else if(score<=89 && score>=80){
            System.out.println('B');
        }
        else if(score>=79 && score>=70){
            System.out.println('C');

        }
        else if(score>=69 && score<=60){
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
