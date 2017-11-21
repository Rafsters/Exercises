public class Z82 {
    public static void main(String[] args) {
        System.out.println(sinus(45.0));
        System.out.println(cosinus(45.0));
        System.out.println(tangens(45.0));
    }
    public static double sinus(double d){
        d = d * Math.PI/180;
        d = Math.sin(d);
        return d;
    }
    public static double cosinus(double d){
        d = d * Math.PI/180;
        d = Math.cos(d);
        return d;
    }
    public static double tangens(double d){
        d = d * Math.PI/180;
        d = Math.tan(d);
        return d;
    }

}
