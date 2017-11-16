
public class Z75 {
    public static void main(String[] args) {
        int[] arrayA = drawNumbers();
        int[] arrayB = new int[] {1,2,3,4,5,6};
        System.out.println("Your numbers: ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }
        System.out.println();
        areNumbersEqual(arrayA, arrayB);
        System.out.println("Hits: " + countHits(arrayA, arrayB));
    }

    public static boolean areNumbersEqual(int[] firstArray, int[] secondArray){
        boolean equal = true;
        boolean[] equalNumbers = new boolean[6];
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if(firstArray[i] == secondArray[j]){
                    equalNumbers[i] = true;
                }
            }
        }
        for (int i = 0; i < equalNumbers.length; i++) {
            if(equalNumbers[i] == false){
                equal = false;
            }
        }
        System.out.println("Are numbers equal: " + equal);
        return equal;
    }

    public static int countHits(int[] firstArray, int[] secondArray){
        int hit = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if(firstArray[i] == secondArray[j]){
                    hit++;
                }
            }
        }
        return hit;
    }

    public static int[] drawNumbers(){
        int[] numbers = new int[6];
        int[] possibleNumbers = new int[49];

        for (int i = 0; i < possibleNumbers.length; i++) {
            possibleNumbers[i] = i + 1;
        }
        int counter = 49;
        for (int i = 0; i < numbers.length; i++) {
            int r = ((int)((Math.random()*counter)+1));
            numbers[i] = possibleNumbers[r];
            possibleNumbers[r] = possibleNumbers[counter-1];
            counter--;
        }
        System.out.println("Random numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        return numbers;
    }
}
