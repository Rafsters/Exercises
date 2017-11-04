import java.util.Scanner;

public class Z51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = in.nextLine();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
    }
}
