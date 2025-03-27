package arrayprograms;

import java.util.Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int a[]={12,34,1,10};
        System.out.println(a.length);
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}
