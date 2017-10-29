import java.util.Scanner;
public class Z40 {
    public static void main(String[] args) {
        long silnia = 1;
/* odczytaj dane z konsoli */
        Scanner sc = new Scanner(System.in);
        System.out.print("Liczba naturalna (1..20): ");
        int n = sc.nextInt();
/* oblicz wartość silni */
        for (int i=1; i<=n; i++) {
            silnia *= i;
        }
/* wyświetl rezultaty */
        System.out.println(n + "! = " + silnia);
    }
}