import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class Z52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = in.nextLine();
        String[] someTexts = text.split("\u0020");
        for (String t :
                someTexts) {
            System.out.println(t);
        }
    }
}
