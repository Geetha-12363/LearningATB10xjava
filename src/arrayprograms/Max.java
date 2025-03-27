package arrayprograms;

import java.sql.SQLOutput;

class Max {
     public static void main(String[] args) {
         int[] a1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
         System.out.println(a1.length);
         int max=a1[0];
         for(int i=0;i<a1.length;i++){
             if(a1[i]>max){
                 max=a1[i];
             }
             System.out.println(max);

         }
     }
 }