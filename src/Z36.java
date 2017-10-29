import java.util.Scanner;

public class Z36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj kwote: ");
        double value = in.nextDouble();
        double taxAmount = 0.00;
        if (value <= 85528) {
            taxAmount = (0.18 * value) - 556.02;
        } else{
            taxAmount = 14839 + (0.32 * (value - 85528));
        }
        System.out.println("Kwota: " + value + ", podatek: " + taxAmount);
    }
}
