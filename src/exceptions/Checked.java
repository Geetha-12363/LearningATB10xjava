package exceptions;

public class Checked {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 1 / 0;
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        System.out.println("2");
        //printstacktrace(): full problem details along with the line number
            //getmessage(): /zero

        }
    }
}
