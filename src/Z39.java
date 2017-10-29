import java.util.Scanner;

public class Z39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj 1 liczbe: ");
        double firstNumber = in.nextDouble();
        System.out.print("Podaj druga liczbe: ");
        double secondNumber = in.nextDouble();
        System.out.print("Podaj operator: ");
        String operation = in.next();
        char operator = operation.charAt(0);
        switch (operator) {
            case '+':
                System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Zły operator");
        }
    }
}
