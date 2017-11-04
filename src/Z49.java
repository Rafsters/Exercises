import java.util.Scanner;

public class Z49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        String value = in.next();
        char[] valueDigits = value.toCharArray();
        for (int i = 0; i < valueDigits.length; i++) {
            switch (valueDigits[i]){
                case '1':
                    System.out.println("jeden");
                    break;
                case '2':
                    System.out.println("dwa");
                    break;
                case '3':
                    System.out.println("trzy");
                    break;
                case '4':
                    System.out.println("cztery");
                    break;
                case '5':
                    System.out.println("pięć");
                    break;
                case '6':
                    System.out.println("sześć");
                    break;
                case '7':
                    System.out.println("siedem");
                    break;
                case '8':
                    System.out.println("osiem");
                    break;
                case '9':
                    System.out.println("dziewięć");
                    break;
                case '0':
                    System.out.println("zero");
                    break;

            }
        }
    }
}
