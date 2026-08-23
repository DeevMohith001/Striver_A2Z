package BinarySearch;

public class q07_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int r = search(nums, target);
        System.out.println(r);
    }

    public static int search(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                return m;
            } if (nums[s] <= nums[m]) {

                // Target lies in the sorted left half
                if (nums[s] <= target && target < nums[m]) {
                    e = m - 1;
                }
                // Target lies in the right half
                else {
                    s = m + 1;
                }

            }
            // Right half is sorted
            else {

                // Target lies in the sorted right half
                if (nums[m] < target && target <= nums[e]) {
                    s = m + 1;
                }
                // Target lies in the left half
                else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
