public class Z88 {
    public static void main(String[] args) {
        String s1 = "kot pies kot pies kot pies kot kot kot";
        String s2 = "kot";
        String s3 = "malina";
        StringBuilder text = new StringBuilder();
        String[] s1Array = s1.split(" ");
        for (int i = 0; i < s1Array.length; i++) {
            if(s1Array[i].equals(s2)){
                s1Array[i] = s3;
            }
        }
        for (int i = 0; i < s1Array.length; i++) {
            text.append(s1Array[i] + " ");
        }
        System.out.println(text.toString());
    }
}
