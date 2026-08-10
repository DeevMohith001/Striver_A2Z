package BinarySearch;

public class q03_upperBound {
    public static void main(String[] args) {

    }
    public static int upper(int[] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length; // Default if no element >= x exists

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > x) {
                ans = mid;       // Potential answer
                high = mid - 1;   // Look for an earlier occurrence
            } else {
                low = mid + 1;    // Search in the right half
            }
        }

        return ans;
    }
}
