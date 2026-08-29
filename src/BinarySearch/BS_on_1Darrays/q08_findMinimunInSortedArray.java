package BinarySearch.BS_on_1Darrays;

import java.util.ArrayList;

public class q08_findMinimunInSortedArray {
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

        int result = findMin(arr);

        System.out.println("Number of rotations = " + result);
    }

    public static int findMin(ArrayList<Integer> arr) {
        int s = 0;
        int e = arr.size() - 1;

        while (s < e) {
            if (arr.get(s) < arr.get(e)) {
                return arr.get(s);
            }
            int m = s + (e - s) / 2;
            if (arr.get(m) > arr.get(e)) {
                s = m + 1;
            } else {
                e = m;
            }
        }

        return arr.get(s);
    }
}
