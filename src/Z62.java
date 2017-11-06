public class Z62 {
    public static void main(String[] args) {
        char[] samogloski = {'a', 'e', 'y', 'i', 'o', 'u'};
        char[] spolgloski = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'w', 'y', 'z'};
        StringBuilder haslo = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if(i%2 == 0){
                haslo.append(spolgloski[(int)(Math.random()*spolgloski.length)]);
            } else{
                haslo.append(samogloski[(int)(Math.random()*samogloski.length)]);
            }
        }
        System.out.println("Hasło: " + haslo);
    }
}
