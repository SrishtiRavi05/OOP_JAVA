class Grades
{
public static void main(String args[])
{
  System.out.println("Enter marks: ");
  int marks = Integer.parseInt(args[0]);
  if((marks<0) || (marks>100))
    System.out.println("Invalid marks!!!");
  else if(marks>80)
    System.out.println("Grade A");
  else if(marks>60)
    System.out.println("Grade B");
  else if(marks>40)
    System.out.println("Grade C");
  else
    System.out.println("Grade D");
}
}