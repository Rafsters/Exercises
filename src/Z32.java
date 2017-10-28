import java.util.Scanner;

public class Z32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wzrost w cm");
        int height = in.nextInt();
        System.out.println("Wzrost w cm: " + height + " , wzrost w stopach: " + (height / 30.48) + ", wzrost w calach: " + (height / 2.54));
    }
}
