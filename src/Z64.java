import java.util.Scanner;

public class Z64 {
    static void wyswietlTekst(String s) {
        System.out.print(s);
    }

    static int odczytajLiczbe() {
        Scanner klaw = new Scanner(System.in);
        return klaw.nextInt();
    }

    public static void main(String[] args) {
        int liczbaPierwsza, liczbaDruga, wynik;
        wyswietlTekst("Podaj pierwszą liczbę: "); // wywołanie metody statycznej
        liczbaPierwsza = odczytajLiczbe(); // wywołanie metody statycznej
        wyswietlTekst("Podaj drugą liczbę: "); // wywołanie metody statycznej
        liczbaDruga = odczytajLiczbe(); // wywołanie metody statycznej
        wynik = liczbaPierwsza + liczbaDruga;
        wyswietlTekst("Suma wynosi: " + wynik + "\n"); // wywołanie metody statycznej
    }
}