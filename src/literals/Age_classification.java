package literals;

public class Age_classification {
    public static void main(String[] args) {
        int age=25;
    String result= age<18?"minor":((age>65)?"adult":"senior");
        System.out.println(result);
    }
}
