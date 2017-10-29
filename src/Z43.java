import java.util.Scanner;

public class Z43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ile liczb pierwszych");
        int n = in.nextInt();
        int dzielniki = 0;
        int licznikPierwszych = 0;
        int i = 2;
        while (licznikPierwszych < n) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        dzielniki++;
                    }
                }
                if (dzielniki == 1) {
                    System.out.print(i + " ");
                    licznikPierwszych++;
                }
                dzielniki = 0;
                i++;
        }

    }
}
