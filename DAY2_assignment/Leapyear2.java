class Leapyear2
{
public static void main(String args[])
{
  System.out.println("Enter a Year: ");
  int year = Integer.parseInt(args[0]);
  if(year>0)
  {
    switch(year%4)
    {
    case 0 -> System.out.println("Leap Year");
    case 1,2,3 -> System.out.println("Not a Leap Year");
    }
  }
  else
  {
    System.out.println("Invalid Year");
  }
}
}