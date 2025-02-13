package arrays;

public class Array_max {
    public static void main(String[] args) {
        int a[]={25,14,56,15,36,56,77,18,29,49};
        int max=a[0],min=a[0];
        for(int i=0;i<a.length;i++) {
            if (a[i]>max) {
                max = a[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
