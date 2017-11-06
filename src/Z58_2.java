import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Z58_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 33;
        int n = 49;
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int r = (int)(Math.random()*n);
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        for (int a :
                result) {
            System.out.print(a + " ");
        }
    }
}
