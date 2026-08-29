package BinarySearch.BS_on_1Darrays;

public class q02_lowerBound {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 21;
        int result = lowerBound(arr, target);
        System.out.println(result);
    }
    static int lowerBound(int[] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length; // Default if no element >= x exists

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ans = mid;        // Potential answer
                high = mid - 1;   // Look for an earlier occurrence
            } else {
                low = mid + 1;    // Search in the right half
            }
        }

        return ans;
    }
}
