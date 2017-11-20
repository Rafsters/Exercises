import java.util.Arrays;

public class Z76 {
    public static void main(String[] args) {
        System.out.println(printIntFromRoman("MDCVII"));
    }

    public static int printIntFromRoman(String s) {
        /*
        I = 1 II = 2 III = 3 IV = 4 V = 5VI = 6VII = 7VIII = 8IX = 9 X = 10 XX = 20 XXX = 30 XL = 40 L = 50 LX = 60 LXX = 70
        LXXX = 80 XC = 90 C = 100 CC = 200 CCC = 300 CD = 400 D = 500 DC = 600 DCC = 700 DCCC = 800 CM = 900 M = 1000 MD = 1500 MM = 2000 MMM = 3000
         */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 2000, 3000};
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M", "MM", "MMM"};
        int num = 0;
        for (int i = 0; i < romanNumbers.length; i++) {
            if (Arrays.asList(s).contains(romanNumbers[i])) {
                num += numbers[i];
            }
        }


        return num;
    }

}
