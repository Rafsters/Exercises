import java.util.Scanner;

public class Z28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert first text:");
        String text1 = in.nextLine();
        System.out.println("Insert second text:");
        String text2 = in.nextLine();
        if (text1.length() > text2.length()) {
            System.out.println("Text 1 is longer");
        } else if (text1.length() < text2.length()) {
            System.out.println("Text 2 is longer");
        } else {
            System.out.println("Texts are equal");
        }
    }
}
