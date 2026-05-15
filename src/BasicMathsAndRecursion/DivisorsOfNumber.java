package BasicMathsAndRecursion;

import java.util.Arrays;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int[] r = divisors(18);
        System.out.println(Arrays.toString(r));
    }

    static int[] divisors(int n){
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                count++;
            }
        }

        int[] arr = new int[count];

        int index = 0;

        // Second pass: store divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
}
