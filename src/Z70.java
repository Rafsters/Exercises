public class Z70 {
    public static void main(String[] args) {
        isCorrect("94032814010");
        isCorrect("75646592344");
    }

    public static boolean isCorrect(String p) {
        String PESEL = p;
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

        //System.out.println(controlSum);
        // System.out.println(controlSum%10);
        if (controlSum % 10 != Character.getNumericValue(PESEL.charAt(10))) {
            validPESEL = false;
        }
        System.out.println("PESEL VALID: " + validPESEL);
        return validPESEL;
    }
}
