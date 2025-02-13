package arrays;

import java.util.Arrays;

public class Marks {
    public static void main(String[] args) {
        int marks[]={51,100,91,87,90};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            Arrays.sort(marks);
        }
        }
}
