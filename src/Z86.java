import java.util.*;
public class Z86 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner (System.in);
        System.out.print("Podaj napis: ");
        String napis1 = klawiatura.nextLine();
        StringBuilder napis2 = new StringBuilder(napis1);
        System.out.println(napis1 + napis2.reverse());
    }
}