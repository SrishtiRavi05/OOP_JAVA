class Emp{
 private String name;
 private int empid;
 private double salary;

 public void details( String name )
 {
   this.name = name;
   System.out.println("name : "+name);
 }
 public void details( String name , int empid )
 {
   this.name = name;
   this.empid = empid;
   System.out.println("name : "+name+"   "+"empid : "+empid);
 }
 public void details( String name , int empid , double salary )
 {
   this.name = name;
   this.empid = empid;
   this.salary = salary;
   System.out.println("name : "+name+"   "+"empid : "+empid+"   "+"salary : "+salary);
 }
 public void details()
 {
   System.out.println("No parameters passed!!");
 }
}

class Employee
{
 public static void main(String args[])
{
  Emp e = new Emp();
  e.details();
  e.details("Srish");
  e.details("Srish",108);
  e.details("Srish",108,2000000);
}
}






