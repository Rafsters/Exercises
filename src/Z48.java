public class Z48 {
    public static void main(String[] args) {
        String zdanie = "Pierwsze koty za płoty";
        System.out.println("Zdanie: " + zdanie);
        System.out.print("Zdanie wspak: ");
        for (int i = zdanie.length() - 1; i >= 0; i--) {
            System.out.print(zdanie.charAt(i));
        }
    }
}