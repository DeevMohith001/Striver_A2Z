package BasicMathsAndRecursion;

import java.util.Arrays;

public class r04_reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr, int n){
        // Base condition
        if (n <= arr.length / 2) {
            return;
        }

        // Swap elements
        int temp = arr[arr.length - n];
        arr[arr.length - n] = arr[n - 1];
        arr[n - 1] = temp;

        // Recursive call
        reverse(arr, n - 1);
    }
}
