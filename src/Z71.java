public class Z71 {
    public static void main(String[] args) {
        calculateTriangle(9,7,14);
    }

    public static double calculateTriangle(int a, int b, int c){
        double p = (0.5*(a + b + c));
        System.out.println(p);
        double s = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        System.out.println("Pole = " + s);
        return s;
    }
}
