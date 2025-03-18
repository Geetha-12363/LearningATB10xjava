package strings;

public class ex_concat_append {
    public static void main(String[] args) {
       String s1="hello";
       String s2="world";
        System.out.println(s1.concat(s2));

        StringBuilder sb=new StringBuilder("sonal");
        sb.append("patel");
        System.out.println(sb);

    }
}
