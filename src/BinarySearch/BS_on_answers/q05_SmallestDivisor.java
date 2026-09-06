package BinarySearch.BS_on_answers;

public class q05_SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int t = 6;
        System.out.println(smallestDivisor(nums, t));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int h=findMax(nums);
        while(l<h){
            int m = l+(h-l)/2;
            if(div(nums, m)<=threshold){
                h=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }

    public static int div(int[] nums, int d){
        int c = 0;
        for(int i : nums){
            int x =(i+d-1)/d;
            c+=x;
        }
        return c;
    }

    static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}
