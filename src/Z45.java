import java.util.Scanner;

public class Z45 {
    public static void main(String[] args) {
        char znak;
        Scanner sc = new Scanner(System.in);

        System.out.print("liczba całkowita: ");
        String liczba = sc.nextLine();

        boolean liczbaOK = true;

        if (!Character.isDigit(liczba.charAt(0))) {
            liczbaOK = false;
        }
        if (liczba.charAt(0) == '-') {
            liczbaOK = true;
        }
        for (int i = 1; i < liczba.length(); i++) {
            if (!Character.isDigit(liczba.charAt(i))) {
                liczbaOK = false;
            }

        }

        if (liczbaOK) {
            System.out.printf("ciąg \'%s\' jest liczbą", liczba);
        } else {
            System.out.printf("ciąg \'%s\' nie jest liczbą", liczba);
        }
    }
}