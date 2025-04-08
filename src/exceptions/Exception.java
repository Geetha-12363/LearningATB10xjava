package exceptions;

public class Exception {
    public static void main(String[] args) {
        System.out.println("start the program");
        String ip=args[0];
        int a=Integer.parseInt(ip);
        int b=100/a;
        System.out.println("end the program");
    }
}
