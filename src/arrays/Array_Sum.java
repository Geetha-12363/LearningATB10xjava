package arrays;

public class Array_Sum {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int sum=0;
       /* for(int i=0;i<a1.length;i++){
            sum=sum+a1[i];
        }
        System.out.println(sum);*/

        for(int n:a1){
            sum=sum+n;

        }
        System.out.println(sum);

    }



}
