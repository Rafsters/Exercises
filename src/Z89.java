import java.util.StringTokenizer;

public class Z89 {
    public static void main(String[] args) {
        String someEspression = "48/3*5+54-23*(34*3)";
        StringTokenizer st = new StringTokenizer(someEspression, "+*-/()");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
