import java.util.Scanner;

public class Z30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String PESEL = "";
        while(PESEL.length() != 11){
            System.out.println("Podaj PESEL");
            PESEL = in.nextLine();
        }
        if(Integer.valueOf(PESEL.charAt(9))%2 == 0){
            System.out.println("Płeć: Kobieta");
        } else{
            System.out.println("Płeć: Mężczyzna");
        }
    }
}
