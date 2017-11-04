import java.util.ArrayList;
import java.util.Scanner;

public class Z46 {
    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        while(Double.parseDouble(in.next()) != 0){
            System.out.println("Podaj liczbe");
            values.add(Double.parseDouble(in.next()));
        }
        double sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        System.out.println("Suma: " + sum);

    }
}
