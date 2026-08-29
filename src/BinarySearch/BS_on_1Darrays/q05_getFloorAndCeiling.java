package BinarySearch.BS_on_1Darrays;
import java.util.Arrays;
public class q05_getFloorAndCeiling {
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;

        int[] result = getFloorAndCeil(nums, x);

        System.out.println(Arrays.toString(result));

    }
        public static int[] getFloorAndCeil(int[] nums, int x) {

            // Find Floor
            int s = 0;
            int e = nums.length - 1;
            int floor = -1;

            while (s <= e) {
                int m = s + (e - s) / 2;

                if (nums[m] <= x) {
                    floor = nums[m];
                    s = m + 1;       // Search for a larger valid value
                } else {
                    e = m - 1;
                }
            }

            // Find Ceil
            s = 0;
            e = nums.length - 1;
            int ceil = -1;

            while (s <= e) {
                int m = s + (e - s) / 2;

                if (nums[m] >= x) {
                    ceil = nums[m];
                    e = m - 1;       // Search for a smaller valid value
                } else {
                    s = m + 1;
                }
            }

            return new int[]{floor, ceil};
        }
}
