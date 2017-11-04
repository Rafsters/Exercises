import java.util.Scanner;
public class Z55 {
    public static void main(String[] args) {
        int kwota;
        Scanner sc = new Scanner(System.in);
/* pobierz kwotę z konsoli */
        do {
            System.out.print("Podaj kwotę w zł (1..1000): ");
            kwota = sc.nextInt();
        } while (kwota < 1 || kwota > 1000);
/* wyznacz najmniejszą możliwą liczbę monet */
        System.out.println("-----------------------");
        System.out.println("monety 5zł: " + kwota/5);
        System.out.println("monety 2zł: " + (kwota%5)/2);
        System.out.println("monety 1zł: " + (kwota%5)%2);
    }
}