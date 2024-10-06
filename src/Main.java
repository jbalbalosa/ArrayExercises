import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Using Array Exercises!");

        int[] intArray = getRandomArray();

        System.out.println("Random Array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("Sort Ascending: " + Arrays.toString(intArray));

        //Convert Array to the premitive type
        Integer[] reverseArray = Arrays.stream(intArray).boxed().toArray(Integer[]:: new);

        Arrays.sort(reverseArray, Collections.reverseOrder());
        System.out.println("Sort Descending: " + Arrays.toString(reverseArray));
    }

    private static int[] getRandomArray(){
        Random random = new Random();
        int[] newInt = new int[10];

        for (int i = 0; i < 10; i++) {
            newInt[i] = random.nextInt(100);
        }
        return  newInt;
    }

    //Manual sort
    private static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf( array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length -1; i++){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = temp;
                flag = true;
            }
        }
        return sortedArray;
    }


}
