import java.util.Scanner;

public class Z60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilosc wyrazow ciagu Fibbonaciego do wygenerowania");
        int n = in.nextInt();
        int[] ciag = new int[n];
        ciag[0] = 0;
        ciag[1] = 1;
        for (int i = 2; i < n; i++) {
            ciag[i] = ciag[i-1] + ciag[i-2];
            System.out.println();
        }
        for (int x :
                ciag) {
            System.out.print(x + " ");
        }
    }
}
