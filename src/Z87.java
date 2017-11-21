public class Z87 {
    public static void main(String[] args) {
        String s1 = "JANEK";
        String s2 = "aeiouy";
        boolean canAdd = true;
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(s1.toUpperCase().charAt(i) == s2.toUpperCase().charAt(j)){
                    canAdd = false;
                }
            }
            if(canAdd){
                text.append(s1.charAt(i));
            }
            canAdd = true;

        }
        System.out.println(text.toString());

    }

}
