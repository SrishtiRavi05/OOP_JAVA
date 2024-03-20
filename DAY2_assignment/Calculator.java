class Calculator {
  public static void main(String[] args) {
    double result;
    System.out.println("Choose an operation: 1.addition  2.subtraction  3.multiplication  4.division ");
    int operation =Integer.parseInt(args[0]) ;

    System.out.println("Enter first number");
    double n1 = Double.parseDouble(args[1]);

    System.out.println("Enter second number");
    double n2 = Double.parseDouble(args[2]);

    switch (operation) {
      case 1:
        result = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + result);
        break;

      case 2:
        result = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + result);
        break;

      case 3:
        result = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + result);
        break;

      case 4:
        result = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}