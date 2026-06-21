package Arrays.Easy;

public class q08_linearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int r = linearSearch(nums, target);
        System.out.println(r);
    }
    static int linearSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==target){
                return i;
            }
        }
        return -1;
    }
}
