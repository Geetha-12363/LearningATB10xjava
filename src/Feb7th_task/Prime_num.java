package Feb7th_task;

import java.util.StringTokenizer;

public class Prime_num {
    public static void main(String[] args) {
        int num=3;
        int count=0;
        if (num>1) {
            for (int i = 1; i<=num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                if (count==2) {
                    System.out.println("prime");
                }
                else {
                    System.out.println("not prime");
                }

        }
        else{
            System.out.println("not prime");

            }
        }
    }



