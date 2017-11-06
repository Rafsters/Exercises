public class Z59 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        while(a < 13){
            while(b<13){
                System.out.printf("%4d", a * b);
                b++;
            }
            b = 1;
            a++;
            System.out.println();
        }

    }
}
