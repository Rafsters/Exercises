/*
* Przykładowe wywołanie programu:
* java OperacjeArytmetyczne 523 -68
*/
public class Z24 {
    public static void main(String[] args){
// odczyt oraz konwersja liczb do postaci numerycznej
        int liczbaA = Integer.parseInt(args[0]);
        int liczbaB = Integer.parseInt(args[1]);
// wyświetlenie rezultatów na konsoli
        System.out.print("A = " + liczbaA);
        System.out.println(", B = " + liczbaB);
        System.out.println("A + B = " + (liczbaA+liczbaB));
    }
}