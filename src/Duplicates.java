import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates());
    }

    public static int removeDuplicates() {
        int[] sortedArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = 0;

        for (int j = 0; j < sortedArray.length; j++) {
            if (sortedArray[j] != sortedArray[j]) {
                sortedArray[j] = sortedArray[i];
                j++;
            }
        }
        return i + 1;
    }

    public int[] sortArray() {
        int[] stringArray = new int[120];



        return stringArray;
    }
}