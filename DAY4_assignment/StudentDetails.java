//import java.util.*;

class Student
{
 private String name;
 private int rollno;

 public void setData(String name, int rollno)
 {
    this.name = name;
    this.rollno = rollno;
 }
 public void getData()
 {
    System.out.println("name : "+ name+" rollno : "+rollno);
 }
}

public class StudentDetails
{
//private static Scanner sc = new Scanner(System.in);
public static void main(String args[])
{
  Student s1 = new Student();
//  s1.setData(sc.nextLine(), sc.nextInt());
  s1.setData("Srish", 108);
  s1.getData();
}
}