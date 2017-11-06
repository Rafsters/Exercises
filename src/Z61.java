import java.util.Scanner;

public class Z61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj p");
        int p = in.nextInt();
        System.out.println("Podaj q");
        int q = in.nextInt();
        int i = 2;
        if(p >= q){
            int[] array = new int[q];
            array[0] = p;
            array[1] = q;
            while(array[i-2]%array[i-1] != 0){
                array[i] = array[i-2]%array[i-1];
                System.out.println(array[i]);
                i++;
            }
            System.out.println("nwd: " + array[i-1]);
        }else {
            i = 2;
            int[] otherArray = new int[p];
            otherArray[0] = q;
            otherArray[1] = p;
            while(otherArray[i-2]%otherArray[i-1] != 0){
                otherArray[i] = otherArray[i-2]%otherArray[i-1];
                System.out.println(otherArray[i]);
                i++;
            }
            System.out.println("nwd: " + otherArray[i-1]);
        }
    }
}
