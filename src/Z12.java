public class Z12 {
    public static void main(String[] args){
        int i = 7;
        System.out.println("Powieść \"Wojna i pokój\" Lwa Tołstoja");
        System.out.println("64kB to " + 0xFFFF + " bitów");
        System.out.println("Czy 32 > 15 ? " + (32>15 ? "tak" : "nie") );
        System.out.println("\\u0042 (unicode) reprezentuje znak \u0042");
        System.out.println("7 * (2 do potęgi 3) = " + (7 << 3) );
        System.out.println("Część całkowita 2.56 wynosi " + (int) 2.56);
        System.out.println("7/2 = " + 7/2 + ", ale dlaczego?");
        System.out.println("A dlaczego 7/2d = " + 7/2d + " ?");
        System.out.println("Reszta z dzielenia 10/6 = " + 10%6);
        System.out.println("Wartość i=" + i + ", a ++i=" + (++i));
        System.out.println("Gdy teraz wykonamy operację i*=9 to i=" + (i*=9));
    }
}