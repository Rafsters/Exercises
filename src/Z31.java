import java.util.Scanner;

public class Z31 {
    public static void main(String[] args) {
        String imie= "";
        String nazwisko = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        imie = in.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko = in.nextLine();
        System.out.println(imie.toUpperCase().charAt(0) + imie.substring(1, imie.length()) + " " + nazwisko.toUpperCase().charAt(0) + nazwisko.substring(1, imie.length()));
    }
}
