import java.util.Scanner;
public class Z65 {


    static int odczytajLiczbe(String s) {
        Scanner klaw = new Scanner (System.in);
        System.out.print(s);
        return klaw.nextInt();
    }
    public static void main(String[] args) {
        int liczbaPierwsza, liczbaDruga, wynik;
        liczbaPierwsza = odczytajLiczbe("Podaj pierwszą liczbę: "); // wywołanie metody statycznej
        liczbaDruga = odczytajLiczbe("Podaj pierwszą liczbę: "); // wywołanie metody statycznej
        wynik = liczbaPierwsza + liczbaDruga;
        System.out.println("Suma wynosi: " + wynik + "\n"); // wywołanie metody statycznej
    }
}