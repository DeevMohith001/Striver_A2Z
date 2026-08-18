package BinarySearch;

import java.util.ArrayList;

public class q08_findMinimunInSortedArray {
    public static void main(String[] args) {

    }

    public int findMin(ArrayList<Integer> arr) {
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
