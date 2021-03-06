import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Z58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iloscZakladow;

        do {
            System.out.println("Podaj ilość zakładów");
            iloscZakladow = in.nextInt();
        } while (iloscZakladow < 1 || iloscZakladow > 8);

        int iloscLiczb = 26;
        int[][] zaklady = new int[iloscZakladow][iloscLiczb];

        for (int i = 0; i < iloscZakladow; i++) {
            int k = 49;
            int[] liczbyDoWylosowania = new int[k];

            for (int p = 0; p < liczbyDoWylosowania.length; p++) {
                liczbyDoWylosowania[p] = p + 1;
            }

            for (int j = 0; j < iloscLiczb; j++) {
                int randomIndex = ((int) (Math.random() * k));
                System.out.print("random index: " + randomIndex);
                zaklady[i][j] = liczbyDoWylosowania[randomIndex];
                System.out.print(", liczba: " + zaklady[i][j]);
                liczbyDoWylosowania[randomIndex] = liczbyDoWylosowania[k-1];
                System.out.print(", Liczby do wylosowanie: " + liczbyDoWylosowania[k - 1]);
                k--;
                System.out.print(", k-- jest równe: " + k);
                System.out.println();
            }
            Arrays.sort(zaklady[i]);
            System.out.println("=================");
        }
        System.out.println("Zakłady dużego lotka");
        System.out.println("====================");
        for (int i = 0; i < iloscZakladow; i++) {
            System.out.print((i + 1) + ". ");
            for (int j = 0; j < iloscLiczb; j++) {
                System.out.print(zaklady[i][j] + " ");
            }
            System.out.println();
        }
    }
}
