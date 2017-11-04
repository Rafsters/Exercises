import java.util.Scanner;
import java.util.Arrays;
public class Z56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// określ dopuszczalne wartości liczbowe
        System.out.println("Generator n liczb pseudolosowych z przedziału [a,b]");
        System.out.println("===================================================");
        System.out.print("ilość liczb (n): ");
        int n = sc.nextInt();
        System.out.print("wartość minimalna (a): ");
        int a = sc.nextInt();
        System.out.print("wartość maksymalna (b): ");
        int b = sc.nextInt();
// utwórz zbiór liczb naturalnych z przedziału [a,b]
        long[] zbiorLiczb = new long[n];
        for (int i=0; i<zbiorLiczb.length; i++) {
            zbiorLiczb[i] = a + (int)(Math.random()*(b-a+1));
        }
// wyświetl liczby nieuporządkowane
        System.out.printf("liczby nieuporządkowane (%d..%d): ", a, b);
        for (long x : zbiorLiczb) {
            System.out.print(x + " ");
        }
        System.out.println();
// uporządkuj liczby
        Arrays.sort(zbiorLiczb);
// wyświetl liczby uporządkowane
        System.out.printf("liczby uporządkowane (%d..%d): ", a, b);
        for (long x : zbiorLiczb) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}