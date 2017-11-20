import java.util.Calendar;
import java.util.concurrent.TimeUnit;
    /*
    Napisz program, który wyświetli: aktualną datę i godzinę, liczbę dni oraz tygodni,
     jakie upłynęły od początku roku, liczbę dni oraz tygodni, jaka pozostała do końca roku, liczbę lat,
      miesięcy, dni, godzin, minut i sekund, jaką przeżyłeś dotychczas.

     */
public class Z78 {
    public static void main(String[] args) {
        showActualDate();
        showDaysFromBeginningOfTheyearTillNow();
    }

    public static void showActualDate(){
        Calendar now = Calendar.getInstance();

        System.out.println(now.getTime());

        System.out.print(now.get(Calendar.DAY_OF_MONTH) + "." + now.get(Calendar.MONTH) + "." + now.get(Calendar.YEAR));
        System.out.println(" " + now.get(Calendar.HOUR) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));

    }
    public static void showDaysFromBeginningOfTheyearTillNow(){
        Calendar now = Calendar.getInstance();
        Calendar beginningOfTheYear = Calendar.getInstance();
        beginningOfTheYear.set(2017,0, 1, 0, 0,0);
        long timeInMillisFromBeginningOfTheYearTillNow = now.getTimeInMillis() - beginningOfTheYear.getTimeInMillis();
        System.out.println("Days from: " + beginningOfTheYear.getTime() + ", till " + now.getTime() + " : ");
        System.out.println(TimeUnit.MILLISECONDS.toDays(timeInMillisFromBeginningOfTheYearTillNow));


    }
}
