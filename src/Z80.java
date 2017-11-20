import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Z80 {
    /*
    Firma MIKOM sp. z o.o. produkuje odkurzacze domowe. Ich sprzedażą zajmuje się dziesięciu pracowników – przedstawicieli handlowych firmy.
    Napisz program, który umożliwi pobranie z konsoli informacji o łącznej wartości sprzedaży uzyskanej przez każdego z pracowników.
    Wyświetl na konsoli wprowadzone wartości w porządku malejącym. Utwórz własne metody oraz wykorzystaj metody dostępne w klasie java.util.Arrays.
     */
    public static void main(String[] args) {
        int[] salesValues = new int[10];
        insertSalesValue(salesValues);
        printDescending(salesValues);
    }

    public static void insertSalesValue(int[] salesValue){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < salesValue.length; i++) {
            System.out.println("Insert value of Sales for employee number " + i + ": ");
            salesValue[i] = in.nextInt();
        }

    }
    public static void printDescending(int[] array){
        Arrays.sort(array);
        int employeeNubmer = 1;
        for (int i = array.length-1; i > 0; i--) {
            System.out.println(employeeNubmer + ". " + array[i]);
            employeeNubmer++;
        }
    }

}
