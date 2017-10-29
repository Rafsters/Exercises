import java.util.Scanner;
public class Z44 {
    public static void main(String[] args) {
        char znak;
        Scanner sc = new Scanner(System.in);
/* wprowadzenie ciągu znaków */
        System.out.print("liczba naturalna: ");
        String liczba = sc.nextLine();
/* sprawdzenie, czy każdy znak ciągu jest cyfrą */
        boolean liczbaOK = true;
        for (int i=0; i<liczba.length(); i++) {
            znak = liczba.charAt(i);
            if (!Character.isDigit(znak))
                liczbaOK = false;
        }
/* podanie rezultatów */
        if (liczbaOK) {
            System.out.printf("ciąg \'%s\' jest liczbą",liczba);
        } else {
            System.out.printf("ciąg \'%s\' nie jest liczbą",liczba);
        }
    }
}