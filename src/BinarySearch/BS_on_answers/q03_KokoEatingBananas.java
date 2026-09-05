package BinarySearch.BS_on_answers;

public class q03_KokoEatingBananas {
    public static void main(String[] args) {

    }
    static int koko(int[] piles, int h){
        int low = 1;
        int high = findMax(piles);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, mid, h)) {
                ans = mid;          // mid-works
                high = mid - 1;     // try a smaller speed
            } else {
                low = mid + 1;      // speed is too slow
            }
        }
        return ans;
    }
    public static boolean canFinish(int[] piles, int k, int h) {
        long hours = 0;
        for (int bananas : piles) {
            hours += (bananas + k - 1) / k;   // ceil(bananas / k)
        }
        return hours <= h;
    }
    // Find maximum pile size
    public static int findMax(int[] piles) {
        int max = piles[0];
        for (int bananas : piles) {
            max = Math.max(max, bananas);
        }
        return max;
    }
}
