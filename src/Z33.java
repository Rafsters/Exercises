import java.util.Scanner;
public class Z33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj wartość temperatury w stopniach Celsjusza: ");
        double tempC = sc.nextInt(); // Celsjusz
        double tempF = 32 + (9/5d)*tempC; // Fahrenheit
        double tempK = tempC + 273.15; // Kelvin
        System.out.println("* temperatura w stopniach C: " + (int)tempC);
        System.out.println("* temperatura w stopniach F: " + (int)tempF);
        System.out.println("* temperatura w stopniach K: " + (int)tempK);
    }
}