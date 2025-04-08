package Generics;

public class program1 {
    public static void main(String[] args) {
        temp(23, 25);
        temp("geetha", "tirumanyam");
        temp("geetha", 123);
        temp(true, false);
    }
        public static <T> T temp(T a,T b){
            System.out.println(a);
            System.out.println(b);
        return  null;

        }


    }

