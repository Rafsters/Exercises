import java.util.Scanner;

public class Z84 {
    /*
    Zapoznaj się z metodą valueOf(String, int) występującą między innymi w klasie
    opakowującej Integer. Napisz program odczytujący z konsoli liczbę w postaci łańcucha
    tekstowego oraz wielkość podstawy systemu liczbowego. Wynikiem działania programu powinna być
    liczba w systemie dziesiętnym.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number");
        String number = in.nextLine();
        System.out.println("Insert numeric system");
        int numericSystem = in.nextInt();
        System.out.println(Integer.valueOf(number, numericSystem));

    }
}
