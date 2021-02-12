import java.util.Arrays;

public class Search {
    private final int[] arr = {4, 5, 6, 76, 1, 43, 46, 57, 56, 45, 7, 8, 9, 98, 6};
    //private final int[] arr = {9,8,7,6,5,4,3,2,2,1};


    public static void main(String[] args) {

        Search search = new Search();
        search.print(Arrays.toString(search.sort(search.arr, search.arr.length)));
    }

    int[] sort(int[] arr, int length) {
        int[] tempArray = new int[length];

        for (int i = 0; i <length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    print("(" + arr[i] + ":" + arr[j] + ")");
                }
            }
        }
        return tempArray;
    }

    private Boolean search(int values) {

        return false;
    }

    void print(String value) {
        System.out.println(value);
    }
}
