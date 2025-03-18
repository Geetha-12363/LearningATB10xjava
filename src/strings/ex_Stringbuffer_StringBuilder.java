package strings;

public class ex_Stringbuffer_StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("pramod");
        sb.append("dutta");
        System.out.println(sb.reverse());
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("pramod");
        sb1.append("sharma");
        System.out.println(sb1);
        sb1.append("world!");
        System.out.println(sb1);
    }
}
