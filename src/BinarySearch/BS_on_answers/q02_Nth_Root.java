package BinarySearch.BS_on_answers;

public class q02_Nth_Root {
    public static void main(String[] args) {
        int n = 3;
        int m = 28;
        System.out.println(root(n, m));
    }
    static int root(int n, int m) {
        int low = 1;
        int high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long value = (long) Math.pow(mid, n);
            if (value == m) {
                return mid;
            }
            else if (value < m) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
