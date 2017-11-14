public class Z66 {
    public static void main(String[] args) {
        isPerfect(29);
        isPerfect(28);
        isPerfect(6);
        isPerfect(1);
    }
    public static boolean isPerfect(int n){
        if(n <= 2 ){
            return false;
        }
        boolean perfect = false;
        int[] divedersArray = new int[n-2];
        for (int j = 1; j < n ; j++) {
            if(n%j == 0){
                divedersArray[j-1] = j;
            }
        }
        int sum = 0;
        for (int i = 0; i < divedersArray.length; i++) {
            if(divedersArray[i] > 0){
                sum += divedersArray[i];
            }
        }
        if(sum == n){
            perfect = true;
        }
        System.out.println("Perfect: " + perfect);
        return perfect;
    }
}
