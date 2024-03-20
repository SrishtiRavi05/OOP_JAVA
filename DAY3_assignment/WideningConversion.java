class WideningConversion{
    public static void main(String[] args) {
        int a = 100;

        float b = a;
        double c = a;
        String e = String.valueOf(a);
        String f = "true";
        boolean d = Boolean.parseBoolean(f);
        double result = a+b+c;         //Widening conversion
        System.out.println("a= "+ a + "\nb= "+ b + "\nc= "+ c + "\nd= "+ d);

    }
    
}
