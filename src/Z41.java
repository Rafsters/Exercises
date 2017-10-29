import java.util.Scanner;

public class Z41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = in.nextInt();
        int x = 1;
        System.out.print("Ciąg o różnicy 3: " + x + ", ");
        for(int i=0; i<n-1; i++){
            x += 3;
            System.out.print(x + ", ");
        }
    }
}
