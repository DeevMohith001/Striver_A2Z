package BinarySearch;

public class q04_Search_InsertPosition {
    public static void main(String[] args) {

    }
    public static int searchPosition(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = nums.length;
        while(s<e){
            int m = s+(e-s)/2;
            if(nums[m]>=target){
                ans = m;
                e = m-1;
            } else{
                s = m+1;
            }
        }
        return ans;
    }
}
