package statickeyword;

public class Static {
    public static void main(String[] args) {
        Student s1=new Student(23);
        Student s2=new Student(33);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(s1.course_name);
        System.out.println(s2.course_name);
        Student.m1();
    }
}

class Student{

    int age;
  static   String course_name="ATB10x";
  Student(int age){
    this.age=age;
  }
  static void m1(){
      System.out.println("am a static method");
  }
}