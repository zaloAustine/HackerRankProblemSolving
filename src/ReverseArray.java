public class ReverseArray {


    public static void main(String[] args) {

        int[] myArray = new int[]{0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(myArray, myArray.length);
    }

    static void reverse(int a[], int n) {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i]; //save
            a[i] = a[n - i - 1];// delete
            a[n - i - 1] = t; // retrive
        }

        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }

    }
}

