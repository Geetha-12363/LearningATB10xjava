package polymerphism;

public class Method_Overloading {
    public static void main(String[] args) {
        Math_Operations m1=new Math_Operations();
        int a= m1.add(10,20);
        System.out.println(a);
        int b=m1.add(10,20,30);
        System.out.println(b);
    }
}
