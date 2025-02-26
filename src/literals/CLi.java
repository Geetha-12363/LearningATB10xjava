package literals;

public class CLi {
    public static void main(String[] args) {
        String age_string=args[0];
        int age=Integer.parseInt(age_string);
        String name=args[1];
        String sal=args[2];
        int salary=Integer.parseInt(sal);
        System.out.println(age+""+name+""+salary);
    }
}
