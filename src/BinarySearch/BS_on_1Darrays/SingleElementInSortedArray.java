package BinarySearch.BS_on_1Darrays;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int r = search(nums);
        System.out.println(r);
    }

    public static int search(int[] nums){
        int s = 0;
        int e = nums.length-1;
        while (s<e){
            int m= s+(e-s)/2;
            if (m%2==1){
                m--;
            }
            if (nums[m] == nums[m+1]){
                s = m+2;
            }
            else {
                e = m;
            }
        }
        return nums[s];
    }
}
