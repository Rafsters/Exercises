import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Z69 {
    public static void main(String[] args) {
        double[] exchangeRateArray = new double[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < exchangeRateArray.length; i++) {
            System.out.println("Insert first exchange rate: ");
            exchangeRateArray[i] = in.nextDouble();
        }
        calculateMax(exchangeRateArray);
        calculateMin(exchangeRateArray);
        calculateMedian(exchangeRateArray);
        caluclateHarmonic(exchangeRateArray);
    }
    public static double calculateMax(double[] array){
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]){
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
        return max;
    }
    public static double calculateMin(double[] array){
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[i-1]){
                min = array[i];
            }
        }
        System.out.println("Min: " + min);
        return min;
    }

    public static double calculateMedian(double[] array){
        double median = 0;
        Arrays.sort(array);
        median = array[((array.length - 1) / 2)];
        System.out.println("Median: " + median);
        return median;
    }
    public static double caluclateHarmonic(double[] array){
        double harmonic = 0;
        // harmonic = n / 1/array[0] + 1/array[1] + ... + 1/array[n-1]
        double denominator = 0;
        for (int i = 0; i < array.length; i++) {
            denominator += 1/array[i];
        }
        harmonic = array.length/denominator;
        System.out.println("Harmonic: " + harmonic);
        return harmonic;
    }
}
