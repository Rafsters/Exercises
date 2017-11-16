public class Z74 {
    public static void main(String[] args) {
        wyswietlMiesiac(7);
    }
    public static void wyswietlMiesiac(int a){
        String[] miesiace = {"styczeń","luty","marzec", "kwiecien", "maj", "czerwiec", "lipiec", "sierpien", "wrzesiem", " pazdziernik", "listopad", "grudzien"};
        System.out.println(miesiace[a-1]);
    }
}
