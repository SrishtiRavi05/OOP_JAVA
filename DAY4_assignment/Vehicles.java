//import java.util.*;

class VehicleDetails
{
  private int wheels;
  private String name;
  private int vehicle_no;
  private String color;
  

  public void model(int wheels, String color)
  {
    this.wheels = wheels;
    this.color = color;
    System.out.println("no. of wheels :  "+ wheels+ " color : "+ color);
  }
  public void model(String name , int wheels)
  {
    this.name = name;
    this.wheels = wheels;
    System.out.println("name of vehicle :  "+name + " no. of wheels :  "+ wheels);
  }
  public void model(String name , int wheels , String color , int vehicle_no)
  {
    this.name = name;
    this.wheels = wheels;
    this.color = color;
    this.vehicle_no = vehicle_no;
    System.out.println("name of vehicle :  "+name + " no. of wheels :  "+ wheels+ " color : "+color +" vehicle no. : "+vehicle_no);
  }
}

public class Vehicles
{
 public static void main(String args[])
 {
/*   Scanner sc = new Scanner(System.in);

   System.out.println("name of vehicle:  ");
   String name = sc.nextLine();
   System.out.println("no. of wheels:  ");
   int wheels = sc.nextInt();
   System.out.println("vehicle no.:  ");
   int vehicle_no = sc.nextInt();
   System.out.println("color of vehicle:  ");
   String color = sc.nextLine();
*/
   VehicleDetails vd = new VehicleDetails();
   vd.model("maruti suzuki", 4);
   vd.model(4, "black");
   vd.model("BMW", 4, "BLUE",2705);
 //   vd.model();
 }
}






