public class Z73 {

    public double odchylenieStandardowe(double[] tablica){
        double suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        double srednia = suma / tablica.length;
        System.out.println("srednia" + srednia);

        int sumaRoznicyObserwacjiOdSredniejDoKwadratu = 0;
        for (int i = 0; i < tablica.length; i++) {
            sumaRoznicyObserwacjiOdSredniejDoKwadratu += Math.pow((tablica[i] - srednia),2);
        }
        double odchylenieStandardowe = Math.sqrt((sumaRoznicyObserwacjiOdSredniejDoKwadratu /(tablica.length-1)));
        return odchylenieStandardowe;
    }

    public static void main(String[] args) {
        Z73 obiekt = new Z73();
        System.out.println(obiekt.odchylenieStandardowe(new double[]{1,14,55,33}));
    }

}
