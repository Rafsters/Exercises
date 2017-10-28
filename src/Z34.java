import java.util.Scanner;

public class Z34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wzrost");
        double height = in.nextDouble();
        System.out.println("Podaj wage");
        int weight = in.nextInt();
        double BMI = (weight / (height * height));
        System.out.print("BMI: " + BMI);
        if(BMI < 18.5){
            System.out.print(" niedowaga");
        } else if(BMI > 25.0){
            System.out.println(" nadwaga");
        } else{
            System.out.println(" prawidlowe");
        }
    }
}
