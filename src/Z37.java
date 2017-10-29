import java.util.Scanner;
public class Z37 {
    public static void main(String[] args) {
        double x1, x2; // pierwiastki równania
// odczytaj współczynniki równania z konsoli
        Scanner sc = new Scanner(System.in);
        System.out.println("Współczynniki równania kwadratowego");
        System.out.println("postaci ax2 + bx + c = 0");
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();
// jeden pierwiastek równania
        if( a == 0) {
            x1 = -c/b;
            System.out.printf("Pierwiastek równania: x = %s", x1);
            return;
        }
// wyznacz wyróżnik równania
        double delta = b*b - 4*a*c;
// wyznacz wartości pierwiastków równania
        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.printf("Pierwiastki równania: x1 = %s, x2 = %s", x1, x2);
        } else if (delta == 0) {
            x1 = -b / (2*a);
            System.out.printf("Pierwiastek równania: x = %s", x1);
        } else {
            System.out.println("Brak pierwiastków równania!");
        }
    }
}