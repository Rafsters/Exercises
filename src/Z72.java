public class Z72 {
    int obliczSzescian(int liczba) { // tworzymy metodę
        return liczba * liczba * liczba;
    }
    public static void main(String[] args) {
        int n = 3;
        Z72 obiekt = new Z72(); // tworzymy obiekt
        int wynik = obiekt.obliczSzescian(n); // wywołujemy metodę
        System.out.printf("Sześcian liczby %d wynosi %d", n, wynik);
    }
}