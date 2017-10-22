import java.util.Date;

public class Z22 {
    public static void main(String[] args) {
        Date teraz = new Date();
        System.out.printf("Tu %s - jest godzina %tR\n", "Radio Kraków", teraz);
        String tekst = String.format("%s %s", "Java", "Virtual Machine");
        System.out.println(tekst);
    }
}
