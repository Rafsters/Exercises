public class Z25 {
    public static void main(String[] args) {
        double value = Double.parseDouble(args[0]);
        double usdExchangeRate = Double.parseDouble(args[1]);
        double euroExchangeRate = Double.parseDouble(args[2]);
        double echangeRate = euroExchangeRate / usdExchangeRate;
        System.out.println("Value in USD:  " + value + "\nValue in Euro: " + value * echangeRate);
    }
}
