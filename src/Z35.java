import java.util.Scanner;
public class Z35 {
    public static void main(String[] args) {
        int liczbaNaturalna; // analizowana wartość
/* pobierz liczbę z konsoli */
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź dowolną liczbę naturalną: ");
        liczbaNaturalna = sc.nextInt();
/* sprawdź, czy liczba jest parzysta (podzielna przez 2 bez reszty) */
        boolean liczbaParzysta = liczbaNaturalna % 2 == 0 ? true : false;
/* wyświetl rezultat na konsoli */
        if (liczbaParzysta) {
            System.out.printf("Liczba %d jest parzysta", liczbaNaturalna);
        } else {
            System.out.printf("Liczba %d jest nieparzysta", liczbaNaturalna);
        }
    }
}