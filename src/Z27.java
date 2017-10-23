import java.util.Scanner;

public class Z27 {
    public static void main(String[] args){
// pobierz tekst z konsoli
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadz dowolny tekst: ");
        String tekst = sc.nextLine();
// wyświetl tekst, dokonując konwersji na wielkie litery
        System.out.println(tekst.toUpperCase());
    }
}