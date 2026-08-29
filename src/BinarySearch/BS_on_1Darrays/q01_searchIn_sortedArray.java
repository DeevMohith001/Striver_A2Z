package BinarySearch.BS_on_1Darrays;

public class q01_searchIn_sortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int result = binary(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    static int binary(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        while (s<=e){
            int m = s + (e-s)/2;
            if (target==nums[m]){
                return m;
            } else if (target>nums[m]) {
                s=m+1;
            } else {
                e = m-1;
            }
        }
        return -1;
    }
}
