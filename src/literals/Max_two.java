package literals;

public class Max_two {
    public static void main(String[] args) {
        String a_string=args[0];
         int a=Integer.parseInt(a_string);
         String b_String=args[1];
         int b=Integer.parseInt(b_String);
         int result=a>b?a:b;
        System.out.println(result);

    }
}
