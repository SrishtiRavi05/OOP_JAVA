class Leapyear
{
public static void main(String args[])
{
  System.out.println("Enter a four digit year: ");
  int year= Integer.parseInt(args[0]);
  if((year%4==0) || (year%400==0))
  System.out.println("Leap Year");
  else
  System.out.println("Not a Leap Year");
}
}