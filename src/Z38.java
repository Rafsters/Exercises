import java.util.Scanner;
public class Z38 {
    public static void main(String[] args) {
/* odczytaj dane z konsoli */
        Scanner sc = new Scanner(System.in);
        System.out.print("ocena (1..6): ");
        int n = sc.nextInt();
/* wyświetl ocenę */
        System.out.print("ocena " + n + " ");
        switch(n) {
            case 1:
                System.out.println("niedostateczny");
                break;
            case 2:
                System.out.println("mierny");
                break;
            case 3:
                System.out.println("dostateczny");
                break;
            case 4:
                System.out.println("dobry");
                break;
            case 5:
                System.out.println("bardzo dobry");
                break;
            case 6:
                System.out.println("celujący");
                break;
            default:
                System.out.println("nieprawidłowa!");
        }
    }
}