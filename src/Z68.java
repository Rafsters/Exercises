public class Z68 {
    static void wyswietlWektor(int[] tablica){
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
    static void inwersja(int[] tablica) { // utworzenie metody statycznej
        int i = 0;
        int j = tablica.length - 1;
        int pomoc;
        while (i < j) {
            pomoc = tablica[i];
            tablica[i] = tablica[j];
            tablica[j] = pomoc;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] wektor = {4, 2, 7, 3, 9, 1, 8, 5}; // utworzenie wektora
        wyswietlWektor(wektor);
        inwersja(wektor); // wywołanie metody statycznej
        for(int liczba : wektor) // wyświetlenie zawartości wektora
            System.out.print(liczba + " ");
    }
}