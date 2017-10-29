public class Z42 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int j = 1; j <= 12; j++) {
            for (int i = 1; i <= 12; i++) {
                b =  i;
                System.out.printf("%4d", a * b);
            }
            a = j + 1;
            System.out.println();
        }
    }
}
