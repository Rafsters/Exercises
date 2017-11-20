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
        Calendar now = Calendar.getInstance();
        Calendar firstOfJanuary = Calendar.getInstance();
        firstOfJanuary.set(2017, Calendar.JANUARY, 1,0,0,0);
        Calendar endOfTheYear = Calendar.getInstance();
        endOfTheYear.set(2017,Calendar.DECEMBER,31,23,59,59);
        Calendar birthday = Calendar.getInstance();
        birthday.set(1994,Calendar.MARCH,28,15,34,12);
        showDateValuesSinceOneDateTillAnother(firstOfJanuary.getTimeInMillis(), now.getTimeInMillis());
        showDateValuesSinceOneDateTillAnother(now.getTimeInMillis(), endOfTheYear.getTimeInMillis());
        showDateValuesSinceOneDateTillAnother(birthday.getTimeInMillis(), now.getTimeInMillis());
    }

    public static void showActualDate() {
        Calendar now = Calendar.getInstance();

        System.out.println("Actual date: " + now.getTime());

        System.out.print(now.get(Calendar.DAY_OF_MONTH) + "." + now.get(Calendar.MONTH) + "." + now.get(Calendar.YEAR));
        System.out.println(" " + now.get(Calendar.HOUR) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
        System.out.println();

    }

    public static void showDateValuesSinceOneDateTillAnother(long before, long later) {
        Calendar dateLater = Calendar.getInstance();
        Calendar dateBefore = Calendar.getInstance();

        dateLater.setTimeInMillis(later);
        dateBefore.setTimeInMillis(before);

        long timeInMillisFromBeforeTillLater = dateLater.getTimeInMillis() - dateBefore.getTimeInMillis();

        System.out.println("Time that has been passed");
        System.out.println("Since: " + dateBefore.getTime() + "\nTill: " + dateLater.getTime());
        System.out.println("Seconds: " + TimeUnit.MILLISECONDS.toSeconds(timeInMillisFromBeforeTillLater));
        System.out.println("Minutes: " + TimeUnit.MILLISECONDS.toMinutes(timeInMillisFromBeforeTillLater));
        System.out.println("Hours: " + TimeUnit.MILLISECONDS.toHours(timeInMillisFromBeforeTillLater));
        System.out.println("Days: " + TimeUnit.MILLISECONDS.toDays(timeInMillisFromBeforeTillLater));
        System.out.println("Weeks: " + TimeUnit.MILLISECONDS.toDays(timeInMillisFromBeforeTillLater)/7);
        System.out.println("Years: " + (dateLater.get(Calendar.YEAR) - dateBefore.get(Calendar.YEAR)));
        System.out.println();

    }

}
