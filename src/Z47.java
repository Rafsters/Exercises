import java.util.Scanner;

public class Z47 {
    public static void main(String[] args) {
        String PESEL;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Podaj PESEL");
            PESEL = in.next();
        }while(PESEL.length() != 11);
        boolean validPESEL = true;
        for (int i = 0; i < PESEL.length(); i++) {
            if (!Character.isDigit(PESEL.charAt(i))) {
                validPESEL = false;
            }
        }
        int controlSum = 0;
        controlSum = (Character.getNumericValue(PESEL.charAt(0)) * 9) + (Character.getNumericValue(PESEL.charAt(1)) * 7) + (Character.getNumericValue(PESEL.charAt(2)) * 3) +
                (Character.getNumericValue(PESEL.charAt(3))) + (Character.getNumericValue(PESEL.charAt(4)) * 9) + (Character.getNumericValue(PESEL.charAt(5)) * 7) + (Character.getNumericValue(PESEL.charAt(6)) * 3) +
                (Character.getNumericValue(PESEL.charAt(7))) + (Character.getNumericValue(PESEL.charAt(8)) * 9) + (Character.getNumericValue(PESEL.charAt(9)) * 7);

        System.out.println(controlSum);
        System.out.println(controlSum%10);
        if(controlSum%10 != Character.getNumericValue(PESEL.charAt(10))){
            validPESEL = false;
        }
        System.out.println("PESEL VALID: " + validPESEL);
    }
}
