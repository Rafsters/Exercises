import java.util.Scanner;

public class Z29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String accountNumber = "";
        while (accountNumber.length() != 26) {
            System.out.println("Please insert account number (26 digits)");
            accountNumber = in.nextLine();
        }
        System.out.println(accountNumber.substring(0, 2) + " " + accountNumber.substring(2, 6) + " " + accountNumber.substring(6, 10) + " " +
                accountNumber.substring(10, 14) + " " + accountNumber.substring(14, 18) + " " + accountNumber.substring(18, 22) + " " + accountNumber.substring(22, 26));
    }
}
