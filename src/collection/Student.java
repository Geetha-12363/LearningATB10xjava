package collection;

public class Student {
    private  String name;
   private  String rollno;

    Student(String name,String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
  public   void printdetails(){
      System.out.println("Student name"+ this.name);
      System.out.println("Student rollno"+this.rollno);
  }
  }


