public class Z26 {
    public static void main(String[] args) {
       String name = args[0];
       double value = Double.parseDouble(args[1]);
       double TAX_RATE = 0.22;
       double tax = TAX_RATE * value;
       System.out.println("Cena " + name + " brutto: " + (value + tax) + ", podatek: " + tax);
    }
}
