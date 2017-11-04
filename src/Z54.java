import java.util.ArrayList;
import java.util.Scanner;

public class Z54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(((int) (Math.random() * 6) + 1));
        }
        System.out.println("Rezultat " + n + " rzutów kostką");
        System.out.println("===============================");
        System.out.println("Liczebność Ilość");
        System.out.println("===============================");
        for (int i = 1; i < 7; i++) {
            int counter = 0;
            for (int j = 0; j < values.size(); j++) {

                if (values.get(j) == i) {
                    counter++;
                }
            }
            System.out.println(i + "    " + counter);
        }
        System.out.println("Liczby");
        for (int k :
                values) {
            System.out.print(k + ",");
        }

    }
}
