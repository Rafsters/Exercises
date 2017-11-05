import java.util.Scanner;
enum DaneOsobowe {NAZWISKO,IMIE,ADRES,KOD_POCZTOWY,MIEJSCOWOŚĆ};
public class Z57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/* zakładanie kartoteki */
// metoda values() tworzy tablicę egzemplarzy typu DaneOsobowe
        int liczbaElementowKartoteki = DaneOsobowe.values().length;
        String[] kartoteka = new String[liczbaElementowKartoteki];
/* wprowadzanie danych do kartoteki */
        System.out.println("Wprowadź dane personalne");
        for (DaneOsobowe poleDanych: DaneOsobowe.values()){
            System.out.print(poleDanych + ": ");
            kartoteka[poleDanych.ordinal()] = sc.nextLine();
        }
/* wyświetlanie danych z kartoteki */
        System.out.println("\nDANE PERSONALNE");
        System.out.printf("%s %s, %s %s, %s\n",
                kartoteka[DaneOsobowe.IMIE.ordinal()],
                kartoteka[DaneOsobowe.NAZWISKO.ordinal()],
                kartoteka[DaneOsobowe.KOD_POCZTOWY.ordinal()],
                kartoteka[DaneOsobowe.MIEJSCOWOŚĆ.ordinal()],
                kartoteka[DaneOsobowe.ADRES.ordinal()]);
    }
}