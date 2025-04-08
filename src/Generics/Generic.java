package Generics;

public class Generic {
    public static void main(String[] args) {
        temp_sum(23, 26);
        temp_sum("10", "20");
    }

        static Integer temp_sum(Integer a,Integer b){
            return a+b;
        }
        static String temp_sum(String a,String b){
            return a+b;
        }

    }

