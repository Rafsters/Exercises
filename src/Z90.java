class Telefon {
    // deklaracja pól
    private String numerTelefonu;
    private int lacznyCzasRozmow;
    private static double cenaRozmowy = 0.48; // zł/min.
    // konstruktor
    public Telefon (String numer) {
        numerTelefonu = numer;
    }
    // deklaracja metod
    public double obliczKwoteDoZaplaty() {
        return cenaRozmowy * (lacznyCzasRozmow / 60 + 1);
    }
    public static void ustawCeneRozmowy(double nowaCena){
        cenaRozmowy = nowaCena;
    }
    public void zadzwon(String nrTelefonu) {
        System.out.println ("Dzwonię do: " + nrTelefonu);
        System.out.println ("Dryń, dryń...");
        System.out.println ("Rozmowa w toku...");
        int czasRozmowy = (int) (Math.random()*3600);
        lacznyCzasRozmow += czasRozmowy;
        System.out.println ("Rozmowa zakończona. ");
        System.out.printf ("Czas rozmowy: %d min. %d sek. \n",
                czasRozmowy/60, czasRozmowy%60);
    }
}
public class Z90 {
    public static void main(String[] args){
        Telefon telefonAni = new Telefon("783982331");
        Telefon telefonJarka = new Telefon("608234982");
        telefonAni.zadzwon("0124239832");
        telefonJarka.zadzwon("112");
        double kwota = telefonAni.obliczKwoteDoZaplaty();
        System.out.printf("Ania ma do zapłaty %f zł.", kwota);
    }
}