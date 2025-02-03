package stringfunctions;

public class Scp_Heap {
    public static void main(String[] args) {
        String s1 = "hello";//which is created in string constant pool
        String s2 = "hello";
        String s3=new String("hello");//which is created in heap area or object area
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        //== - meant for reference comparison
        //.equals()- meant for content comparison

    }
}