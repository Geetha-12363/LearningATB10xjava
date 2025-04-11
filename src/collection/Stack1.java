package collection;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        /*Stack s=new Stack();
        s.add("pramod");
        s.add("amit");
        System.out.println(s);*/
        Stack s=new Stack();
        s.push("pramod");
        s.push("amit");
        s.push(("dutta"));
        s.push("amit2");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek()); //it will give the last element
        System.out.println(s);
        System.out.println(s.pop());  //it will remove the last element
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("snehal"));
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.add("chethan"));
        System.out.println(s.push("vijay"));
        System.out.println(s);

        System.out.println(s.get(0)); //it will give the bottom element the stack
        System.out.println(s.get(1));
    }
}
