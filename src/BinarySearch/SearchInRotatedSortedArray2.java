package BinarySearch;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 1};
        int target = 0;
        boolean r = search(nums, target);
        System.out.println(r);
    }
    public static boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m] == target){
                return true;
            }if (nums[s] == nums[m] && nums[m] == nums[e]) {
                s++;
                e--;
                continue;
            }if(nums[s] <= nums[m]){
                if(nums[s] <= target && target < nums[m]){
                    e = m-1;
                } else{
                    s = m+1;
                }
            } else{
                if(nums[m] < target && target <= nums[e]){
                    s = m+1;
                } else{
                    e = m-1;
                }
            }
        }
        return false;
    }
}
