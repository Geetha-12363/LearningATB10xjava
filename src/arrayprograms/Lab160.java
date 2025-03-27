package arrayprograms;

public class Lab160 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "geetha";
        s.rollno = 21;
        s.sleep();
    }
}
class Student{
    String name;
    int rollno;
    void sleep() {
        System.out.println("sleeping");
    }

    }
