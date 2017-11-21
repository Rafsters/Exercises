import java.util.Scanner;

public class Z85 {

    public static void main(String[] args) {
        int r = Integer.valueOf(args[0]);
        int h = Integer.valueOf(args[1]);
        System.out.println(r);
        System.out.println(h);
        double d = (Math.PI * r * r * h) / 3;
        System.out.println("Cone volume: " + d);

    }
}
