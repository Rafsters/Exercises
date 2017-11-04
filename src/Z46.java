import java.util.ArrayList;
import java.util.Scanner;

public class Z46 {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        double val;
        do {
            System.out.println("Enter some value: ");
            val = Double.parseDouble(in.next());
            values.add(val);
        } while (val != 0);
        double sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        System.out.println("Sum: " + sum);

    }
}
