package arrays;

import java.sql.SQLOutput;

public class Arrays_Foreach {
    public static void main(String[] args) {
        int a[]=new int[3];
        a[0]=90;
        a[1]=91;
        a[2]=92;
        for(int i:a){
            System.out.println(i);
        }
        String[] names={"geetha","amit","anil","jeevan"};
        for(String name:names){
            System.out.println(name);
        }
    }
}
