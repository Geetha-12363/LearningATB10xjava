package literals;

import org.w3c.dom.ls.LSOutput;

public class Largest_3 {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        int max = (a > b) ? a : (b > c) ? a : c;
        System.out.println(max);
        int n1=2,n2=9,n3=-11;
        int largest=((n1>=n2)?((n1>=n3)?n1:n3):(n2>=n3)?n2:n3);
        System.out.println(largest);
    }

}
