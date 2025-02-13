package arrays;

import java.util.Arrays;

public class Arrays_InterviewQ {
    public static void main(String[] args) {
        int a1[]={12,34,10,1};
        Arrays.sort(a1);
     /*  for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }*/
        System.out.println(a1[a1.length-2]);
    }
}
