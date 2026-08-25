package BinarySearch;

import java.util.ArrayList;

public class q10_HowManyTimeArrayRotated {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);

        int result = findKRotation(arr);

        System.out.println("Number of rotations = " + result);
    }
    public static int findKRotation(ArrayList<Integer> arr) {

        int s = 0;
        int e = arr.size() - 1;

        while (s < e) {

            // Current range is already sorted
            if (arr.get(s) <= arr.get(e)) {
                return s;
            }

            int m = s + (e - s) / 2;

            if (arr.get(m) > arr.get(e)) {
                // Minimum is on the right
                s = m + 1;
            } else {
                // Minimum is at m or on the left
                e = m;
            }
        }

        return s;
    }
}
